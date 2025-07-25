package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public Producto(String codigo, String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	public Producto( String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	public void incrementarPrecio(int porcentaje) {
		double incrementar;
		incrementar=this.precio*porcentaje / 100;
		this.precio += incrementar;
	}
	
	public void disminuirPrecio(double porcentaje) {
		double disminuir;
		disminuir=this.precio*porcentaje /100;
		this.precio -= disminuir;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
