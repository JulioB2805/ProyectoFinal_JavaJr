package com.snpp.crudmovimiento_Julio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "movimientos")
public class Movimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movimiento")
	Integer id;
	String tipo;
	Double monto;
	
	//1
	public Movimiento() {
		super();
	}

	//2
	public Movimiento(Integer id, String tipo, Double monto) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.monto = monto;
	}

	
	//3
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	

}
