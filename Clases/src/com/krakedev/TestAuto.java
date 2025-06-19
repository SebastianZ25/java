package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto("chevrolet",2024,19.999);
		Auto auto2=new Auto("porsche", 2025,1220.98);
		//modificar atributos
		
		
		System.out.println("Marca de Auto1:"+ auto1.getMarca());
		System.out.println("Anio de Auto1:"+ auto1.getAnio());
		System.out.println("Precio de Auto1:"+ auto1.getPrecio());
		
		System.out.println("------------");
		
		System.out.println("Marca de Auto 2:"+ auto2.getMarca());
		System.out.println("Anio de Auto 2:"+ auto2.getAnio());
		System.out.println("Precio de Auto 2:"+ auto2.getPrecio());

	}

}
