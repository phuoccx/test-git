package com.java.bean;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the PayoutRate database table.
 * 
 */
public class PayoutRate implements Serializable {
	private static final long serialVersionUID = 1L;

	private String porID;

	private Object porDecs;

	private Object porDecsVN;

	private BigDecimal porRate;

	public PayoutRate() {
	}

	public String getPorID() {
		return this.porID;
	}

	public void setPorID(String porID) {
		this.porID = porID;
	}

	public Object getPorDecs() {
		return this.porDecs;
	}

	public void setPorDecs(Object porDecs) {
		this.porDecs = porDecs;
	}

	public Object getPorDecsVN() {
		return this.porDecsVN;
	}

	public void setPorDecsVN(Object porDecsVN) {
		this.porDecsVN = porDecsVN;
	}

	public BigDecimal getPorRate() {
		return this.porRate;
	}

	public void setPorRate(BigDecimal porRate) {
		this.porRate = porRate;
	}

}