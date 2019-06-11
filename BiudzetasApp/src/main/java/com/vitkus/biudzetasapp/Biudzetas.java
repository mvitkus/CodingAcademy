package com.vitkus.biudzetasapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Biudzetas {
	PajamuIrasas[] pajamos = new PajamuIrasas[100];
	IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
	
	public void pridetiPajamuIrasa(Double suma, boolean pozymisArIBanka, String papildomaInfo) {
		PajamuIrasas paj = new PajamuIrasas(suma, pozymisArIBanka, papildomaInfo);
//		int nr = paj.getKategorija();
//		nr+=1;
//		paj.setKategorija(nr);
		//paj.setKategorija(paj.getKategorija()+1);
		paj.setData(printLaika());
		
		for(int i=0; i<pajamos.length;i++) {
			PajamuIrasas pajamos1 = pajamos[i];
			if(pajamos1 == null) {
				pajamos[i]=paj;
				break;
			}
			
		}
		
		
		
	}
	
	public void pridetiIslaiduIrasa() {}
	public void gautiPajamuIrasa() {
		
		for(int i=0; i<pajamos.length;i++) {
		if(pajamos[i] == null) {
			break;
		}else {
			
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
			
			System.out.print(pajamos[i].getKategorija()+") ");
			System.out.print("Suma: "+pajamos[i].getSuma()+" | ");
			System.out.print("Data: "+ dateFormat.format(pajamos[i].getData())+" | ");
			System.out.print("Paskirtis: " + pajamos[i].getPapildomaInfo()+" | ");
			
			if(pajamos[i].isPozymisArIBanka() == true) {
				System.out.println("Bankinis pavedimas");
			}else {System.out.println("Gryni pinigai");}
			//System.out.println(pajamos[i].isPozymisArIBanka()+" ");
		}
		}
	}
	public void gautiIslaiduIrasa() {}
	
	public Date printLaika() {
		//DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		//System.out.println(dateFormat.format(date)); 
		return date;
}
}
