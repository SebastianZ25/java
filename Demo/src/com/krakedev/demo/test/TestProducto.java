package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto(886597,"audifonos");
		producto1.setDescripcion("Cuentan con cancelacion de ruido");
		producto1.setPeso(0.51);

		System.out.println("Codigo: "+ producto1.getCodigo());
		System.out.println("Nombre: "+ producto1.getNombre());
		System.out.println("Descripcion: "+ producto1.getDescripcion());
		System.out.println("Peso: "+ producto1.getPeso()+ " kg");
	}

}
