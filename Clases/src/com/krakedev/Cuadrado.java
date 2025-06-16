package com.krakedev;

public class Cuadrado {
	public double lado;
	public double calcularAreaCuadrado(){
		double area= lado*lado;
		return area;
	}
	public double calcularPerimetroCuadrado(){
		double perimetro=lado *4;
		return perimetro;
	}
}
