package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion=new Validacion();
		boolean respuesta;
		boolean respuesta1;
		
		respuesta=validacion.validarMonto(10);
		respuesta1=validacion.validarMonto(-1);
		System.out.println(respuesta);
		System.out.println(respuesta1);
		
	}

}
