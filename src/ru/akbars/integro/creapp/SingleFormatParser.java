package ru.akbars.integro.creapp;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import ru.akbars.integro.dao.SingleFormatMapper;
import ru.creditregistry._2010.webservice.singleformat.request.ProcessRequestOut;
import ru.creditregistry._2010.webservice.singleformat.response.SINGLEFORMAT;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class SingleFormatParser {
    private static final String SEPARATOR = ";";
    public static final Logger log = Logger.getLogger(SingleFormatParser.class);

    public int parseProcessRequest(RequestData requestData, Long creId, ProcessRequestOut iOut, SingleFormatMapper sfMapper)
            throws SAXException, IOException, ParserConfigurationException, JAXBException, CRECallException, PersistenceException, NullPointerException {
        Long rtdmId = requestData.getRtdmId();
        log.debug("Starting parseProcessRequest with this RTDM_ID = " + rtdmId + " AND CRE_ID = " + creId + " AND THIS APPLICANTID = " + requestData.getApplicantId() + " AND THIS METHOD = " + requestData.getIntegroMethod());
        String response = iOut.getResponse().toString();
        String applicantId = requestData.getApplicantId();
        int startind = response.lastIndexOf("<SINGLE_FORMAT>");
        int endind = response.lastIndexOf("</SINGLE_FORMAT>") + 16;
        String xml = response.substring(startind, endind);

        log.debug("CRE RESPONSE : ");
        log.debug(xml);
        SINGLEFORMAT singleFormat = null;

        JAXBContext jc = JAXBContext.newInstance("ru.creditregistry._2010.webservice.singleformat.response");
        Unmarshaller u = jc.createUnmarshaller();

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new InputSource(new StringReader(xml)));
        singleFormat = (SINGLEFORMAT) u.unmarshal(doc);
        StringBuilder extBuilder = new StringBuilder();
        StringBuilder isBuilder = new StringBuilder();

        if (singleFormat.getSECONDARY() != null) {
            ru.creditregistry._2010.webservice.singleformat.response.SecondaryType iSecondary = singleFormat
                    .getSECONDARY();
            if (iSecondary.getRESPONSESTATUS().equals("3")) {
                throw new CRECallException();
            }
        }

        if (singleFormat.getMAIN() != null) {
            log.debug("MAIN INSERT");
            ru.creditregistry._2010.webservice.singleformat.response.MainType iMain = singleFormat.getMAIN();
            Long iMainId = sfMapper.nextCreMainId();
            extBuilder.setLength(0);

            if (iMain.getEXTENSION() != null) {
                extBuilder.append(iMain.getEXTENSION().getITEMCOUNT());
                extBuilder.append(SEPARATOR);
                for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iMain.getEXTENSION().getITEM()) {
                    extBuilder.append(iItemType.getCODE());
                    extBuilder.append(SEPARATOR);
                    extBuilder.append(iItemType.getTEXT());
                    extBuilder.append(SEPARATOR);
                }

            }

            String iExtension = extBuilder.toString();

            isBuilder.setLength(0);

            if (iMain.getINFOSOURCES() != null) {
                for (String iSources : iMain.getINFOSOURCES().getSOURCE()) {
                    isBuilder.append(iSources);
                    isBuilder.append(SEPARATOR);
                }

            }

            String infoSources = isBuilder.toString();

            sfMapper.insertMain(iMainId, rtdmId, creId, iMain, iExtension, infoSources, applicantId);

            if (singleFormat.getMAIN().getCONNECTORDATADETAILS() != null) {
                log.debug("CDD INSERT");
                for (ru.creditregistry._2010.webservice.singleformat.response.ConnectorDataDetailType iCDD : singleFormat
                        .getMAIN().getCONNECTORDATADETAILS().getCONNECTORDATADETAIL()) {
                    Long CDDID = sfMapper.nextCDDId();
                    sfMapper.insertCDD(CDDID, rtdmId, creId, iCDD, applicantId);
                }
            }
        }

        if (singleFormat.getSECONDARY() != null) {
            log.debug("SECONDARY INSERT");
            ru.creditregistry._2010.webservice.singleformat.response.SecondaryType iSecondary = singleFormat
                    .getSECONDARY();
            Long secondaryId = sfMapper.nextCreSecId();

            extBuilder.setLength(0);

            if (iSecondary.getEXTENSION() != null) {
                extBuilder.append(iSecondary.getEXTENSION().getITEMCOUNT());
                extBuilder.append(SEPARATOR);
                for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iSecondary.getEXTENSION().getITEM()) {
                    extBuilder.append(iItemType.getCODE());
                    extBuilder.append(SEPARATOR);
                    extBuilder.append(iItemType.getTEXT());
                    extBuilder.append(SEPARATOR);
                }


            }

            String iExtension = extBuilder.toString();

            isBuilder.setLength(0);

            if (iSecondary.getINFOSOURCES() != null) {
                for (String iSources : iSecondary.getINFOSOURCES().getSOURCE()) {
                    isBuilder.append(iSources);
                    isBuilder.append(SEPARATOR);
                }

            }

            String infoSources = isBuilder.toString();

            sfMapper.insertSecondary(secondaryId, rtdmId, creId, iSecondary, iExtension, infoSources, applicantId);
        }

        if (singleFormat.getGENERAL() != null) {
            log.debug("GENERAL INSERT");
            ru.creditregistry._2010.webservice.singleformat.response.GeneralType iGeneral = singleFormat.getGENERAL();
            Long generalId = sfMapper.nextCreGenID();

            extBuilder.setLength(0);

            if (iGeneral.getEXTENSION() != null) {
                extBuilder.append(iGeneral.getEXTENSION().getITEMCOUNT());
                extBuilder.append(SEPARATOR);
                for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iGeneral.getEXTENSION().getITEM()) {
                    extBuilder.append(iItemType.getCODE());
                    extBuilder.append(SEPARATOR);
                    extBuilder.append(iItemType.getTEXT());
                    extBuilder.append(SEPARATOR);
                }


            }

            String iExtension = extBuilder.toString();

            sfMapper.insertGeneral(generalId, rtdmId, creId, iGeneral, iExtension, applicantId);
        }

        if (singleFormat.getNAMES() != null) {
            log.debug("NAMES INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.NameType iName : singleFormat.getNAMES()
                    .getNAME()) {
                Long nameId = sfMapper.nextCreNameId();

                extBuilder.setLength(0);

                if (iName.getEXTENSION() != null) {
                    extBuilder.append(iName.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iName.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iName.getINFOSOURCES() != null) {
                    for (String iSources : iName.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertName(nameId, rtdmId, creId, iName, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getDOCUMENTS() != null) {
            log.debug("DOCUMENTS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.DocumentType iDocument : singleFormat
                    .getDOCUMENTS().getDOCUMENT()) {
                Long documentId = sfMapper.nextCreDocID();

                extBuilder.setLength(0);

                if (iDocument.getEXTENSION() != null) {
                    extBuilder.append(iDocument.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iDocument.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iDocument.getINFOSOURCES() != null) {
                    for (String iSources : iDocument.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertDocument(documentId, rtdmId, creId, iDocument, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getADDRESSES() != null) {
            log.debug("ADDRESS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.AddressType iAddress : singleFormat
                    .getADDRESSES().getADDRESS()) {
                Long addressId = sfMapper.nextCreAdrID();

                extBuilder.setLength(0);

                if (iAddress.getEXTENSION() != null) {
                    extBuilder.append(iAddress.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iAddress.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iAddress.getINFOSOURCES() != null) {
                    for (String iSources : iAddress.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertAddress(addressId, rtdmId, creId, iAddress, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getPHONES() != null) {
            log.debug("PHONES INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.PhoneType iPhone : singleFormat.getPHONES()
                    .getPHONE()) {
                Long phoneId = sfMapper.nextCrePhoneId();

                extBuilder.setLength(0);

                if (iPhone.getEXTENSION() != null) {
                    extBuilder.append(iPhone.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iPhone.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                sfMapper.insertPhone(phoneId, rtdmId, creId, iPhone, iExtension, applicantId);
            }
        }

        if (singleFormat.getEMPLOYMENTS() != null) {
            log.debug("EMPLOYMENTS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.EmploymentType iEmployment : singleFormat
                    .getEMPLOYMENTS().getEMPLOYMENT()) {
                Long employmentId = sfMapper.nextCreEmplId();

                extBuilder.setLength(0);

                if (iEmployment.getEXTENSION() != null) {
                    extBuilder.append(iEmployment.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iEmployment.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iEmployment.getINFOSOURCES() != null) {
                    for (String iSources : iEmployment.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertEmployment(employmentId, rtdmId, creId, iEmployment, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getLOANSOVERVIEW() != null) {
            log.debug("LOANSOVERVIEW INSERT");
            ru.creditregistry._2010.webservice.singleformat.response.LoansOverviewType iLoansOverview = singleFormat
                    .getLOANSOVERVIEW();
            Long loanOvId = sfMapper.nextCreLoanOVId();

            extBuilder.setLength(0);

            if (iLoansOverview.getEXTENSION() != null) {
                extBuilder.append(iLoansOverview.getEXTENSION().getITEMCOUNT());
                extBuilder.append(SEPARATOR);
                for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iLoansOverview.getEXTENSION().getITEM()) {
                    extBuilder.append(iItemType.getCODE());
                    extBuilder.append(SEPARATOR);
                    extBuilder.append(iItemType.getTEXT());
                    extBuilder.append(SEPARATOR);
                }

            }

            String iExtension = extBuilder.toString();

            isBuilder.setLength(0);

            if (iLoansOverview.getINFOSOURCES() != null) {
                for (String iSources : iLoansOverview.getINFOSOURCES().getSOURCE()) {
                    isBuilder.append(iSources);
                    isBuilder.append(SEPARATOR);
                }

            }

            String infoSources = isBuilder.toString();

            sfMapper.insertLoansOverview(loanOvId, rtdmId, creId, iLoansOverview, iExtension, infoSources, applicantId);
        }

        if (singleFormat.getLOANS() != null) {
            log.debug("LOANS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.LoanType iLoan : singleFormat.getLOANS().getLOAN()) {
                Long loanId = sfMapper.nextCreLoanId();
                extBuilder.setLength(0);

                if (iLoan.getEXTENSION() != null) {
                    extBuilder.append(iLoan.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iLoan.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iLoan.getINFOSOURCES() != null) {
                    for (String iSources : iLoan.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                String iLoanType = iLoan.getTYPE();

                // ������� 1: ���� TYPE = null, �� TYPE = 99 (����������)
                if (iLoanType == null) {
                    iLoanType = "99";
                }

                String iLoanStatus = iLoan.getSTATUS();

                // ������� 2: ���� (STATUS = null) && ((OUTSTANDING > 0) || (FINAL_PMT_DATE > today && FACT_CLOSE_DATE = null)),
                // �� STATUS = 00 (��������),
                // ����� STATUS = 13 (���� ������)
                if (iLoanStatus == null) {
                    Double iLoanOutstanding = null;
                    Date iFinalPmtDate = null;
                    Date iFactCloseDate = null;
                    Date today = new Date();

                    if (iLoan.getOUTSTANDING() == null) {
                        iLoanOutstanding = 0.0;
                    } else {
                        iLoanOutstanding = iLoan.getOUTSTANDING().doubleValue();
                    }

                    SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");

                    try {
                        if (iLoan.getFINALPMTDATE() != null) {
                            iFinalPmtDate = formatter.parse(iLoan.getFINALPMTDATE());
                        }

                        if (iLoan.getFACTCLOSEDATE() != null) {
                            iFactCloseDate = formatter.parse(iLoan.getFACTCLOSEDATE());
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    try {
                        if (iLoanOutstanding > 0 || (iFinalPmtDate.after(today) && iFactCloseDate == null)) {
                            iLoanStatus = "00";
                        } else {
                            iLoanStatus = "13";
                        }
                    } catch (Exception e) {
                        iLoanStatus = "00";
                    }
                }

                sfMapper.insertLoan(loanId, rtdmId, creId, iLoan, iExtension, infoSources, applicantId, iLoanType, iLoanStatus);

                if (iLoan.getMONTHLYDETAILS() != null) {
                    log.debug("MONTHLYDATAILS INSERT");
                    for (ru.creditregistry._2010.webservice.singleformat.response.MonthlyDetailType iMDType : iLoan.getMONTHLYDETAILS().getMONTHLYDETAIL()) {
                        Long mdId = sfMapper.nextCreMDId();

                        extBuilder.setLength(0);

                        if (iMDType.getEXTENSION() != null) {
                            extBuilder.append(iMDType.getEXTENSION().getITEMCOUNT());
                            extBuilder.append(SEPARATOR);
                            for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iMDType.getEXTENSION().getITEM()) {
                                extBuilder.append(iItemType.getCODE());
                                extBuilder.append(SEPARATOR);
                                extBuilder.append(iItemType.getTEXT());
                                extBuilder.append(SEPARATOR);
                            }

                        }

                        String iExtensionMD = extBuilder.toString();

                        isBuilder.setLength(0);

                        if (iMDType.getINFOSOURCES() != null) {
                            for (String iSources : iMDType.getINFOSOURCES().getSOURCE()) {
                                isBuilder.append(iSources);
                                isBuilder.append(SEPARATOR);
                            }

                        }

                        String infoSourcesMD = isBuilder.toString();

                        sfMapper.insertMD(mdId, rtdmId, creId, iMDType, iExtensionMD, infoSourcesMD, applicantId, loanId);
                    }
                }

                if (iLoan.getLEGALS() != null) {
                    log.debug("LEGALS INSERT");
                    for (ru.creditregistry._2010.webservice.singleformat.response.LegalType iLegal : iLoan.getLEGALS().getLEGAL()) {

                        Long legalId = sfMapper.nextCreLegId();

                        extBuilder.setLength(0);

                        if (iLegal.getEXTENSION() != null) {
                            extBuilder.append(iLegal.getEXTENSION().getITEMCOUNT());
                            extBuilder.append(SEPARATOR);
                            for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iLegal.getEXTENSION().getITEM()) {
                                extBuilder.append(iItemType.getCODE());
                                extBuilder.append(SEPARATOR);
                                extBuilder.append(iItemType.getTEXT());
                                extBuilder.append(SEPARATOR);
                            }

                        }

                        String iExtensionLG = extBuilder.toString();

                        isBuilder.setLength(0);

                        if (iLegal.getINFOSOURCES() != null) {
                            for (String iSources : iLegal.getINFOSOURCES().getSOURCE()) {
                                isBuilder.append(iSources);
                                isBuilder.append(SEPARATOR);
                            }

                        }

                        String infoSourcesLG = isBuilder.toString();

                        sfMapper.insertLoanLegal(legalId, rtdmId, creId, iLegal, iExtensionLG, infoSourcesLG, applicantId, loanId);
                    }
                }

                if (iLoan.getBANKGUARANTEES() != null) {
                    log.debug("BANKGUARANTEES INSERT");
                    for (ru.creditregistry._2010.webservice.singleformat.response.BankGuaranteeType iBankGuarantee : iLoan.getBANKGUARANTEES().getBANKGUARANTEE()) {

                        Long bankGId = sfMapper.nextCreBankGId();

                        extBuilder.setLength(0);

                        if (iBankGuarantee.getEXTENSION() != null) {
                            extBuilder.append(iBankGuarantee.getEXTENSION().getITEMCOUNT());
                            extBuilder.append(SEPARATOR);
                            for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iBankGuarantee.getEXTENSION().getITEM()) {
                                extBuilder.append(iItemType.getCODE());
                                extBuilder.append(SEPARATOR);
                                extBuilder.append(iItemType.getTEXT());
                                extBuilder.append(SEPARATOR);
                            }

                        }

                        String iExtensionBG = extBuilder.toString();

                        isBuilder.setLength(0);

                        if (iBankGuarantee.getINFOSOURCES() != null) {
                            for (String iSources : iBankGuarantee.getINFOSOURCES().getSOURCE()) {
                                isBuilder.append(iSources);
                                isBuilder.append(SEPARATOR);
                            }

                        }

                        String infoSourcesBG = isBuilder.toString();

                        sfMapper.insertBankGuarantee(bankGId, rtdmId, creId, iBankGuarantee, iExtensionBG, infoSourcesBG, applicantId, loanId);

                    }

                }

                if (iLoan.getPAYMENTS() != null) {
                    log.debug("PAYMENTS INSERT");
                    for (ru.creditregistry._2010.webservice.singleformat.response.PaymentType iPType : iLoan.getPAYMENTS().getPAYMENT()) {
                        Long payId = sfMapper.nextCrePayId();

                        extBuilder.setLength(0);

                        if (iPType.getEXTENSION() != null) {
                            extBuilder.append(iPType.getEXTENSION().getITEMCOUNT());
                            extBuilder.append(SEPARATOR);
                            for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iPType.getEXTENSION().getITEM()) {
                                extBuilder.append(iItemType.getCODE());
                                extBuilder.append(SEPARATOR);
                                extBuilder.append(iItemType.getTEXT());
                                extBuilder.append(SEPARATOR);
                            }

                        }

                        String iExtensionPay = extBuilder.toString();

                        isBuilder.setLength(0);

                        if (iPType.getINFOSOURCES() != null) {
                            for (String iSources : iPType.getINFOSOURCES().getSOURCE()) {
                                isBuilder.append(iSources);
                                isBuilder.append(SEPARATOR);
                            }

                        }

                        String infoSourcesPay = isBuilder.toString();

                        sfMapper.insertPay(payId, rtdmId, creId, iPType, iExtensionPay, infoSourcesPay, applicantId, loanId);
                    }
                }

                if (iLoan.getAMENDMENTS() != null) {
                    log.debug("AMENDMENTS INSERT");
                    for (ru.creditregistry._2010.webservice.singleformat.response.AmendmentType iAType : iLoan.getAMENDMENTS().getAMENDMENT()) {
                        Long amendId = sfMapper.nextCreAmendId();

                        extBuilder.setLength(0);

                        if (iAType.getEXTENSION() != null) {
                            extBuilder.append(iAType.getEXTENSION().getITEMCOUNT());
                            extBuilder.append(SEPARATOR);
                            for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iAType.getEXTENSION().getITEM()) {
                                extBuilder.append(iItemType.getCODE());
                                extBuilder.append(SEPARATOR);
                                extBuilder.append(iItemType.getTEXT());
                                extBuilder.append(SEPARATOR);
                            }

                        }

                        String iExtensionAmend = extBuilder.toString();

                        isBuilder.setLength(0);

                        if (iAType.getINFOSOURCES() != null) {
                            for (String iSources : iAType.getINFOSOURCES().getSOURCE()) {
                                isBuilder.append(iSources);
                                isBuilder.append(SEPARATOR);
                            }

                        }

                        String infoSourcesAmend = isBuilder.toString();

                        sfMapper.insertAmend(amendId, rtdmId, creId, iAType, iExtensionAmend, infoSourcesAmend, applicantId, loanId);
                    }
                }

            }

        }

        if (singleFormat.getINQUIRIES() != null) {
            log.debug("INQUIRIES INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.InquiryType iInquiry : singleFormat
                    .getINQUIRIES().getINQUIRY()) {
                Long inquiryId = sfMapper.nextCreInqId();

                extBuilder.setLength(0);

                if (iInquiry.getEXTENSION() != null) {
                    extBuilder.append(iInquiry.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iInquiry.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iInquiry.getINFOSOURCES() != null) {
                    for (String iSources : iInquiry.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertInquiry(inquiryId, rtdmId, creId, iInquiry, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getLEGALS() != null) {
            log.debug("LEGALS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.LegalType iLegal : singleFormat.getLEGALS()
                    .getLEGAL()) {
                Long legalId = sfMapper.nextCreLegId();

                extBuilder.setLength(0);

                if (iLegal.getEXTENSION() != null) {
                    extBuilder.append(iLegal.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iLegal.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iLegal.getINFOSOURCES() != null) {
                    for (String iSources : iLegal.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertLegal(legalId, rtdmId, creId, iLegal, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getBANKRUPTCIES() != null) {
            log.debug("BANKRUPTIES INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.BankruptcyType iBankruptcy : singleFormat
                    .getBANKRUPTCIES().getBANKRUPTCY()) {
                Long bankId = sfMapper.nextCreBankID();

                extBuilder.setLength(0);

                if (iBankruptcy.getEXTENSION() != null) {
                    extBuilder.append(iBankruptcy.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iBankruptcy.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iBankruptcy.getINFOSOURCES() != null) {
                    for (String iSources : iBankruptcy.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertBankruptcy(bankId, rtdmId, creId, iBankruptcy, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getOFFICIALS() != null) {
            log.debug("OFFICIALS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.OfficialType iOfficial : singleFormat
                    .getOFFICIALS().getOFFICIAL()) {
                Long offId = sfMapper.nextCreOffId();

                extBuilder.setLength(0);

                if (iOfficial.getEXTENSION() != null) {
                    extBuilder.append(iOfficial.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iOfficial.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iOfficial.getINFOSOURCES() != null) {
                    for (String iSources : iOfficial.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertOfficial(offId, rtdmId, creId, iOfficial, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getSCORES() != null) {
            log.debug("SCORES INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.ScoreType iScore : singleFormat.getSCORES()
                    .getSCORE()) {
                Long scoreId = sfMapper.nextCreScoreId();

                extBuilder.setLength(0);

                if (iScore.getEXTENSION() != null) {
                    extBuilder.append(iScore.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iScore.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iScore.getINFOSOURCES() != null) {
                    for (String iSources : iScore.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertScore(scoreId, rtdmId, creId, iScore, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getBUSINESSES() != null) {
            log.debug("BUSINESS INSERT");
            for (ru.creditregistry._2010.webservice.singleformat.response.BusinessType iBusinessType : singleFormat.getBUSINESSES().getBUSINESS()) {
                Long businessId = sfMapper.nextCreBusId();

                extBuilder.setLength(0);

                if (iBusinessType.getEXTENSION() != null) {
                    extBuilder.append(iBusinessType.getEXTENSION().getITEMCOUNT());
                    extBuilder.append(SEPARATOR);
                    for (ru.creditregistry._2010.webservice.singleformat.response.ExtensionItemType iItemType : iBusinessType.getEXTENSION().getITEM()) {
                        extBuilder.append(iItemType.getCODE());
                        extBuilder.append(SEPARATOR);
                        extBuilder.append(iItemType.getTEXT());
                        extBuilder.append(SEPARATOR);
                    }


                }

                String iExtension = extBuilder.toString();

                isBuilder.setLength(0);

                if (iBusinessType.getINFOSOURCES() != null) {
                    for (String iSources : iBusinessType.getINFOSOURCES().getSOURCE()) {
                        isBuilder.append(iSources);
                        isBuilder.append(SEPARATOR);
                    }

                }

                String infoSources = isBuilder.toString();

                sfMapper.insertBusiness(businessId, rtdmId, creId, iBusinessType, iExtension, infoSources, applicantId);
            }
        }

        if (singleFormat.getMAIN().getCONNECTORDATADETAILS() != null) {
            if (singleFormat.getMAIN().getCONNECTORDATADETAILS().getCONNECTORDATADETAIL() != null) {
                for (ru.creditregistry._2010.webservice.singleformat.response.ConnectorDataDetailType iCDD : singleFormat
                        .getMAIN().getCONNECTORDATADETAILS().getCONNECTORDATADETAIL()) {
                    if (!singleFormat.getSECONDARY().getRESPONSESTATUS().equals("0") &&
                            !singleFormat.getSECONDARY().getRESPONSESTATUS().equals("1") && !iCDD.getRESULTCODE().equals("1")) {
                        throw new NullPointerException();
                    }

                    if (iCDD.getCACHEUSE() == 1) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        } else {
            if (!singleFormat.getSECONDARY().getRESPONSESTATUS().equals("0") &&
                    !singleFormat.getSECONDARY().getRESPONSESTATUS().equals("1")) {
                throw new NullPointerException();
            }
        }

        return 0;
    }
}
