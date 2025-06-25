package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		Producto p1=new Producto("Papitas",0.85);
		Producto p2=new Producto("Doritos",0.50);
		Producto p3=new Producto("Jet",0.25);
		Producto p4=new Producto("DeTodito",0.60);
		Producto p5=new Producto("Coca Cola",1.25);
		Producto p6=new Producto("Galletas Oreo",1.10);
		
		maquina.getProducto().add(p1);
		maquina.getProducto().add(p2);
		maquina.getProducto().add(p3);
		maquina.getProducto().add(p4);
		maquina.getProducto().add(p5);
		maquina.getProducto().add(p6);
		
		double limite= 1;
		ArrayList<Producto> menores=maquina.buscarMenores(limite);
		 System.out.println("Productos Menores " + limite + ":");
	        for (Producto prod : menores) {
	            System.out.println("Nombre:"+prod.getNombre()+" "+"Precio:" + prod.getPrecio());
	        }
 
          
        
	}

}
