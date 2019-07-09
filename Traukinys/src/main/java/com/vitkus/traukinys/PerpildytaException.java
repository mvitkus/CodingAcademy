package com.vitkus.traukinys;

public class PerpildytaException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String priezastis;

	public PerpildytaException(String priezastis) {
		super();
		this.priezastis = priezastis;
	}

	public String getPriezastis() {
		return priezastis;
	}

	public void setPriezastis(String priezastis) {
		this.priezastis = priezastis;
	}

}
