package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","587436942",60);
		Telefono telf2=new Telefono("claro","321659741",25);
		Telefono telf3=new Telefono("claro","974526547",30);
		Telefono telf4=new Telefono("claro","456721694",11);
		AdminTelefono at=new AdminTelefono();
		int contarClaro;
		contarClaro=at.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("Cantidad de numeros Claro: "+contarClaro);

	}

}
