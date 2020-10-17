package ru.akbars.integro.dao;

import javax.xml.datatype.XMLGregorianCalendar;

public class OkzIdentyCard {

	String number;
	String series;
	String idType;
	String issuer;
	XMLGregorianCalendar issueDate;
	String issueLocation;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public XMLGregorianCalendar getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(XMLGregorianCalendar issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueLocation() {
		return issueLocation;
	}
	public void setIssueLocation(String issueLocation) {
		this.issueLocation = issueLocation;
	}
	
}
