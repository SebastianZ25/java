package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a = null;
		try {
			System.out.println("Abre la conexion BDD");
			a.substring(3);
			System.out.println("fin");
			
		} catch (Exception ex) {
			System.out.println("entra al catch");
			//El Finally se ejecuta ocurra o no la excepcion
		} finally {
			System.out.println("ingresa al finally");
			System.out.println("Cierra la conexion BDD");
		}
		
		System.out.println("fuera del catch");
		
		

	}

}