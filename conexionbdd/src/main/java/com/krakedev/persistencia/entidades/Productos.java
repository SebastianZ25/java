package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Productos {
	private int codigo;
	private String nombre;
	private String descripcion;
	private BigDecimal Precio;
	private int stock;
	private Date fechaVencimiento;
	
	public Productos() {}
	
	public Productos(int codigo, String nombre, BigDecimal precio, int stock, Date fechaVencimiento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		Precio = precio;
		this.stock = stock;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return Precio;
	}
	public void setPrecio(BigDecimal precio) {
		Precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", Precio="
				+ Precio + ", stock=" + stock + ", fechaVencimiento=" + fechaVencimiento + "]";
	}


	
	

}
