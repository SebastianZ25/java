package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		//modificar atributos
		auto1.marca="chevrolet";
		auto1.anio= 2024;
		auto1.precio=19.999;
		
		auto2.marca="porsche";
		auto2.anio= 2025;
		auto2.precio=122.99;
		
		System.out.println("Marca de Auto1:"+ auto1.marca);
		System.out.println("Anio de Auto1:"+ auto1.anio);
		System.out.println("Precio de Auto1:"+ auto1.precio);
		
		System.out.println("------------");
		
		System.out.println("Marca de Auto 2:"+ auto2.marca);
		System.out.println("Anio de Auto 2:"+ auto2.anio);
		System.out.println("Precio de Auto 2:"+ auto2.precio);

	}

}
