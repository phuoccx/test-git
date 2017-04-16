package com.java.bean;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the Member database table.
 * 
 */
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object memberBacklink;

	private Timestamp memberCreatedate;

	private Object memberEmail;

	private Object memberFname;

	private Object memberID;

	private Object memberIP;

	private Object memberLname;

	private Object memberPass;

	private Object memberPayDetail;

	private Object memberPhone;

	private Object memberRef;

	private Object memberRoleID;

	private int memberStatusID;

	private Object memberUserName;

	private int paymentID;

	public Member() {
	}

	public Object getMemberBacklink() {
		return this.memberBacklink;
	}

	public void setMemberBacklink(Object memberBacklink) {
		this.memberBacklink = memberBacklink;
	}

	public Timestamp getMemberCreatedate() {
		return this.memberCreatedate;
	}

	public void setMemberCreatedate(Timestamp memberCreatedate) {
		this.memberCreatedate = memberCreatedate;
	}

	public Object getMemberEmail() {
		return this.memberEmail;
	}

	public void setMemberEmail(Object memberEmail) {
		this.memberEmail = memberEmail;
	}

	public Object getMemberFname() {
		return this.memberFname;
	}

	public void setMemberFname(Object memberFname) {
		this.memberFname = memberFname;
	}

	public Object getMemberID() {
		return this.memberID;
	}

	public void setMemberID(Object memberID) {
		this.memberID = memberID;
	}

	public Object getMemberIP() {
		return this.memberIP;
	}

	public void setMemberIP(Object memberIP) {
		this.memberIP = memberIP;
	}

	public Object getMemberLname() {
		return this.memberLname;
	}

	public void setMemberLname(Object memberLname) {
		this.memberLname = memberLname;
	}

	public Object getMemberPass() {
		return this.memberPass;
	}

	public void setMemberPass(Object memberPass) {
		this.memberPass = memberPass;
	}

	public Object getMemberPayDetail() {
		return this.memberPayDetail;
	}

	public void setMemberPayDetail(Object memberPayDetail) {
		this.memberPayDetail = memberPayDetail;
	}

	public Object getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(Object memberPhone) {
		this.memberPhone = memberPhone;
	}

	public Object getMemberRef() {
		return this.memberRef;
	}

	public void setMemberRef(Object memberRef) {
		this.memberRef = memberRef;
	}

	public Object getMemberRoleID() {
		return this.memberRoleID;
	}

	public void setMemberRoleID(Object memberRoleID) {
		this.memberRoleID = memberRoleID;
	}

	public int getMemberStatusID() {
		return this.memberStatusID;
	}

	public void setMemberStatusID(int memberStatusID) {
		this.memberStatusID = memberStatusID;
	}

	public Object getMemberUserName() {
		return this.memberUserName;
	}

	public void setMemberUserName(Object memberUserName) {
		this.memberUserName = memberUserName;
	}

	public int getPaymentID() {
		return this.paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

}