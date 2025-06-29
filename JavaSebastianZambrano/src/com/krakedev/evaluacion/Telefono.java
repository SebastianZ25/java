package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.estado = "E";
		if (numero != null && tipo != null) {
			if (numero.length() == 10 || numero.length() == 7) {
				this.estado = "C";
			} else {
				this.estado = "E";
			}
		}

	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
