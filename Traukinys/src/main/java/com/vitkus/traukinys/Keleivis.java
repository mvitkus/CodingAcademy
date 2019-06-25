package com.vitkus.traukinys;

public class Keleivis {

	private String vardas;
	private String pavarde;

	public Keleivis(String vardas, String pavarde) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	
	
	@Override
	public String toString() {
		return this.getVardas() + " "+ this.getPavarde();
	}

}
