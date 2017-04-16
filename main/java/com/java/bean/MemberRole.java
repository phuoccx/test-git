package com.java.bean;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * The persistent class for the MemberRole database table.
 * 
 */
public class MemberRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String memberRoleID;

	private Object memberRoleDesc;

	public MemberRole() {
	}

	public String getMemberRoleID() {
		return this.memberRoleID;
	}

	public void setMemberRoleID(String memberRoleID) {
		this.memberRoleID = memberRoleID;
	}

	public Object getMemberRoleDesc() {
		return this.memberRoleDesc;
	}

	public void setMemberRoleDesc(Object memberRoleDesc) {
		this.memberRoleDesc = memberRoleDesc;
	}

}