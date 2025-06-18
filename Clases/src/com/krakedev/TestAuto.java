package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		//modificar atributos
		auto1.setMarca("chevrolet");
		auto1.setAnio(2024);
		auto1.setPrecio(19.999);
		
		auto2.setMarca("porsche");
		auto2.setAnio (2025);
		auto2.setPrecio(122.99);
		
		System.out.println("Marca de Auto1:"+ auto1.getMarca());
		System.out.println("Anio de Auto1:"+ auto1.getAnio());
		System.out.println("Precio de Auto1:"+ auto1.getPrecio());
		
		System.out.println("------------");
		
		System.out.println("Marca de Auto 2:"+ auto2.getMarca());
		System.out.println("Anio de Auto 2:"+ auto2.getAnio());
		System.out.println("Precio de Auto 2:"+ auto2.getPrecio());

	}

}
