package com.vitkus.traukinys;

public class Main {

	public static void main(String[] args) {

		Traukinys traukinys = new Traukinys(2, 2);

		try {
			traukinys.ilaipintiKeleivi(new Suauges("Mindaugas", "Vitkus"));
			traukinys.ilaipintiKeleivi(new Suauges("Jonas", "Jonaitis"));
			traukinys.ilaipintiKeleivi(new Vaikas("Petras", "Petraitis"));
			traukinys.ilaipintiKeleivi(new Neigalus("Domas", "Domingo"));
		} catch (PerpildytaException e) {
			System.out.println("Nepavyko prideti keleivio. Priezastis:" + e.getPriezastis());
		}

		traukinys.vaziuoti();
		traukinys.gautiKeleiviuSarasa();
		traukinys.sustoti();
		traukinys.islaipintiVisusKeleivius();
		traukinys.gautiKeleiviuSarasa();
		traukinys.vaziuoti();
		traukinys.gautiKeleiviuSarasa();

	}
}
