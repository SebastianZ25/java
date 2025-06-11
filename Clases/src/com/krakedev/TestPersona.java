package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1. Declaro la variable llamada p de tipo Persona
		Persona p2 = new Persona();
		p = new Persona(); // 2. Instanciar un objeto Persona, referenciarlo con p

		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		// 4.Modificar los atributos
		p.nombre = "Juan";
		p.edad = 45;
		p.estatura = 1.56;
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		p2.nombre = "Roberto";
		System.out.println("nombre:" + p2.nombre);
	}

}
