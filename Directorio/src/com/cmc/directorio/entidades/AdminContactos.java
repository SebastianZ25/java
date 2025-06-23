package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto p1, Contacto p2) {
		if (p1.getPeso() > p2.getPeso()) {
			return p1;
		} else if (p2.getPeso() > p1.getPeso()) {
			return p2;
		} else {
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto p1, Contacto p2) {
		if(p1.getTelefono().getOperadora()=="movi" && p2.getTelefono().getOperadora()=="movi") {
			return true;
		}else if(p1.getTelefono().getOperadora()=="claro" && p2.getTelefono().getOperadora()=="claro"){
			return true;
		}else {
			return false; 
		}
	}
	
	public void activarUsuario(Contacto c1) {
		if(c1.getTelefono().getTieneWhatsapp()) {
			c1.setActivo(true);
		}
		
	}
}
