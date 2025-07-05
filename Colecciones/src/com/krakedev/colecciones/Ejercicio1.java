package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		String valorRecuperado;
		cadenas=new ArrayList<String>();
		System.out.println(cadenas.size());
		//agregar elementos
		cadenas.add("uno");
		cadenas.add("dos");
		
		System.out.println(cadenas.size());
		//recuperar array
		valorRecuperado=cadenas.get(1);
		System.out.println(valorRecuperado);
		//i sea menor que size,osea tamaño del array
		String cadena;
		for(int i=0;i<cadenas.size();i++) {
			cadena=cadenas.get(i);
			System.out.println("cadena:"+cadena);
		}
	}

}
