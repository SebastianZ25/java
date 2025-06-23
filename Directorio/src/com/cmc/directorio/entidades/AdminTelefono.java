package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono t1) {
		if (t1.getOperadora() == "movi") {
			t1.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contar = 0;
		if (t1.getOperadora() == "movi") {
			contar++;
		}
		if (t2.getOperadora() == "movi") {
			contar++;
		}
		if (t3.getOperadora() == "movi") {
			contar++;
		}
		return contar;
	}

	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contar = 0;
		if (t1.getOperadora() == "claro") {
			contar++;
		}
		if (t2.getOperadora() == "claro") {
			contar++;
		}
		if(t3.getOperadora()=="claro") {
			contar++;
		}
		if(t4.getOperadora()=="claro") {
			contar++;
		}
		return contar;
	}
}
