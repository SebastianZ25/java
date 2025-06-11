package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA= new Producto();
		Producto productoB= new Producto();
		Producto productoC= new Producto();
		
		productoA.nombre="Ibuprofeno 400mg";
		productoA.descripcion="Analgesico y antiInflamatorio";
		productoA.precio=3.50;
		productoA.stockActual=50;
		
		productoB.nombre="Protector Solar";
		productoB.descripcion="proteccion contra rayos UVA Y UVB";
		productoB.precio=10.50;
		productoB.stockActual=75;
		
		productoC.nombre="Suero Fisiologico";
		productoC.descripcion="para limpieza de heridas";
		productoC.precio=2.60;
		productoC.stockActual=100;
		
		System.out.println("Nombre de Producto A: "+ productoA.nombre);
		System.out.println("Descripcion de Producto A: "+ productoA.descripcion);
		System.out.println("Precio Producto A: "+ productoA.precio);
		System.out.println("StockActual de Producto A: "+ productoA.stockActual);
		
		System.out.println("------------");
		
		System.out.println("Nombre de Producto B: "+ productoB.nombre);
		System.out.println("Descripcion de Producto B: "+ productoB.descripcion);
		System.out.println("Precio Producto B: "+ productoB.precio);
		System.out.println("StockActual de Producto B: "+ productoB.stockActual);
		
		System.out.println("------------");
		
		System.out.println("Nombre de Producto C: "+ productoC.nombre);
		System.out.println("Descripcion de Producto C: "+ productoC.descripcion);
		System.out.println("Precio Producto C: "+ productoC.precio);
		System.out.println("StockActual de Producto C: "+ productoC.stockActual);
		
		
		
	}

}
