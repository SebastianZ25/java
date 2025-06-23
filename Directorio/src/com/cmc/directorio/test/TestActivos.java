package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		//No tiene WhatsApp
		Telefono telef1=new Telefono("claro","12365484",66);
		Contacto c1 = new Contacto("Juan", "Lopez", telef1, 65.5);
		
		System.out.println(telef1.getOperadora());
		System.out.println(telef1.getNumero());
		System.out.println(telef1.getCodigo());
		System.out.println(telef1.getTieneWhatsapp());
		
		AdminContactos c11=new AdminContactos();
		
		c11.activarUsuario(c1);
		System.out.println("Activo:"+c1.getActivo());
		//Si tiene WhatsApp por lo que, Activo de coloca en true
		System.out.println("Ya tiene WhatsApp");
		Telefono telf=new Telefono("movi","12365484",66);
		Contacto c2 = new Contacto("Juan", "Lopez", telf, 65.5);
		AdminTelefono at=new AdminTelefono();
		at.activarMensajeria(telf);
		
		System.out.println("Operadora:"+telf.getOperadora());
		System.out.println("Numero telf:"+telf.getNumero());
		System.out.println("Codigo:"+telf.getCodigo());
		System.out.println("Tiene:"+telf.getTieneWhatsapp());
		c11.activarUsuario(c2);
		System.out.println("Activo: "+c2.getActivo());
	}

}
