package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1. Declaro la variable llamada p de tipo Persona
		Persona p2 = new Persona();
		p = new Persona(); // 2. Instanciar un objeto Persona, referenciarlo con p
		Persona p3=new Persona("Pablo");
		Persona p4=new Persona("Rocio", 43,1.65);

		System.out.println("nombre:" + p4.getNombre());
		System.out.println("edad:" + p4.getEdad());
		System.out.println("estatura:" + p4.getEstatura());
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
