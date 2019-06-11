package com.vitkus.biudzetasapp;

public class Main {

	public static void main(String[] args) {
		Biudzetas b1 = new Biudzetas();
		b1.pridetiIslaiduIrasa();
		b1.pridetiPajamuIrasa(300.00, true, "uz ledus");
		b1.pridetiPajamuIrasa(500.00, false, "uz pietus");
		b1.gautiPajamuIrasa();
	}

}
