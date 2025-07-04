package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Productos;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestBuscarPorCodigo {

	public static void main(String[] args) {
	try {
		Productos p=AdminProductos.buscarPorCodigo(5);
		System.out.println(p);
	} catch (Exception e) {

		System.out.println(e.getMessage());
	}
	}

}
