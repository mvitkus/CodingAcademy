package com.vitkus.traukinys;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	

		System.out.println("Iveskite traukinio vietu skaiciu: ");
		int vietuSk = sc.nextInt();
		Traukinys traukinys = new Traukinys(vietuSk, 2);
		Menu.atspauzdintiMenu();
			while (true) {
				System.out.println("Iveskite pasirinkima: ");
				int i = sc.nextInt();

				switch (i) {
				case 1:
					try {
					System.out.println("Iveskite keleivio varda:");
					String vardas = sc.next();
					System.out.println("Iveskite keleivio pavarde");
					String pavarde = sc.next();
					traukinys.ilaipintiKeleivi(new Suauges(vardas, pavarde));
					System.out.println("");
					Menu.atspauzdintiMenu();
					} catch (PerpildytaException e) {
						System.out.println("Nepavyko prideti keleivio. Priezastis:" + e.getPriezastis());
						System.out.println("");
						Menu.atspauzdintiMenu();
					}
					break;

				case 2:
					traukinys.islaipintiVisusKeleivius();
					System.out.println("");
					Menu.atspauzdintiMenu();
					break;
				case 3:
					traukinys.vaziuoti();
					System.out.println("");
					Menu.atspauzdintiMenu();
					break;
				case 4:
					traukinys.sustoti();
					System.out.println("");
					Menu.atspauzdintiMenu();
					break;
				case 5:
					traukinys.gautiKeleiviuSarasa();
					System.out.println("");
					Menu.atspauzdintiMenu();
					break;
				case 6:
					traukinys.irasytiIfaila("traukinioKeleiviai");
					System.out.println("");
					Menu.atspauzdintiMenu();
					break;
				default:
					break;
				}
			}


	}
}
