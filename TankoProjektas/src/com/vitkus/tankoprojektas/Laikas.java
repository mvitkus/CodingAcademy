package com.vitkus.tankoprojektas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Laikas {
	public void printLaika() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
	}

}
