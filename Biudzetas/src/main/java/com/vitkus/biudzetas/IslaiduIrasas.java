package com.vitkus.biudzetas;

import java.util.Date;

public class IslaiduIrasas extends Biudzetas {



	private double suma;
	private Date date;
	private int index;
	private boolean arBankinisPavedimas;
	private String info;

	public IslaiduIrasas(double suma, Date date, int index, boolean arBankinisPavedimas, String info) {
		super();
		this.suma = suma;
		this.date = date;
		this.index = index;
		this.arBankinisPavedimas = arBankinisPavedimas;
		this.info = info;
	}
	
	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public boolean isArBankinisPavedimas() {
		return arBankinisPavedimas;
	}

	public void setArBankinisPavedimas(boolean arBankinisPavedimas) {
		this.arBankinisPavedimas = arBankinisPavedimas;
	}

}
