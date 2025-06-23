package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono("movi", "021574698", 52);
		Telefono telef2 = new Telefono("claro", "879654122", 55);
		Contacto c1 = new Contacto("Juan", "Lopez", telef1, 65.5);
		Contacto c2 = new Contacto("Maria", "Perez", telef2, 70.5);
		AdminContactos c01=new AdminContactos();
		
		Contacto masPesado;
		boolean compararOperadoras;
		masPesado=c01.buscarMasPesado(c1,c2);
		compararOperadoras=c01.compararOperadoras(c1,c2);
		
		System.out.println(masPesado.getNombre() + " " + masPesado.getApellido() + " num:" + masPesado.getTelefono().getNumero() + " operadora:" + masPesado.getTelefono().getOperadora()
		+ " Peso:" + masPesado.getPeso()+ " kg Es el mas Pesado");
		
		System.out.println(compararOperadoras);
	}

}
