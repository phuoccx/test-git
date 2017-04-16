package com.java.bean;

import java.io.Serializable;


/**
 * The persistent class for the MemberStatus database table.
 * 
 */
public class MemberStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	private int memberStatusID;

	private Object memberStatusDesc;

	public MemberStatus() {
	}

	public int getMemberStatusID() {
		return this.memberStatusID;
	}

	public void setMemberStatusID(int memberStatusID) {
		this.memberStatusID = memberStatusID;
	}

	public Object getMemberStatusDesc() {
		return this.memberStatusDesc;
	}

	public void setMemberStatusDesc(Object memberStatusDesc) {
		this.memberStatusDesc = memberStatusDesc;
	}

}