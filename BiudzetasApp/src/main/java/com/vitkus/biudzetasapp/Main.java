package com.vitkus.biudzetasapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Biudzetas biudzetas = new Biudzetas();
		String input;
		boolean runProgram = true;
		Meniu meniu = new Meniu();
		
		meniu.printMeniu();
		while (runProgram) {
			
			input = sc.next();

			if (input.equals("1")) {
				
				System.out.println("Iveskite pajamas: suma, ar gauta i banka (taip, ne), paskirtis");
				Double suma = sc.nextDouble();
				String rusis = sc.next();
				String paskirtis = sc.next();
				boolean tipas;
		
				if(rusis == "taip") {
					tipas = true;
				}else {tipas = false;}
				
				biudzetas.pridetiPajamuIrasa(suma, tipas, paskirtis);
				System.out.println();
				meniu.printMeniu();
				
			}
			
			if (input.equals("2")) {
				
				System.out.println("Iveskite Islaidas: suma, ar bankinis pavedimas (taip, ne), paskirtis");
				Double suma = sc.nextDouble();
				String rusis = sc.next();
				String paskirtis = sc.next();
				boolean tipas;
		
				if(rusis == "taip") {
					tipas = true;
				}else {tipas = false;}
				
				
				biudzetas.pridetiIslaiduIrasa(suma, tipas, paskirtis);
				System.out.println();
				meniu.printMeniu();
				
			}
			
			
			if (input.equals("3")) {
				biudzetas.gautiPajamuIrasa();
				System.out.println();
				meniu.printMeniu();

			}
			
			if (input.equals("4")) {
				biudzetas.gautiIslaiduIrasa();
				System.out.println();
				meniu.printMeniu();

			}
			
			
			if (input.equals("x")) {
				runProgram=false;
				break;
			}

		}

//		Biudzetas b1 = new Biudzetas();
//		b1.pridetiIslaiduIrasa(300.00, true, "Uz nieka");
//		b1.pridetiIslaiduIrasa(500.00, false, "siaip");
//		b1.pridetiPajamuIrasa(300.00, true, "uz ledus");
//		b1.pridetiPajamuIrasa(500.00, false, "uz pietus");
//		b1.pridetiPajamuIrasa(800.00, true, "uz pietus");
//		b1.pridetiPajamuIrasa(800.50, false, "uz dovana");
//		b1.gautiPajamuIrasa();
//		b1.gautiIslaiduIrasa();
//		System.out.println();

	}

}
