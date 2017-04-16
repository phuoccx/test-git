package com.java.bean;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the MemberBill database table.
 * 
 */
public class MemberBill implements Serializable {
	private static final long serialVersionUID = 1L;

	private int billID;

	private int billAmount;

	private Timestamp billPaymentDate;

	private Timestamp billRequestDate;

	private int billstatus;

	private Object memberID;

	private Object memberPayDetail;

	private int paymentID;

	public MemberBill() {
	}

	public int getBillID() {
		return this.billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public int getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public Timestamp getBillPaymentDate() {
		return this.billPaymentDate;
	}

	public void setBillPaymentDate(Timestamp billPaymentDate) {
		this.billPaymentDate = billPaymentDate;
	}

	public Timestamp getBillRequestDate() {
		return this.billRequestDate;
	}

	public void setBillRequestDate(Timestamp billRequestDate) {
		this.billRequestDate = billRequestDate;
	}

	public int getBillstatus() {
		return this.billstatus;
	}

	public void setBillstatus(int billstatus) {
		this.billstatus = billstatus;
	}

	public Object getMemberID() {
		return this.memberID;
	}

	public void setMemberID(Object memberID) {
		this.memberID = memberID;
	}

	public Object getMemberPayDetail() {
		return this.memberPayDetail;
	}

	public void setMemberPayDetail(Object memberPayDetail) {
		this.memberPayDetail = memberPayDetail;
	}

	public int getPaymentID() {
		return this.paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

}