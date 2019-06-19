package com.vitkus.biudzetoprojektas;

import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {

	ArrayList<Irasas> biudzetas = new ArrayList<Irasas>();

	Scanner sc = new Scanner(System.in);

	public void pridetiIrasa(String irasas) {

		if (irasas.equals("pajamos")) {

			System.out.println("Įveskite pajamas: suma, ar gauta į banką(taip/ne), paskirtis.");
			Double suma = sc.nextDouble();
			String rusis = sc.next();
			sc.nextLine();
			while (!sc.hasNextLine()) { // TODO
				sc.next();
			}
			String paskirtis = sc.nextLine();
			boolean tipas;
			if (rusis == "taip") {
				tipas = true;
			} else {
				tipas = false;
			}

			PajamuIrasas paj = new PajamuIrasas(suma, paskirtis, tipas);
			biudzetas.add(paj);
		} else if (irasas.equals("islaidos")) {

			System.out.println("Įveskite islaidas: suma, ar pavedimas į banką(taip/ne), paskirtis.");
			Double suma = sc.nextDouble();
			String rusis = sc.next();
			String paskirtis = sc.next();
			paskirtis += sc.nextLine();

			boolean tipas;
			if (rusis == "taip") {
				tipas = true;
			} else {
				tipas = false;
			}

			IslaiduIrasas isl = new IslaiduIrasas(suma, paskirtis, tipas);
			biudzetas.add(isl);

		} else {
			System.out.println("Tokio tipo nera");
		}

	}

	public ArrayList<PajamuIrasas> gautiPajamuIrasus() {
		ArrayList<PajamuIrasas> pajamos = new ArrayList<PajamuIrasas>();

		for (int i = 0; i < biudzetas.size(); i++) {
			Irasas temp = biudzetas.get(i);
			if (temp instanceof PajamuIrasas) {
				pajamos.add((PajamuIrasas) temp);
			}
		}

		return pajamos;

	}

	public ArrayList<IslaiduIrasas> gautiIslaiduIrasus() {
		
		ArrayList<IslaiduIrasas> islaidos = new ArrayList<IslaiduIrasas>();

		for (int i = 0; i < biudzetas.size(); i++) {
			Irasas temp = biudzetas.get(i);
			if (temp instanceof IslaiduIrasas) {
				islaidos.add((IslaiduIrasas) temp);
			}
		}
		return islaidos;
	}

	public void gautiIrasus() {
		for (int i = 0; i < biudzetas.size(); i++) {

			System.out.println(biudzetas.get(i));
		}
	}

	public void irasuBalansas() {

		float pajamuSuma =0;
		float islaiduSuma =0;
		for(int i=0; i<biudzetas.size();i++) {
			if(biudzetas.get(i) instanceof PajamuIrasas) {
				pajamuSuma=(float) (pajamuSuma+biudzetas.get(i).getSuma());
			}else if(biudzetas.get(i) instanceof IslaiduIrasas) {
				islaiduSuma=(float) (islaiduSuma+biudzetas.get(i).getSuma());
			}
			}
		float balansas=pajamuSuma-islaiduSuma;
		System.out.println("Balansas: "+balansas);
		}

		

	

	@SuppressWarnings("unlikely-arg-type")
	public void atnaujintiIrasa() {
		int pasirinkimas;

		do {
			System.out.println("Pasirinkite: ");
			System.out.println("[1] - Redaguoti irasa.");
			System.out.println("[2] - Baigti redagavima");
			pasirinkimas = sc.nextInt();
		} while (pasirinkimas > 2);
		switch (pasirinkimas) {
		case 1:
			gautiIrasus();
			System.out.println("Pasirinkite ID");
			int redaguoti = sc.nextInt();
			if (biudzetas.get(redaguoti - 1).equals(biudzetas.get(redaguoti - 1).getId())) {
				redaguotiSumaIrasePagalID(redaguoti);
				redaguotiPaskirtiIrasePagalID(redaguoti);
				break;

			} else {
				System.out.println("Nera tokio iraso");
			}
		case 2:

			break;
		}

	}

	private void redaguotiSumaIrasePagalID(int redaguoti) {

		System.out.println("Suma: " + biudzetas.get(redaguoti - 1).getSuma());
		System.out.println("[1] - redaguoti, [2] - toliau ");
		int redag = sc.nextInt();
		if (redag == 1) {
			System.out.println("Iveskite nauja reiksme");
			double naujaReiksme = sc.nextDouble();
			biudzetas.get(redaguoti - 1).setSuma(naujaReiksme);
		} else {
			System.out.println("Suma palikta ta pati.");

		}

	}

	private void redaguotiPaskirtiIrasePagalID(int redaguoti) {

		System.out.println("Paskirtis: " + biudzetas.get(redaguoti - 1).getPapildomaInfo());
		System.out.println("[1] - redaguoti, [2] - toliau ");
		int redag = sc.nextInt();
		if (redag == 1) {
			System.out.println("Iveskite nauja informacija");

			String paskirtis = sc.next(); // Geras String sakinio isvedimas
			paskirtis += sc.nextLine();

			biudzetas.get(redaguoti - 1).setPapildomaInfo(paskirtis);
		} else {
			System.out.println("Paskirtis palikta tokia pati");
		}

	}

	public void istrintiIrasa() {
		gautiIrasus();
		System.out.println("Pasirinkite ID");
		int redaguoti = sc.nextInt();
		if (biudzetas.get(redaguoti - 1).equals(biudzetas.get(redaguoti - 1).getId())) {
			biudzetas.remove(redaguoti - 1);

		}
	}
	
	public void sukurtiCsv() {
		CsvFileWriter csv = new CsvFileWriter();
		csv.writeCsvFile("Naujas", biudzetas);
	}

}
