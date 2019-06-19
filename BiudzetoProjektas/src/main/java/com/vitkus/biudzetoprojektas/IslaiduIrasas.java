package com.vitkus.biudzetoprojektas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IslaiduIrasas extends Irasas{
	
	private int kategorija;
	private boolean arBankinisPavedimas;
	
	public IslaiduIrasas(double suma, String papildomaInfo, boolean arBankinisPavedimas) {
		super(suma, papildomaInfo);
		this.arBankinisPavedimas = arBankinisPavedimas;
		kategorija = 0;
		
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
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		String kat ="";
		if(this.getKategorija()==0) {
			 kat = "islaidos";
		}
		
	    return this.getId()+") "+"Suma: " + this.getSuma()+" Eur" + " | Papildoma info "+ getPapildomaInfo()+" | Kategorija: "+ kat + " | Data: " + dateFormat.format(this.getData());
	} 
	


	
}
