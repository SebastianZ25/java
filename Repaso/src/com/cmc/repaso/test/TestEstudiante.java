package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1=new Estudiante("Juan");
		Estudiante estudiante2=new Estudiante("Pepe");
		
		estudiante1.Calificar(9);
		estudiante2.Calificar(5);

		System.out.println(estudiante1.getResultado());
		System.out.println(estudiante2.getResultado());
	}

}
