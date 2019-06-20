package com.vitkus.biudzetoprojektas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class PajamuIrasas extends Irasas{
	


	private int kategorija;
	private boolean pozymisArIBanka;
	
	public PajamuIrasas(double suma,String papildomaInfo,boolean pozymisArIBanka ) {
		super(suma, papildomaInfo);
		this.kategorija = 1;
		this.pozymisArIBanka = pozymisArIBanka;
		
		
	}
	
	public PajamuIrasas(int id, double suma, String papildomaInfo, LocalDateTime data, int kategorija, boolean pozymisArIbanka) {
		super(suma, papildomaInfo);
		this.kategorija = kategorija;
		this.pozymisArIBanka = pozymisArIbanka;
		
		
	}

	public int getKategorija() {
		return kategorija;
	}

	public void setKategorija(int kategorija) {
		this.kategorija = kategorija;
	}

	public boolean isPozymisArIBanka() {
		return pozymisArIBanka;
	}

	public void setPozymisArIBanka(boolean pozymisArIBanka) {
		this.pozymisArIBanka = pozymisArIBanka;
	}
	
	@Override
	public String toString() { 
		
		String kat ="";
		if(this.getKategorija()==1) {
			 kat = "pajamos";
		}
		
		String arBankinis=" ";
		
		if(this.isPozymisArIBanka()==true) {
			arBankinis = "Pajamos bankiniu pavedimu";
		}else {
			arBankinis="Pajamos grynais pinigais";
		}
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	    return this.getId()+") "+"Suma: " + this.getSuma()+" Eur" + " | Papildoma info: "+ getPapildomaInfo()+" | Kategorija: "+ kat + " | Data: " + dateFormat.format(this.getData())+" | "+arBankinis;
	} 

}
