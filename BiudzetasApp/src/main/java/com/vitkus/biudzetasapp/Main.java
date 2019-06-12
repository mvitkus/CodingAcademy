package com.vitkus.biudzetasapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Biudzetas biudzetas = new Biudzetas();
		String input;
		boolean runProgram = true;
		Meniu meniu = new Meniu();
		

		while (runProgram) {
			meniu.printMeniu();
			input = sc.next();

			if (input.equals("p")) {
				
				System.out.println("Iveskite pajamas: suma, ar gauta i banka (taip, ne), paskirtis");
				Double suma = sc.nextDouble();
				String rusis = sc.next();
				String paskirtis = sc.next();
				boolean tipas;
		
				if(rusis == "taip") {
					tipas = true;
				}else {tipas = false;}
				
				biudzetas.pridetiPajamuIrasa(suma, tipas, paskirtis);
				
			}
			if (input.equals("i")) {
				biudzetas.gautiPajamuIrasa();

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
