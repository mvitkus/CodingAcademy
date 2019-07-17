package com.vitkus.asmenskodas.generatorius;

import com.vitkus.asmenskodas.skaitliukas.*;

public class AsmensKodoGeneratorius {

	void generuoti() {

	}

	public static void main(String[] args) {

		Skaitliukas skaitliukas = new Skaitliukas();
		skaitliukas.getN();

		String skaicius;

		skaitliukas.nustatytiNumatytajaReiksme();

		
		
		System.out.println("Vyriski id:");
		for(int i=0;i<999;i++) {
			String vienas;
			String sugeneruotas = generateMan()+"190206"+skaitliukas.didintiVienetu();
			vienas = generuotiKontrolini(sugeneruotas);
			String galutinis = sugeneruotas+vienas;
			//String kontrolinisSk=generuotiKontrolini(sugeneruotas);
			//String galutinis = ""+generateMan()+"190206"+skaitliukas.didintiVienetu()+kontrolinisSk;
			System.out.println(galutinis);
		}
		System.out.println("###########");
		System.out.println("Moteriski id: ");
		System.out.println("###########");
		skaitliukas.nustatytiNumatytajaReiksme();
		
		for(int i=0;i<999;i++) {
			String vienas;
			String sugeneruotas = generateWoman()+"190206"+skaitliukas.didintiVienetu();
			vienas = generuotiKontrolini(sugeneruotas);
			String galutinis = sugeneruotas+vienas;
			System.out.println(galutinis);
		}
		


	}
	
	public static String generuotiKontrolini(String stringas) {
		
		String naujas = stringas.substring(0, stringas.length());
		String[] masyvas = naujas.split("");

		int A = Integer.parseInt(masyvas[0]);
		int B = Integer.parseInt(masyvas[1]);
		int C = Integer.parseInt(masyvas[2]);
		int D = Integer.parseInt(masyvas[3]);
		int E = Integer.parseInt(masyvas[4]);
		int F = Integer.parseInt(masyvas[5]);
		int G = Integer.parseInt(masyvas[6]);
		int H = Integer.parseInt(masyvas[7]);
		int I = Integer.parseInt(masyvas[8]);
		int J = Integer.parseInt(masyvas[9]);
		String K;
		int k =paskaiciuotiKreiksme(A,B,C,D,E,F,G,H,I,J);
		K = Integer.toString(k);
		
		
		
		
		return K;
	}

	private static int paskaiciuotiKreiksme(int A, int B, int C, int D, int E, int F, int G, int H, int I, int J) {
		int K;
		int S = A*1 + B*2 + C*3 + D*4 + E*5 + F*6 + G*7 + H*8 + I*9 + J*1;
		
		if(S%11!=10) {
			K=S%11;
		}else {
			S = A*3 + B*4 + C*5 + D*6 + E*7 + F*8 + G*9 + H*1 + I*2 + J*3; 
			if(S%11!=10) {
				K=S%11;
			}else {
				K=0;
			}
		}
		return K;
	}

	public static String generateWoman() {

		return "6";
	}

	public static String generateMan() {

		return "5";
	}
	


}
