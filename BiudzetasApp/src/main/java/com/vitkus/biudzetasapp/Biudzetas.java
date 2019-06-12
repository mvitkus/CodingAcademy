package com.vitkus.biudzetasapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Biudzetas {
	PajamuIrasas[] pajamos = new PajamuIrasas[100];
	IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

	public void pridetiPajamuIrasa(Double suma, boolean pozymisArIBanka, String papildomaInfo) {
		PajamuIrasas paj = new PajamuIrasas(suma, pozymisArIBanka, papildomaInfo);
		paj.setData(printLaika());

		for (int i = 0; i < pajamos.length; i++) {
			PajamuIrasas pajamos1 = pajamos[i];
			if (pajamos1 == null) {
				pajamos[i] = paj;
				break;
			}

		}

	}

	public void pridetiIslaiduIrasa(double suma, boolean arBankinisPavedimas, String papildomaInfo) {
		
		IslaiduIrasas isl = new IslaiduIrasas(suma, arBankinisPavedimas, papildomaInfo);
		isl.setData(printLaika());

		for (int i = 0; i < islaidos.length; i++) {
			IslaiduIrasas islaidos1 = islaidos[i];
			if (islaidos1 == null) {
				islaidos[i] = isl;
				break;
			}

		}
		
	}

	public void gautiPajamuIrasa() {

		for (int i = 0; i < pajamos.length; i++) {
			if (pajamos[i] == null) {
				break;
			} else {

				DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");

				System.out.print(pajamos[i].getKategorija() + ") ");
				System.out.print("Suma: " + pajamos[i].getSuma() + " | ");
				System.out.print("Data: " + dateFormat.format(pajamos[i].getData()) + " | ");
				System.out.print("Paskirtis: " + pajamos[i].getPapildomaInfo() + " | ");

				if (pajamos[i].isPozymisArIBanka() == true) {
					System.out.println("Bankinis pavedimas");
				} else {
					System.out.println("Gryni pinigai");
				}

			}
		}
	}

	public void gautiIslaiduIrasa() {
		
		for (int i = 0; i < islaidos.length; i++) {
			if (islaidos[i] == null) {
				break;
			} else {

				DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm");

				System.out.print(islaidos[i].getKategorija() + ") ");
				System.out.print("Suma: " + islaidos[i].getSuma() + " | ");
				System.out.print("Data: " + dateFormat.format(islaidos[i].getData()) + " | ");
				System.out.print("Paskirtis: " + islaidos[i].getPapildomaInfo() + " | ");

				if (islaidos[i].isArBankinisPavedimas() == true) {
					System.out.println("Bankinis pavedimas");
				} else {
					System.out.println("Gryni pinigai");
				}

			}
		}
		
	}

	public Date printLaika() {
		Date date = new Date();
		return date;
	}
}
