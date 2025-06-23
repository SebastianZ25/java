package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "021574698", 52);
		Contacto c = new Contacto("Juan", "Lopez", telef, 65.5);

		System.out.println(c.getNombre() + " " + c.getApellido() + " num:" + telef.getNumero() + " operadora:" + telef.getOperadora()
				+ " Peso:" + c.getPeso());

	}

}
