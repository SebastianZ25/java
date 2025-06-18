package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1. Declaro la variable llamada p de tipo Persona
		Persona p2 = new Persona();
		p = new Persona(); // 2. Instanciar un objeto Persona, referenciarlo con p

		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		// 4.Modificar los atributos
		p.setNombre("Juan");
		p.setEdad(45);
		p.setEstatura(1.56);
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		p2.setNombre ("Roberto");
		System.out.println("nombre:" + p2.getNombre());
	}

}
