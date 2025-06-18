package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA= new Producto();
		Producto productoB= new Producto();
		Producto productoC= new Producto();
		
		productoA.setNombre("Ibuprofeno 400mg");
		productoA.setDescripcion("Analgesico y antiInflamatorio");
		productoA.setPrecio(3.50);
		productoA.setStockActual(50);
		
		productoB.setNombre("Protector Solar");
		productoB.setDescripcion("proteccion contra rayos UVA Y UVB");
		productoB.setPrecio(10.50);
		productoB.setStockActual(75);
		
		productoC.setNombre("Suero Fisiologico");
		productoC.setDescripcion("para limpieza de heridas");
		productoC.setPrecio(2.60);
		productoC.setStockActual(100);
		
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
