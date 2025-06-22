package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void Vender(int cantidadVendida) {
		this.productosActuales-= cantidadVendida;
		this.productosVendidos+=cantidadVendida;
	}
	
	public void Devolver(int cantidadVendida) {
		this.productosActuales+=cantidadVendida;
		this.productosVendidos-=cantidadVendida;
		this.productosDevueltos+=cantidadVendida;
	}
	
	
	
	public void imprimir() {
		System.out.println("Producto Actuales: "+ this.productosActuales);
		System.out.println("Producto Devueltos: "+ this.productosDevueltos);
		System.out.println("Producto Vendidos: "+ this.productosVendidos);
		System.out.println("+-------------------+");
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
}
