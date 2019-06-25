package com.vitkus.traukinys;

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
		}
	}

	public void vaziuoti() {
		setArVaziuoja(true);
		System.out.println("Traukinys vaziuoja..");
	}

	public void sustoti() {
		setArVaziuoja(false);
		System.out.println("Traukinys sustojo..");
	}

	public void gautiKeleiviuSarasa() {

		for (int i = 0; i < keleivis.size(); i++) {
			System.out.println(keleivis.get(i));
		}
	}

	public void issaugotiDuomenisIFaila() {
	}

	public void ilaipintiKeleivi(Keleivis keleivisAdd) {
		keleivis.add(keleivisAdd);

	}

}
