package com.mp.mp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Fiscalia")
public class Fiscalia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fs_id", length=10, nullable=false)
	private int fs_id;
	
	@Column(name="fs_nombre", length=50)
	private String fs_nombre;
	
	@Column(name="fs_direccion", length=500)
	private String fs_direccion;
	
	@Column(name="fs_numero", length=13)
	private String fs_numero;
	
	public Fiscalia() {
		super();
	}

	public Fiscalia(int fs_id, String fs_nombre, String fs_direccion, String fs_gps, String fs_numero) {
		super();
		this.fs_id = fs_id;
		this.fs_nombre = fs_nombre;
		this.fs_direccion = fs_direccion;
		this.fs_numero = fs_numero;
	}
	
	public Fiscalia(String fs_nombre, String fs_direccion, String fs_gps, String fs_numero) {
		super();
		this.fs_nombre = fs_nombre;
		this.fs_direccion = fs_direccion;
		this.fs_numero = fs_numero;
	}

	public int getFs_id() {
		return fs_id;
	}

	public void setFs_id(int fs_id) {
		this.fs_id = fs_id;
	}

	public String getFs_nombre() {
		return fs_nombre;
	}

	public void setFs_nombre(String fs_nombre) {
		this.fs_nombre = fs_nombre;
	}

	public String getFs_direccion() {
		return fs_direccion;
	}

	public void setFs_direccion(String fs_direccion) {
		this.fs_direccion = fs_direccion;
	}

	public String getFs_numero() {
		return fs_numero;
	}

	public void setFs_numero(String fs_numero) {
		this.fs_numero = fs_numero;
	}

	public Fiscalia orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
