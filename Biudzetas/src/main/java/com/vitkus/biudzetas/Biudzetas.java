package com.vitkus.biudzetas;

import java.util.Date;

public class Biudzetas {



	
	PajamuIrasas[] pajamos = new PajamuIrasas[100];
	IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
	


	public void pridetiPajamuIrasa(double suma,Date date, int index, boolean arIBanka, String info) {
		
		
		PajamuIrasas pajamos1 = new PajamuIrasas(suma,date, index, arIBanka, info);
		//pajamos1.getSuma();
		
		
		for(int i=0;i<pajamos.length;i++) {
			PajamuIrasas paj = pajamos[i];
			if(paj == null) {
				pajamos[i]= pajamos1;
				break;
			}
			
		}
		
		
		
		
		//PajamuIrasas[] pajamos = new PajamuIrasas[]{};
	
	}

	public void pridetiIslaiduIrasa() {
	}

	public void gautiPajamuIrasa() {
		
	
		for(int i=0; i<pajamos.length;i++) {
			
			if(pajamos[i] == null) {
			break;
			}else {
				System.out.println(pajamos[i].getSuma());
				System.out.println(pajamos[i].getInfo());
				System.out.println(pajamos[i].getIndex());
				System.out.println();
			}
		}
	
		
	}

	public void gautiIslaiduIrasa() {
	}

}
