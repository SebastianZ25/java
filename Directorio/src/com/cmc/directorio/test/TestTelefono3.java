package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","674258661",15);
		Telefono telf2=new Telefono("claro","66522136",35);
		Telefono telf3=new Telefono("movi","967413214",40);
		AdminTelefono at=new AdminTelefono();
		int contar;
		contar=at.contarMovi(telf1, telf2, telf3);
		 System.out.println("Cantidad de numeros Movi: "+contar);
	}

}
