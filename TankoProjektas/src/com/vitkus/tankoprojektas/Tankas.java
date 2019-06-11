package com.vitkus.tankoprojektas;

public class Tankas {

	private Point point = new Point(0, 0);
	
	private int šūvisĮpriekį =0;
	private int šūvisAtgal =0;
	private int šūvisĮKairę =0;
	private int šūvisĮDešinę =0;
	
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

		Double x = point.getX();
		Double y = point.getY();

		y = y + 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.PIRMYN);

	}

	public void Atgal() {

		Double x = point.getX();
		Double y = point.getY();

		y = y - 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.ATGAL);

	}

	public void Dešinėn() {

		Double x = point.getX();
		Double y = point.getY();

		x = x + 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.DEŠINĖ);

	}

	public void Kairėn() {

		Double x = point.getX();
		Double y = point.getY();

		x = x - 1;

		point.setX(x);
		point.setY(y);

		setKryptis(Kryptys.KAIRĖ);

	}

	public void Suvis() {
		
		if(getKryptis() == Kryptys.PIRMYN) {
			setŠūvisĮpriekį(šūvisĮpriekį+1);
		}else if(getKryptis() == Kryptys.ATGAL) {
			setŠūvisAtgal(šūvisAtgal+1);
		}else if(getKryptis() == Kryptys.DEŠINĖ) {
			setŠūvisĮDešinę(šūvisĮDešinę+1);
		}else {setŠūvisĮKairę(šūvisĮKairę+1);}
	}

	public void Info() {
		System.out.println("Koordinatės: ");
		System.out.println(point);
		

		if(SuviaiIsViso()>0) {
			if(getŠūvisĮpriekį()>0) {
		System.out.println("Šūviai į priekį: " + getŠūvisĮpriekį() );
			}
			if(getŠūvisAtgal()>0) {
		System.out.println("Šūviai atgal: " + getŠūvisAtgal() );
			}
			if(getŠūvisĮDešinę()>0) {
		System.out.println("Šūviai į dešinę: "+ getŠūvisĮDešinę());
			}
			if(getŠūvisĮKairę()>0) {
		System.out.println("Šūviai į kairę: "+ getŠūvisĮKairę());
			}
		}

	}
	
	private int SuviaiIsViso() {
		
		return getŠūvisĮpriekį()+getŠūvisAtgal()+getŠūvisĮDešinę()+getŠūvisĮKairę();
	}

}
