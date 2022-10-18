package com.gl.JavaCaseStudy17102022.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	private Long transactionId;
	private Long offerId;
	private String mobileNumber;
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(Long transactionId,Long offerIdString,String mobileNumber) {
		super();
		this.transactionId = transactionId;
		this.offerId = offerId;
		this.mobileNumber = mobileNumber;
		
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Long getOfferId() {
		return offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	
	
}
