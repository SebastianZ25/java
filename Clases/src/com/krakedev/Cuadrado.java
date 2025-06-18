package com.krakedev;

public class Cuadrado {
	private double lado;
	public double calcularAreaCuadrado(){
		double area= lado*lado;
		return area;
	}
	public double calcularPerimetroCuadrado(){
		double perimetro=lado *4;
		return perimetro;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
