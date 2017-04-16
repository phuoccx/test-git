package com.java.bean;

import java.io.Serializable;


/**
 * The persistent class for the PaymentMethod database table.
 * 
 */
public class PaymentMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	private String payID;

	private Object payDecs;

	public PaymentMethod() {
	}

	public String getPayID() {
		return this.payID;
	}

	public void setPayID(String payID) {
		this.payID = payID;
	}

	public Object getPayDecs() {
		return this.payDecs;
	}

	public void setPayDecs(Object payDecs) {
		this.payDecs = payDecs;
	}

}