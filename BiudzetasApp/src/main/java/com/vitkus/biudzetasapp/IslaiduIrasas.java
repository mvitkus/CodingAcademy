package com.vitkus.biudzetasapp;

import java.util.Date;

public class IslaiduIrasas {

	private double suma;
	private Date data;
	private int kategorija;
	private boolean arBankinisPavedimas;
	private String papildomaInfo;

	public IslaiduIrasas(double suma, boolean arBankinisPavedimas, String papildomaInfo) {
		super();
		this.suma = suma;
		this.arBankinisPavedimas = arBankinisPavedimas;
		this.papildomaInfo = papildomaInfo;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public boolean isArBankinisPavedimas() {
		return arBankinisPavedimas;
	}

	public void setArBankinisPavedimas(boolean arBankinisPavedimas) {
		this.arBankinisPavedimas = arBankinisPavedimas;
	}

	public String getPapildomaInfo() {
		return papildomaInfo;
	}

	public void setPapildomaInfo(String papildomaInfo) {
		this.papildomaInfo = papildomaInfo;
	}

}
