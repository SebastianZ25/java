package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA= new Producto("Ibuprofeno 400mg","Analgesico y antiInflamatorio",3.50,50);
		Producto productoB= new Producto("Protector Solar","proteccion contra rayos UVA Y UVB",10.50,75);
		Producto productoC= new Producto("Suero Fisiologico","para limpieza de heridas",2.60,100);
		
	
		
		System.out.println("Nombre de Producto A: "+ productoA.getNombre());
		System.out.println("Descripcion de Producto A: "+ productoA.getDescripcion());
		System.out.println("Precio Producto A: "+ productoA.getPrecio());
		System.out.println("StockActual de Producto A: "+ productoA.getStockActual());
		
		System.out.println("------------");
		
		System.out.println("Nombre de Producto B: "+ productoB.getNombre());
		System.out.println("Descripcion de Producto B: "+ productoB.getDescripcion());
		System.out.println("Precio Producto B: "+ productoB.getPrecio());
		System.out.println("StockActual de Producto B: "+ productoB.getStockActual());
		
		System.out.println("------------");
		
		System.out.println("Nombre de Producto C: "+ productoC.getNombre());
		System.out.println("Descripcion de Producto C: "+ productoC.getDescripcion());
		System.out.println("Precio Producto C: "+ productoC.getPrecio());
		System.out.println("StockActual de Producto C: "+ productoC.getStockActual());
		
		
		
	}

}
