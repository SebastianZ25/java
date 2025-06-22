package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1=new Item();
		Item item2=new Item();
		Item item3=new Item();
		
		item1.setProductosActuales(20);
		item2.setProductosActuales(35);
		item3.setProductosActuales(8);
		
		item1.Vender(4);
		item1.Devolver(2);
		item1.imprimir();
		
		item2.Vender(15);
		item2.Devolver(5);
		item2.imprimir();
		

		item3.Vender(2);
		item3.Devolver(1);
		item3.imprimir();
	}

}
