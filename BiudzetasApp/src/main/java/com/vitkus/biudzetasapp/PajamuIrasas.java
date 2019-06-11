package com.vitkus.biudzetasapp;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class PajamuIrasas {
	private double suma;
	private Date data;
	private int kategorija = 0;
	private static final AtomicInteger count = new AtomicInteger(0); 
	private boolean pozymisArIBanka;
	private String papildomaInfo;

	public PajamuIrasas(double suma, boolean pozymisArIBanka, String papildomaInfo) {
		super();
		this.suma = suma;
		this.pozymisArIBanka = pozymisArIBanka;
		this.papildomaInfo = papildomaInfo;
	    kategorija = count.incrementAndGet(); 
		
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

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public boolean isPozymisArIBanka() {
		return pozymisArIBanka;
	}

	public void setPozymisArIBanka(boolean pozymisArIBanka) {
		this.pozymisArIBanka = pozymisArIBanka;
	}

	public String getPapildomaInfo() {
		return papildomaInfo;
	}

	public void setPapildomaInfo(String papildomaInfo) {
		this.papildomaInfo = papildomaInfo;
	}

	public int counter() {
		kategorija++;
		return kategorija;
	}
}
