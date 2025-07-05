package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	// arrayList como atributo
	private ArrayList<Persona> personas;

	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}

	// la persona que me llega como parametro la agrego a mi array
	public void agregar(Persona persona) {
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println("Persona: "+elementoPersona.getNombre()+" "+ elementoPersona.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada=null;
		Persona elementoPersona=null;
		
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(nombre.equals(elementoPersona.getNombre())) {
				personaEncontrada=elementoPersona;
			}
		}
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayor(int edad){
		ArrayList<Persona> mayores= new ArrayList<Persona>();
		Persona elementoPersona=null;
		
		for(int i=0;i<personas.size();i++) {
			 elementoPersona=personas.get(i);
			 if(elementoPersona.getEdad()> edad) {
				 mayores.add(elementoPersona);
			 }
		}
		return mayores;
	}
}
