package com.vitkus.traukinys;

public class Main {

	public static void main(String[] args) {
		
		
		Traukinys traukinys = new Traukinys(10, 2);
		
		traukinys.ilaipintiKeleivi(new Suauges("Mindaugas", "Vitkus"));
		traukinys.ilaipintiKeleivi(new Suauges("Jonas", "Jonaitis"));
		traukinys.ilaipintiKeleivi(new Vaikas("Petras", "Petraitis"));
		traukinys.ilaipintiKeleivi(new Neigalus("Domas", "Domingo"));
		traukinys.islaipintiVisusKeleivius();
		traukinys.gautiKeleiviuSarasa();
//		traukinys.sustoti();
//		traukinys.gautiKeleiviuSarasa();
	
		traukinys.gautiKeleiviuSarasa();
		
//		try {
		
			
			
			
			
//		} catch(NetinkamaBusenaException e) {
//			System.out.println("Bandoma atlikti neleistina veiskma");
//		} catch(PerpildytaException e) {
//			System.out.println("Transporto priemone perpildyta");
//		}
		
	}

}
