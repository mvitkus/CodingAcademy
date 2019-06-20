package com.vitkus.biudzetoprojektas;

import java.time.LocalDateTime;
import java.util.Date;

public class Irasas {

	private double suma;
	private LocalDateTime data;
	private String papildomaInfo;
	private static int counter = 0;
	private int id;

	public Irasas(double suma, String papildomaInfo) {
		super();
		this.suma = suma;
		this.papildomaInfo = papildomaInfo;
		setCounter();
		this.id = counter;
		data=printLaika();
	}
	
	public Irasas(int id, double suma, String papildomaInfo, LocalDateTime data) {
		super();
		this.suma = suma;
		this.papildomaInfo = papildomaInfo;
		setCounter();
		this.id = id;
		this.data = data;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getPapildomaInfo() {
		return papildomaInfo;
	}

	public void setPapildomaInfo(String papildomaInfo) {
		this.papildomaInfo = papildomaInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCounter() {
		counter++;
	}
	
	public LocalDateTime printLaika() {
		LocalDateTime date = LocalDateTime.now();
		return date;
}

	@Override
    public boolean equals(Object irasas) {
        if(id == getId()) { 
            return true;
        }
        else return false;
    }
}
