package com.java.bean;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the MemberLink database table.
 * 
 */
public class MemberLink implements Serializable {
	private static final long serialVersionUID = 1L;

	private String memberLinkID;

	private Object memberID;

	private Timestamp memberLinkCreateDate;

	private Object memberLinkOrigin;

	private int memberLinkView;

	public MemberLink() {
	}

	public String getMemberLinkID() {
		return this.memberLinkID;
	}

	public void setMemberLinkID(String memberLinkID) {
		this.memberLinkID = memberLinkID;
	}

	public Object getMemberID() {
		return this.memberID;
	}

	public void setMemberID(Object memberID) {
		this.memberID = memberID;
	}

	public Timestamp getMemberLinkCreateDate() {
		return this.memberLinkCreateDate;
	}

	public void setMemberLinkCreateDate(Timestamp memberLinkCreateDate) {
		this.memberLinkCreateDate = memberLinkCreateDate;
	}

	public Object getMemberLinkOrigin() {
		return this.memberLinkOrigin;
	}

	public void setMemberLinkOrigin(Object memberLinkOrigin) {
		this.memberLinkOrigin = memberLinkOrigin;
	}

	public int getMemberLinkView() {
		return this.memberLinkView;
	}

	public void setMemberLinkView(int memberLinkView) {
		this.memberLinkView = memberLinkView;
	}

}