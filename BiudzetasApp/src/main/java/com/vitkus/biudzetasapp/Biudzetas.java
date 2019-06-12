package com.vitkus.biudzetasapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Biudzetas {
//	PajamuIrasas[] pajamos = new PajamuIrasas[100];
//	IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

	ArrayList<PajamuIrasas> pajamos = new ArrayList<PajamuIrasas>();
	ArrayList<IslaiduIrasas> islaidos = new ArrayList<IslaiduIrasas>();

	public void pridetiPajamuIrasa(Double suma, boolean pozymisArIBanka, String papildomaInfo) {
		PajamuIrasas paj = new PajamuIrasas(suma, pozymisArIBanka, papildomaInfo);
		paj.setData(printLaika());

//		for (int i = 0; i < pajamos.length; i++) {
//			PajamuIrasas pajamos1 = pajamos[i];
//			if (pajamos1 == null) {
//				pajamos[i] = paj;
//				break;
//			}
//
//		}

		pajamos.add(paj);

	}

	public void pridetiIslaiduIrasa(double suma, boolean arBankinisPavedimas, String papildomaInfo) {

		IslaiduIrasas isl = new IslaiduIrasas(suma, arBankinisPavedimas, papildomaInfo);
		isl.setData(printLaika());

//		for (int i = 0; i < islaidos.length; i++) {
//			IslaiduIrasas islaidos1 = islaidos[i];
//			if (islaidos1 == null) {
//				islaidos[i] = isl;
//				break;
//			}
//
//		}
		islaidos.add(isl);
	}

	public void gautiPajamuIrasa() {

		for (int i = 0; i < pajamos.size(); i++) {
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
			System.out.print(pajamos.get(i).getKategorija() + ") " + "Suma: " + pajamos.get(i).getSuma()
					+ "Eur | Data: " + dateFormat.format(pajamos.get(i).getData()) + " | Paskirtis "
					+ pajamos.get(i).getPapildomaInfo());

			if (pajamos.get(i).isPozymisArIBanka() == true) {
				System.out.println(" | Gavimo budas: bankinis pavedimas");
			} else {
				System.out.println(" | Gavimo budas: gryni pinigai");
			}
			System.out.println();
		}

//		for (int i = 0; i < pajamos.length; i++) {
//			if (pajamos[i] == null) {
//				break;
//			} else {
//
//				DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
//
//				System.out.print(pajamos[i].getKategorija() + ") ");
//				System.out.print("Suma: " + pajamos[i].getSuma() + " | ");
//				System.out.print("Data: " + dateFormat.format(pajamos[i].getData()) + " | ");
//				System.out.print("Paskirtis: " + pajamos[i].getPapildomaInfo() + " | ");
//
//				if (pajamos[i].isPozymisArIBanka() == true) {
//					System.out.println("Bankinis pavedimas");
//				} else {
//					System.out.println("Gryni pinigai");
//				}
//
//			}
//		}
	}

	public void gautiIslaiduIrasa() {

		for (int i = 0; i < islaidos.size(); i++) {
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm");
			System.out.print(islaidos.get(i).getKategorija() + ") " + "Suma: " + islaidos.get(i).getSuma()
					+ "Eur | Data: " + dateFormat.format(islaidos.get(i).getData()) + " | Paskirtis: "
					+ islaidos.get(i).getPapildomaInfo());
			if (islaidos.get(i).isArBankinisPavedimas() == true) {
				System.out.println(" | Mokejimo budas: bankinis pavedimas");
			} else {
				System.out.println(" | Mokejimo budas: gryni pinigai");
			}
			System.out.println();
		}

//		for (int i = 0; i < islaidos.length; i++) {
//			if (islaidos[i] == null) {
//				break;
//			} else {
//
//				DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm");
//
//				System.out.print(islaidos[i].getKategorija() + ") ");
//				System.out.print("Suma: " + islaidos[i].getSuma() + " | ");
//				System.out.print("Data: " + dateFormat.format(islaidos[i].getData()) + " | ");
//				System.out.print("Paskirtis: " + islaidos[i].getPapildomaInfo() + " | ");
//
//				if (islaidos[i].isArBankinisPavedimas() == true) {
//					System.out.println("Bankinis pavedimas");
//				} else {
//					System.out.println("Gryni pinigai");
//				}
//
//			}
//		}

	}

	public Date printLaika() {
		Date date = new Date();
		return date;
	}

	public void balansas() {
		double isl = 0;
		double paj = 0;
		double balansas = 0;

		for (int i = 0; i < islaidos.size(); i++) {
			isl += islaidos.get(i).getSuma();
		}

		for (int i = 0; i < pajamos.size(); i++) {
			paj += pajamos.get(i).getSuma();
		}

		balansas = paj - isl;

		System.out.println(balansas + "Eur");

	}
	
	public void israsas() {
		System.out.println("Islaidos: ");
		gautiIslaiduIrasa();
		System.out.println();
		System.out.println("Pajamos: ");
		gautiPajamuIrasa();
	}
	
	public void istrintiPajamas(int numeris) {
		for (int i = 0; i < pajamos.size(); i++) {
			
			//pajamos.get(i).getKategorija();
			if(pajamos.get(i).getKategorija() == numeris) {
				pajamos.remove(i);
			}
		}
	}
	public void istrintiIslaidas(int numeris) {
		
		for (int i = 0; i < islaidos.size(); i++) {
			
			
			if(islaidos.get(i).getKategorija() == numeris) {
				islaidos.remove(i);
			}
		}
	}
}
