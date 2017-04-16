package com.java.bean;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the IPAddressInDate database table.
 * 
 */
public class IPAddressInDate implements Serializable {
	private static final long serialVersionUID = 1L;

	private Timestamp date;

	private Object ip;

	public IPAddressInDate() {
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Object getIp() {
		return this.ip;
	}

	public void setIp(Object ip) {
		this.ip = ip;
	}

}