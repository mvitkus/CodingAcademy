package com.vitkus.asmenskodas.skaitliukas;

public class Skaitliukas {

	private static String n = "000";
	
	

	public static String getN() {
		return n;
	}

	public static void setN(String n) {
		Skaitliukas.n = n;
	}

	public static String didintiVienetu() {
		String naujas = n.substring(0, n.length());
		String[] masyvas = naujas.split("");

		int a = Integer.parseInt(masyvas[0]);
		int b = Integer.parseInt(masyvas[1]);
		int c = Integer.parseInt(masyvas[2]);
		String validusString = n;
		if (a == 0 && b == 0 && c <= 8) {
			c++;
			validusString = "00" + c;
		} else if (a == 0 && b == 0 && c == 9) {
			c = 0;
			b++;
			validusString = "0" + b + c;

		} else if (a == 0 && b >= 1 && b < 9 && c <= 8) {
			c++;
			validusString = "0" + b + c;
		} else if (a == 0 && b >= 1 && b < 9 && c == 9) {
			c = 0;
			b++;
			validusString = "0" + b + c;
		} else if (a == 0 && b == 9 && c == 9) {
			a++;
			b = 0;
			c = 0;
			validusString = "" + a + b + c;
		}else if (a == 0 && b == 9 && c <=8) {
			c++;
			validusString = "" + a + b + c;
		} 
		
		else if (a != 0 && b < 9 && c < 9) {
			c++;
			validusString = "" + a + b + c;

		} else if (a != 0 && b < 9 && c <= 9) {
			c = 0;
			b++;
			validusString = "" + a + b + c;
		} else if (a != 0 && b == 9 && c == 9) {

			c = 0;
			b = 0;
			a++;
			validusString = "" + a + b + c;
		} else if (a != 0 && b == 9 && c <= 8) {

			c++;

			validusString = "" + a + b + c;
		}
		
		return n = validusString;

	}

	public static void nustatytiNumatytajaReiksme() {
		
		n = "000";
	}
}
