package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av Siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		
		System.out.println("Nombre:"+nombre);
		//d1 esta null, y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
							// null.algunMetodo();
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av shyris", "Eloy Alfaro","S/N");
		p2.setDireccion(d2);
		p2.setNombre("Pepe");
		p2.imprimir();
		p1.imprimir();
		
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xx","zz","234"));
		p3.imprimir();
	}

}
