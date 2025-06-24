package com.clearminds.test;

import com.clearmids.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestBuscarCeldaProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		
		Celda celda=maquina.buscarCeldaProducto("KE34");
		System.out.println("Celda que contiene el producto:"+celda.getCodigo());
		
		
		
		
	}
}
