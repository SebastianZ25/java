package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a=null;
		a.substring(0);
		//NPE tipo de excepcion es Unchecked
	}
	
	public void metodo2() {
		File f=new File("archivo.tst");
		try {
		f.createNewFile(); //DE TIPO CHECKED
		}catch(IOException io) {
			System.out.println("error");
		}
		
	}
	
	
	public void metodo3() throws IOException {
		File f=new File("archivo.tst");
		f.createNewFile(); //DE TIPO CHECKED
	}
	
	public void metodo4() {
		metodo3();
	}
}
