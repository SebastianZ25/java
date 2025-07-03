package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarmas1=new Alarma(DiasSemana.LUNES,12,45);
		Alarma alarmas2=new Alarma(DiasSemana.MARTES,4,30);
		Alarma alarmas3=new Alarma(DiasSemana.MIERCOLES,1,15);
		Alarma alarmas4=new Alarma(DiasSemana.JUEVES,7,35);
		Alarma alarmas5=new Alarma(DiasSemana.VIERNES,8,10);
		
		AdminAlarmas admin=new AdminAlarmas();
		AdminAlarmas admin2=new AdminAlarmas();
		AdminAlarmas admin3=new AdminAlarmas();
		AdminAlarmas admin4=new AdminAlarmas();
		AdminAlarmas admin5=new AdminAlarmas();
		
		admin.agregarAlarma(alarmas1);
		admin2.agregarAlarma(alarmas2);
		admin3.agregarAlarma(alarmas3);
		admin4.agregarAlarma(alarmas4);
		admin5.agregarAlarma(alarmas5);
		
		ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
		ArrayList<Alarma> alarmasActuales2=admin2.getAlarmas();
		ArrayList<Alarma> alarmasActuales3=admin3.getAlarmas();
		ArrayList<Alarma> alarmasActuales4=admin4.getAlarmas();
		ArrayList<Alarma> alarmasActuales5=admin5.getAlarmas();
		
		System.out.println(alarmasActuales);
		System.out.println(alarmasActuales2);
		System.out.println(alarmasActuales3);
		System.out.println(alarmasActuales4);
		System.out.println(alarmasActuales5);
	
	}

}
