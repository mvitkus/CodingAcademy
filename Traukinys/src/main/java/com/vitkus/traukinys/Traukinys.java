package com.vitkus.traukinys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Traukinys extends TransportoPriemone {

	private int sedimosVietos = 0;
	private int vietosNeigaliesiems = 0;
	private boolean arVaziuoja = false;

	ArrayList<Keleivis> keleivis = new ArrayList<Keleivis>();

	public Traukinys(int sedimosVietos, int vietosNeigaliesiems) {
		super();
		this.sedimosVietos = sedimosVietos;
		this.vietosNeigaliesiems = vietosNeigaliesiems;
	}

	public int getSedimosVietos() {
		return sedimosVietos;
	}

	public void setSedimosVietos(int sedimosVietos) {
		this.sedimosVietos = sedimosVietos;
	}

	public int getVietosNeigaliesiems() {
		return vietosNeigaliesiems;
	}

	public void setVietosNeigaliesiems(int vietosNeigaliesiems) {
		this.vietosNeigaliesiems = vietosNeigaliesiems;
	}

	public boolean isArVaziuoja() {
		return arVaziuoja;
	}

	public void setArVaziuoja(boolean arVaziuoja) {
		this.arVaziuoja = arVaziuoja;
	}

	public void islaipintiVisusKeleivius() {

		if (arVaziuoja) {
			System.out.println("Traukinys vaziuoja, islaipinti negalima");
		} else {
			keleivis.clear();
			System.out.println("Visi keleiviai buvo islaipinti");
		}
	}

	public void vaziuoti() {

		if (arVaziuoja == false) {
			setArVaziuoja(true);
			System.out.println("Traukinys vaziuoja..");
		} else {
			System.out.println("Traukinys jau vaziuoja.");
		}

	}

	public void sustoti() {

		if (arVaziuoja == true) {
			setArVaziuoja(false);
			System.out.println("Traukinys sustojo..");

		} else {
			System.out.println("Traukinys jau sustojes.");
		}

	}

	public void gautiKeleiviuSarasa() {

		for (int i = 0; i < keleivis.size(); i++) {
			System.out.println(keleivis.get(i));
		}
	}

//	public void issaugotiDuomenisIFaila() {
//	}

	public void ilaipintiKeleivi(Keleivis keleivisAdd) throws PerpildytaException {
		
		if (keleivis.size()+1 > sedimosVietos) {

			throw new PerpildytaException("Traukinys pilnas");
		} else {
			keleivis.add(keleivisAdd);
		}

	}

	public void irasytiIfaila(String filename) {
		final String COMMA_DELIMITER = ",";
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(filename + ".csv");

			// Write a new student object list to the CSV file
			for (Keleivis keleiviai : keleivis) {
				fileWriter.append(String.valueOf(keleiviai.getVardas()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(keleiviai.getPavarde()) + "\n");

			}

			System.out.println("CSV failas sukurtas sekmingai! Failo pavadinimas: " + filename);

		} catch (Exception e) {
			System.out.println("Klaida failo irasyme");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}

	}

}
