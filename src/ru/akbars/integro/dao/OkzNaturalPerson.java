package ru.akbars.integro.dao;

import javax.xml.datatype.XMLGregorianCalendar;

public class OkzNaturalPerson {
    XMLGregorianCalendar consentDate;
    XMLGregorianCalendar consentEndDate;
    Integer consentPurpose;
    String consentUser;
    XMLGregorianCalendar dateOfBirth;
    String lastName;
    String firstName;
    String middleName;
    String placeOfBirth;
    String mobilePhone;

    public XMLGregorianCalendar getConsentDate() {
        return consentDate;
    }

    public void setConsentDate(XMLGregorianCalendar consentDate) {
        this.consentDate = consentDate;
    }

    public XMLGregorianCalendar getConsentEndDate() {
        return consentEndDate;
    }

    public void setConsentEndDate(XMLGregorianCalendar consentEndDate) {
        this.consentEndDate = consentEndDate;
    }

    public Integer getConsentPurpose() {
        return consentPurpose;
    }

    public void setConsentPurpose(Integer consentPurpose) {
        this.consentPurpose = consentPurpose;
    }

    public String getConsentUser() {
        return consentUser;
    }

    public void setConsentUser(String consentUser) {
        this.consentUser = consentUser;
    }

    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(XMLGregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}