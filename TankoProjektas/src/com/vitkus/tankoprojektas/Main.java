package com.vitkus.tankoprojektas;

public class Main {
	public static void main(String[] Args) {
		
		TankPic tankpic = new TankPic();
		tankpic.printTank();

		Tankas tankas = new Tankas();
		
		tankas.Pirmyn();
		tankas.Dešinėn();
		tankas.Pirmyn();
		tankas.Suvis();
		tankas.Suvis();
		tankas.Kairėn();
		tankas.Suvis();
		tankas.Pirmyn();
		tankas.Info();
		tankas.Kairėn();
		tankas.Kairėn();
		tankas.Suvis();
		tankas.Info();


	}
}
