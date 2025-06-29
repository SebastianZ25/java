package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechamodificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	

	public Directorio() {
		this.contactos = new ArrayList<>();
		this.fechamodificacion = new Date();
		this.correctos=new ArrayList<>();
		this.incorrectos=new ArrayList<>();
	}

	public boolean agregarContacto(Contacto nuevoContacto) {
		Contacto contactoExistente = this.buscarPorCedula(nuevoContacto.getCedula());
		if (contactoExistente == null) {
			this.contactos.add(nuevoContacto);
			this.fechamodificacion = new Date();
			return true;
		} else {
			return false;
		}

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto contacto;
		for (int i = 0; i < contactos.size(); i++) {
			contacto = this.contactos.get(i);
			if (contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat fecha = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		String fechanueva = fecha.format(fechamodificacion);
		return fechanueva;
	}

	public int contarPerdidos() {
		int contar = 0;
		Contacto contacto;
		for (int i = 0; i < contactos.size(); i++) {
			contacto = contactos.get(i);
			Direccion direccion = contacto.getDireccion();
			if (direccion == null) {
				contar++;
			}
		}
		return contar;
	}

	public int contarFijos() {
		int contar = 0;
		Contacto contacto;
		for (int i = 0; i < contactos.size(); i++) {
			contacto = contactos.get(i);
			ArrayList<Telefono> listaTelefono = contacto.getTelefonos();
			if (listaTelefono != null) {
				for (Telefono telefono : listaTelefono) {
					if (telefono != null) {
						boolean esConvencional = "Convencional".equals(telefono.getTipo());
						boolean esEstadoC = "C".equals(telefono.getEstado());
						if (esConvencional && esEstadoC) {
							contar++;
						}
					}
				}
			}
		}
		return contar;
	}
	
	public void depurar() {
		Contacto contacto;
		for(int i=0;i<contactos.size();i++) {
			contacto=contactos.get(i);
			Direccion direccion=contacto.getDireccion();
			if(direccion!=null) {
				this.correctos.add(contacto);
			}else {
				this.incorrectos.add(contacto);
			}
		}
		this.contactos.clear();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechamodificacion() {
		return fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	
	
}
