package com.vitkus.biudzetoprojektas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class PajamuIrasas extends Irasas{
	


	private int kategorija;
	private boolean pozymisArIBanka;
	
	public PajamuIrasas(double suma,String papildomaInfo,boolean pozymisArIBanka ) {
		super(suma, papildomaInfo);
		this.kategorija = 1;
		
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
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
	    return this.getId()+") "+"Suma: " + this.getSuma()+" Eur" + " | Papildoma info: "+ getPapildomaInfo()+" | Kategorija: "+ kat + " | Data: " + dateFormat.format(this.getData());
	} 

}
