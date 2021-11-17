package com.example.ClienteRest.builder;

import com.example.ClienteRest.model.Coche;

public class CocheBuilder implements BuilderI{

	
	Coche coche = new Coche();
	
	public CocheBuilder conModelo(String modelo) {
		this.coche.setModelo(modelo);
		return this;
	}
	
	public CocheBuilder conNumPuertas(Integer numero) {
		this.coche.setnPuertas(numero);;
		return this;
	}
	
	
	@Override
	public Coche builder() {
		return this.coche;
	}

	
	
}
