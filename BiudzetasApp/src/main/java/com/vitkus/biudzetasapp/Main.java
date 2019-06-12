package com.vitkus.biudzetasapp;

public class Main {

	public static void main(String[] args) {
		Biudzetas b1 = new Biudzetas();
		b1.pridetiIslaiduIrasa(300.00, true, "Uz nieka");
		b1.pridetiIslaiduIrasa(500.00, false, "siaip");
		b1.pridetiPajamuIrasa(300.00, true, "uz ledus");
		b1.pridetiPajamuIrasa(500.00, false, "uz pietus");
		b1.pridetiPajamuIrasa(800.00, true, "uz pietus");
		b1.pridetiPajamuIrasa(800.50, false, "uz dovana");
		b1.gautiPajamuIrasa();
		b1.gautiIslaiduIrasa();
		
	}

}
