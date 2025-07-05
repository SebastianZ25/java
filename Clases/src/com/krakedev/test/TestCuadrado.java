package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		double areaC1;
		double areaC2;
		double areaC3;
		
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		c1.setLado(7);
		
		c2.setLado(24);
		
		c3.setLado(45);
		
		areaC1=c1.calcularAreaCuadrado();
		areaC2=c2.calcularAreaCuadrado();
		areaC3=c3.calcularAreaCuadrado();
		
		perimetroC1=c1.calcularPerimetroCuadrado();
		perimetroC2=c2.calcularPerimetroCuadrado();
		perimetroC3=c3.calcularPerimetroCuadrado();
		
		System.out.println("Area Cuadrado C1: "+areaC1);
		System.out.println("Area Cuadrado C2: "+areaC2);
		System.out.println("Area Cuadrado C3: "+areaC3);
		System.out.println("-----------");
		System.out.println("Perimetro Cuadrado C1: "+perimetroC1);
		System.out.println("Perimetro Cuadrado C2: "+perimetroC2);
		System.out.println("Perimetro Cuadrado C3: "+perimetroC3);

	}

}
