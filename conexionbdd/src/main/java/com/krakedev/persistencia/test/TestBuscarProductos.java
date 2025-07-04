package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Productos;
import com.krakedev.persistencia.servicios.AdminProductos;

public class TestBuscarProductos {
      public static void main(String[] args) {
		
	
	try {
		ArrayList<Productos> productos=  AdminProductos.buscarPorNombreProducto("Pan");
		System.out.println(productos);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
      }
}
