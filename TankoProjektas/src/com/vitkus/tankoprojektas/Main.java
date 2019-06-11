package com.vitkus.tankoprojektas;

import java.util.Scanner;

public class Main {
	public static void main(String[] Args) {
		
		TankPic tankpic = new TankPic();
		tankpic.printTank();
		Scanner sc = new Scanner(System.in);
		Tankas tankas = new Tankas();
		String input;
		
		boolean runProgram = true;
		
		Komandos komandos = new Komandos();
		komandos.atspauzdintiKomandas();
		while(runProgram) {
			input = sc.next();
			if(input.equals("s")) {
				tankas.Pirmyn();
				komandos.atspauzdintiKomandas();
			}
			if(input.equals("r")) {
				tankas.Dešinėn();
				komandos.atspauzdintiKomandas();
			}
			if(input.equals("p")) {
				tankas.Atgal();
				komandos.atspauzdintiKomandas();
			}
			if(input.equals("v")) {
				tankas.Kairėn();
				komandos.atspauzdintiKomandas();
			}
			if(input.equals("*")) {
				tankas.Suvis();
				komandos.atspauzdintiKomandas();
			}
			if(input.equals("i")) {
				tankas.Info();
				komandos.atspauzdintiKomandas();
			}
			if(input.equals("x")) {
				runProgram=false;
				tankpic.printTank();
				break;
			}
			
			
			
		}
//		tankpic.printTank();
//
		
//		
//		tankas.Pirmyn();
//		tankas.Dešinėn();
//		tankas.Pirmyn();
//		tankas.Suvis();
//		tankas.Suvis();
//		tankas.Kairėn();
//		tankas.Suvis();
//		tankas.Pirmyn();
//		tankas.Info();
//		tankas.Kairėn();
//		tankas.Kairėn();
//		tankas.Suvis();
//		tankas.Info();

		

	}
}
