package com.pack.model;

public class Account {
	public int accountnumber,availablebalance,openingbalance,closingbalance,creditdetails,debitdetails;
	private String accountname,currency,branch,corporateid;
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getAvailablebalance() {
		return availablebalance;
	}
	public void setAvailablebalance(int availablebalance) {
		this.availablebalance = availablebalance;
	}
	public int getOpeningbalance() {
		return openingbalance;
	}
	public void setOpeningbalance(int openingbalance) {
		this.openingbalance = openingbalance;
	}
	public int getClosingbalance() {
		return closingbalance;
	}
	public void setClosingbalance(int closingbalance) {
		this.closingbalance = closingbalance;
	}
	public int getCreditdetails() {
		return creditdetails;
	}
	public void setCreditdetails(int creditdetails) {
		this.creditdetails = creditdetails;
	}
	public int getDebitdetails() {
		return debitdetails;
	}
	public void setDebitdetails(int debitdetails) {
		this.debitdetails = debitdetails;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCorporateid() {
		return corporateid;
	}
	public void setCorporateid(String corporateid) {
		this.corporateid = corporateid;
	}

}
