package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono("movi", "025557448", 60);
		Telefono telef2 = new Telefono("movi", "836662242", 77);
		Contacto c1 = new Contacto("Javier", "Mendez", telef1, 80.5);
		Contacto c2 = new Contacto("Valeria", "Bravo", telef2, 71.5);

		AdminContactos c02 = new AdminContactos();

		Contacto masPesado;
		boolean compararOperadoras;
		masPesado = c02.buscarMasPesado(c1, c2);
		compararOperadoras = c02.compararOperadoras(c1, c2);

		System.out.println(masPesado.getNombre() + " " + masPesado.getApellido() + " num:"
				+ masPesado.getTelefono().getNumero() + " operadora:" + masPesado.getTelefono().getOperadora()
				+ " Peso:" + masPesado.getPeso() + " kg Es el mas Pesado");

		System.out.println(compararOperadoras);
	}

}
