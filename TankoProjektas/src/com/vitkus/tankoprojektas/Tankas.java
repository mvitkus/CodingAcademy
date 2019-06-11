package com.vitkus.tankoprojektas;

public class Tankas {

	private Point point = new Point(0, 0);

	private int šūvisĮpriekį = 0;
	private int šūvisAtgal = 0;
	private int šūvisĮKairę = 0;
	private int šūvisĮDešinę = 0;

	private int getŠūvisĮpriekį() {
		return šūvisĮpriekį;
	}

	private void setŠūvisĮpriekį(int šūvisĮpriekį) {
		this.šūvisĮpriekį = šūvisĮpriekį;
	}

	private int getŠūvisAtgal() {
		return šūvisAtgal;
	}

	private void setŠūvisAtgal(int šūvisAtgal) {
		this.šūvisAtgal = šūvisAtgal;
	}

	private int getŠūvisĮKairę() {
		return šūvisĮKairę;
	}

	private void setŠūvisĮKairę(int šūvisĮKairę) {
		this.šūvisĮKairę = šūvisĮKairę;
	}

	private int getŠūvisĮDešinę() {
		return šūvisĮDešinę;
	}

	private void setŠūvisĮDešinę(int šūvisĮDešinę) {
		this.šūvisĮDešinę = šūvisĮDešinę;
	}

	private Kryptys getKryptis() {
		return kryptis;
	}

	private void setKryptis(Kryptys kryptis) {
		this.kryptis = kryptis;
	}

	private Kryptys kryptis;

//	private Point getPoint() {
//		return point;
//	}
//
//	private void setPoint(Point point) {
//		this.point = point;
//	}

	public void Pirmyn() {

		int x = point.getX();
		int y = point.getY();

		y = y + 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.PIRMYN);

		System.out.println("Tankas pajuda į Šiaurę " + point);

	}

	public void Atgal() {

		int x = point.getX();
		int y = point.getY();

		y = y - 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.ATGAL);

		System.out.println("Tankas pajuda į Pietus " + point);

	}

	public void Dešinėn() {

		int x = point.getX();
		int y = point.getY();

		x = x + 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.DEŠINĖ);

		System.out.println("Tankas pajuda į Rytus " + point);

	}

	public void Kairėn() {

		int x = point.getX();
		int y = point.getY();

		x = x - 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.KAIRĖ);

		System.out.println("Tankas pajuda į Vakarus " + point);

	}

	public void Suvis() {

		if (getKryptis() == Kryptys.PIRMYN) {
			setŠūvisĮpriekį(šūvisĮpriekį + 1);
			System.out.println("Šūvis į Šiaurę");
		} else if (getKryptis() == Kryptys.ATGAL) {
			setŠūvisAtgal(šūvisAtgal + 1);
			System.out.println("Šūvis į Pietus");
		} else if (getKryptis() == Kryptys.DEŠINĖ) {
			setŠūvisĮDešinę(šūvisĮDešinę + 1);
			System.out.println("Šūvis į Rytus");
		} else {
			setŠūvisĮKairę(šūvisĮKairę + 1);
			System.out.println("Šūvis į Vakarus");
		}
	}

	public void Info() {

		
		System.out.print("INFO: Tanko koordinatės: " + point);

		if (getKryptis() == Kryptys.PIRMYN) {
			System.out.println(", kryptis: ŠIAURĖ ");
		}

		if (getKryptis() == Kryptys.ATGAL) {
			System.out.println(", kryptis: PIETŪS ");
		}

		if (getKryptis() == Kryptys.KAIRĖ) {
			System.out.println(", kryptis: VAKARAI ");
		}

		if (getKryptis() == Kryptys.DEŠINĖ) {
			System.out.println(", kryptis: RYTAI ");
		}

		
		System.out.print("INFO: Tanko šūviai: ");

		System.out.print(getŠūvisĮpriekį() + " į Šiaurę, ");
		System.out.print(getŠūvisĮDešinę() + " į Rytus, ");

		System.out.print(getŠūvisAtgal() + " į Pietus, ");
		System.out.print(getŠūvisĮKairę() + " į Vakarus, ");

		int suviaiTotal = getŠūvisAtgal() + getŠūvisĮDešinę() + getŠūvisĮKairę() + getŠūvisĮpriekį();

		System.out.println("Iš viso šūvių: " + suviaiTotal);

		

	}


}
