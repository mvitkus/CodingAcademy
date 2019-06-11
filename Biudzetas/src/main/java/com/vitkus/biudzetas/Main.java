package com.vitkus.biudzetas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		Biudzetas b1 = new Biudzetas();
		b1.pridetiPajamuIrasa(2000, null, 0, false, null);
		b1.pridetiPajamuIrasa(3000, null, 0, false, null);
		b1.gautiPajamuIrasa();
		
		


	}
	public static String printLaika() {
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		Date date = new Date();
		String laikas = dateFormat.format(date); 
		return laikas;
		 
	}
}
