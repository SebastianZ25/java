package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		try {
            // Crear un objeto Persona
            Persona persona = new Persona();
        	Date fechaNac=Convertidor.convertirFecha("1991/02/15");
			Date HoraNac=Convertidor.convertirHora("05:40");
            persona.setCedula("1759863255"); 
            persona.setNombre("Carlitos");
            persona.setApellido("Velez");
        	persona.setFechaNacimiento(fechaNac);
			persona.setHoraNacimiento(HoraNac);
            persona.setNumeroHijos(7);
            persona.setEstatura(1.85);
            persona.setCantidadAhorrada(new BigDecimal("1.00"));

            // Llamar al método actualizar
            AdminPersonas.actualizar(persona);
         

        } catch (Exception e) {
        	System.out.println("Error en el sistema: "+e.getMessage());
        }

	}

}
