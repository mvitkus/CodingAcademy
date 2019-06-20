package com.vitkus.biudzetoprojektas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class CscFileReader {

	public void getFromCsv(String filename, ArrayList<Irasas> irasai) throws ParseException {

		String line = "";
		BufferedReader buferis = null;
		try {
			buferis = new BufferedReader(new FileReader(filename + ".csv"));
			while ((line = buferis.readLine()) != null) {
				String[] gauta = line.split(",");
				int id = Integer.parseInt(gauta[0]);
				double suma = Float.parseFloat(gauta[1]);
				String info = gauta[2];
			
				boolean arIbanka = Boolean.parseBoolean(gauta[5]);

				int kategorija = Integer.parseInt(gauta[4]);

				if (gauta[4].equals("1")) {
					
					LocalDateTime data =LocalDateTime.parse(gauta[3]);
					Irasas pajamos = new PajamuIrasas(id, suma, info, data, kategorija, arIbanka);
					irasai.add(pajamos);

				} else if (gauta[4].equals("0")) {
					LocalDateTime data =LocalDateTime.parse(gauta[3]);
					Irasas islaidos = new IslaiduIrasas(id, suma, info, data, kategorija, arIbanka);
					irasai.add(islaidos);
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
