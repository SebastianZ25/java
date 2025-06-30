package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		double numeroAleatorio;
		numeroAleatorio=Math.random()*52;
		return (int) numeroAleatorio;
		
	}
}
