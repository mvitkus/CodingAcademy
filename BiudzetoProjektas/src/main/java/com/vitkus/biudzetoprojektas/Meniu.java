package com.vitkus.biudzetoprojektas;

import java.util.Scanner;


public class Meniu {
	
	public void printMenu() {
		
		Scanner sc = new Scanner(System.in);
		Biudzetas biudzetas = new Biudzetas();
		String input = " ";
		boolean runProgram = true;
		printMenuList();
		while (runProgram) {
//			printMenuList();
			input = sc.next();
			if (input.equals("1")) {
				biudzetas.pridetiIrasa("pajamos");
				printMenuList();
			}
			if (input.equals("2")) {
				biudzetas.pridetiIrasa("islaidos");
				printMenuList();
			}
			if (input.equals("3")) {
				System.out.println(biudzetas.gautiPajamuIrasus());
				
				printMenuList();
			}
			if (input.equals("4")) {
				System.out.println(biudzetas.gautiIslaiduIrasus());
			
				printMenuList();
			}
			if (input.equals("5")) {
				biudzetas.irasuBalansas();
				printMenuList();
			}
			if (input.equals("6")) {
				biudzetas.gautiIrasus();
				printMenuList();
			}
			if (input.equals("7")) {
				biudzetas.istrintiIrasa();
				printMenuList();
			}
			
			if (input.equals("8")) {
				biudzetas.atnaujintiIrasa();
				printMenuList();
				
			}
			if (input.equals("x")) {
				System.out.println("Programa uzdaroma..");
				break;
			}
			
		}
		
	}
	


	public static void printMenuList() {
		System.out.println();
		System.out.println("Pasirinkite: ");
		System.out.println("[1] - Pajamu ivedimas");
		System.out.println("[2] - Islaidu ivedimas");
		System.out.println("[3] - Pajamu israsas");
		System.out.println("[4] - Islaidu israsas");
		System.out.println("[5] - Balansas");
		System.out.println("[6] - Visas israsas");
		System.out.println("[7] - Istrinti irasa");
		System.out.println("[8] - Redaguoti irasus");
		
		System.out.println("[x] - Uzbaigti programa");
	}
	

}

