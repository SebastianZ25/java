package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersona {

	public static void main(String[] args) {
		AdminPersonas admin= new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Javier","lopez",42));
		admin.agregar(new Persona("Bruno","Diaz",25));
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Mario");
		//trabajar con null,porq bucarPorNombre retorna null si no encuentra
		if(p1!=null) {
		System.out.println("Persona Encontrada:"+p1.getApellido()+" "+ p1.getEdad());
		}else {
			System.out.println("Persona no Encontrada");
		}
		//buscar Varios
		ArrayList<Persona> personasMayores=admin.buscarMayor(25);
		System.out.println("Mayores: "+personasMayores.size());
		
	}
	
	
	

}
