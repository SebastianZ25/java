package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;
//System.out.printl solo se va a poder usar en los test

public class TestAdminPersona {

	public static void main(String[] args) {
		Persona p=new Persona("1759863255","Carlitos","Jaramillo");
		try {
			Date fechaNac=Convertidor.convertirFecha("2002/02/13");
			Date HoraNac=Convertidor.convertirHora("09:30");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(HoraNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(8);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	
		

	}

}
