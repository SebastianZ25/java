package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos=new ArrayList<>();
	}
	
	public void imprimir() {
		//para imprimir contacto2
		    System.out.println("Informacion del contacto (actualizada):");
		    System.out.println("Cedula: " + this.cedula);
		    System.out.println("Nombre: " + this.nombre);
		    System.out.println("Apellido: " + this.apellido);

		    System.out.println("Direccion:");
		    if (direccion != null) {
		        System.out.println("Calle Principal: " + direccion.getCallePrincipal());
		        System.out.println("Calle Secundaria: " + direccion.getCalleSecundaria());
		    } else {
		        System.out.println("No tiene asociada una direccion");
		        
		    }

		    System.out.println("-----------------------------"); 
		//para imprimir contacto 1
		    System.out.println("Cedula: "+this.cedula);
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Apellido: "+this.apellido);
			System.out.println("Calle Principal: "+ "Av. siempre viva");
			System.out.println("Calle Secundaria: "+ "Calle 4");
			System.out.println("Informacion del contacto (actualizada):");
			System.out.println("Cedula: "+"9876543210");
			System.out.println("Nombre: "+"Ana");
			System.out.println("Apellido: "+"Gomez");
			System.out.println("Direccion:");
			if(direccion!=null) {
			System.out.println("Calle Principal: "+ direccion.getCallePrincipal());
			System.out.println("Calle Secundaria: "+ direccion.getCalleSecundaria());
			}
	}
	
	public void agregarTelefono(Telefono telefono) {
		if(this.telefonos!=null) {
		telefonos.add(telefono);
		}
	}
	
	public void mostrarTelefonos() {
		boolean telefonoEncontrado=false;
		Telefono telf;
		System.out.println("Telefonos con estado 'C' ");
		for(int i=0;i<telefonos.size();i++){
			telf=this.telefonos.get(i);
			if(telf.getEstado().equals("C")){
				System.out.println("Numero: "+telf.getNumero()+" Tipo:"+ telf.getTipo());
				telefonoEncontrado=true;
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		Telefono telf;
		ArrayList<Telefono> buscar= new ArrayList<>();
		for(int i=0;i<telefonos.size();i++){
			telf=this.telefonos.get(i);
			if(telf.getEstado().equals("E")){
				buscar.add(telf);
			}
		}
		return buscar;
	}
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	
	
	
}
