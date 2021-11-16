package com.example.ClienteRest.builder;

import com.example.ClienteRest.model.Coche;

public class RotorBuilder implements BuilderI{

	
	Coche coche = new Coche();
	
	public RotorBuilder conModelo(String modelo) {
		this.coche.setModelo(modelo);
		return this;
	}
	
	public RotorBuilder conNumPuertas(Integer numero) {
		this.coche.setnPuertas(numero);;
		return this;
	}
	
	
	@Override
	public Coche builder() {
		return this.coche;
	}

	
	
}
