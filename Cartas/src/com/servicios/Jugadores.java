package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;

public class Jugadores {
	private ArrayList<String> jugadores1;
	
	public Jugadores() {
		jugadores1 =new ArrayList<>();
		
	}
	
	public void jugar() {
		ArrayList<String> jugadores= new ArrayList<>();
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");
		
		Juego juego=new Juego(jugadores1);
		
		juego.entregarCartas(5);
		
		for(int i=0;i<jugadores.size();i++) {
			int suma=0;
			ArrayList<Carta> mano=juego.getCartasJugador().get(i);
			for(Carta carta: mano) {
				suma+=carta.getNumero().getValor();
				System.out.println(jugadores.get(i)+" tienes un total de: "+ suma);
			}
			String ganador;
			ganador= juego.determinarGanador();
			System.out.println("El ganador es: "+ ganador);
		}
	}
	

	public ArrayList<String> getJugadores() {
		return jugadores1;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores1 = jugadores;
	}
	
	
	
}
