package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto("Laptop",1500.00);
		
		

		producto1.setPrecio(-1500.00);
		System.out.println(producto1.getPrecio());
		
		double precioDescuento;
		precioDescuento=producto1.calcularPrecioPromo(10);
		System.out.println("Valor Final con Descuento es: "+ precioDescuento);
		
	}

}
