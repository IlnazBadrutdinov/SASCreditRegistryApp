package ru.akbars.integro.dao;

public class OkzLoanRequest {
	String creditSum;
	Integer creditTerm;
	String currency;
	String reason;
	public String getCreditSum() {
		return creditSum;
	}
	public void setCreditSum(String creditSum) {
		this.creditSum = creditSum;
	}
	public Integer getCreditTerm() {
		return creditTerm;
	}
	public void setCreditTerm(Integer creditTerm) {
		this.creditTerm = creditTerm;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
