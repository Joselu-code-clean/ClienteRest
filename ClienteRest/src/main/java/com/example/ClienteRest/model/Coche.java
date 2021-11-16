package com.example.ClienteRest.model;

public class Coche {

	private String status;
	private String modelo;
	private Integer nPuertas;
	
	
	
	public Coche(String status, String modelo, Integer nPuertas) {
		super();
		this.status = status;
		this.modelo = modelo;
		this.nPuertas = nPuertas;
	}
	
	
	public Coche() {
		
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getnPuertas() {
		return nPuertas;
	}
	public void setnPuertas(Integer nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	
	
	
}
