package com.vitkus.biudzetoprojektas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IslaiduIrasas extends Irasas{
	
	private int kategorija;
	private boolean arBankinisPavedimas;
	
	public IslaiduIrasas(double suma, String papildomaInfo, boolean arBankinisPavedimas) {
		super(suma, papildomaInfo);
		this.arBankinisPavedimas = arBankinisPavedimas;
		kategorija = 0;
		
	}

	public IslaiduIrasas(int id, double suma, String papildomaInfo, LocalDateTime data, int kategorija, boolean arBankinis) {
		super(suma, papildomaInfo);
		this.arBankinisPavedimas = arBankinisPavedimas;
		this.kategorija=kategorija;
		
	}

	


	public int getKategorija() {
		return kategorija;
	}

	public void setKategorija(int kategorija) {
		this.kategorija = kategorija;
	}

	public boolean isArBankinisPavedimas() {
		return arBankinisPavedimas;
	}

	public void setArBankinisPavedimas(boolean arBankinisPavedimas) {
		this.arBankinisPavedimas = arBankinisPavedimas;
	}
	
	
	@Override
	public String toString() { 
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String kat ="";
		if(this.getKategorija()==0) {
			 kat = "islaidos";
		}
		String arBankinis=" ";
		
		if(this.isArBankinisPavedimas()==true) {
			arBankinis = "Islaidos  bankiniu pavedimu";
		}else {
			arBankinis="Islaidos grynais pinigais";
		}
		
	    return this.getId()+") "+"Suma: " + this.getSuma()+" Eur" + " | Papildoma info "+ getPapildomaInfo()+" | Kategorija: "+ kat + " | Data: " + dateFormat.format(this.getData())+" | "+arBankinis;
	} 
	


	
}
