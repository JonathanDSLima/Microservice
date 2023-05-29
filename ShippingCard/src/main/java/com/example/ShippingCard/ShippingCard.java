package com.example.ShippingCard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class ShippingCard {
	
	public ShippingCard() {
		
	}
	
	public ShippingCard(int valor) {
		super();
		this.valor = valor;
	}
	
	public ShippingCard(Long id, int valor) {
		super();
		this.valor = valor;
		this.id = id;
	}

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int valor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
