package com.vitkus.biudzetasapp;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class IslaiduIrasas {

	private double suma;
	private Date data;

	private static final AtomicInteger count = new AtomicInteger(0); 


	private int kategorija = 0;
	private boolean arBankinisPavedimas;
	private String papildomaInfo;

	public IslaiduIrasas(double suma, boolean arBankinisPavedimas, String papildomaInfo) {
		super();
		this.suma = suma;
		this.arBankinisPavedimas = arBankinisPavedimas;
		this.papildomaInfo = papildomaInfo;
		kategorija = count.incrementAndGet(); 
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
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public int getKategorija() {
		return kategorija;
	}

	public void setKategorija(int kategorija) {
		this.kategorija = kategorija;
	}

}
