package com.java.bean;

import java.io.Serializable;


/**
 * The persistent class for the UserClick database table.
 * 
 */
public class UserClick implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object memberLinkID;

	private Object payoutRateID;

	public UserClick() {
	}

	public Object getMemberLinkID() {
		return this.memberLinkID;
	}

	public void setMemberLinkID(Object memberLinkID) {
		this.memberLinkID = memberLinkID;
	}

	public Object getPayoutRateID() {
		return this.payoutRateID;
	}

	public void setPayoutRateID(Object payoutRateID) {
		this.payoutRateID = payoutRateID;
	}

}