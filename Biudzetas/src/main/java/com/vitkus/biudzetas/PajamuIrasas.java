package com.vitkus.biudzetas;

import java.util.Date;

public class PajamuIrasas extends Biudzetas {

	
	private double suma;
	private Date date;
	private int index;
	private boolean arIBanka;
	private String info;

	public PajamuIrasas(double suma, Date date, int index, boolean arIBanka,  String info) {
		super();
		this.arIBanka = arIBanka;
		this.suma = suma;
		this.date = date;
		this.index = index;
		this.info = info;
	}

	public boolean isArIBanka() {
		return arIBanka;
	}

	public void setArIBanka(boolean arIBanka) {
		this.arIBanka = arIBanka;
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

}
