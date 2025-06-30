package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> idsJugadores;
	
	
	public Juego(ArrayList<String> idsJugadores) {
		this.naipe=new Naipe();
		this.idsJugadores=idsJugadores;
		this.cartasJugador=new ArrayList<>();
		for(int i=0;i<idsJugadores.size();i++) {
			ArrayList<Carta> manoJugador=new ArrayList<>();
			this.cartasJugador.add(manoJugador);
		}
		this.naipeBarajado=this.naipe.barajar();
	}
	
	public void entregarCartas(int cartasPorJugador) {
		int numJugadores=this.cartasJugador.size();
		int indiceCarta=0;
		
		for(int i=0;i<cartasPorJugador;i++) {
			for(int j=0;j<numJugadores;j++){
				if(indiceCarta<this.naipeBarajado.size()) {
					ArrayList<Carta> manoActual=this.cartasJugador.get(j);
					
					Carta cartaAEntregar=this.naipeBarajado.get(indiceCarta);
					manoActual.add(cartaAEntregar);
					indiceCarta ++;
				}
			}
		}
	}
	
	public String determinarGanador() {
		int idGanador=0;
		int sumaGanador=0;
		for(int i=0;i<this.cartasJugador.size();i++) {
			int sumaActual=0;
			ArrayList<Carta>manoActual=this.cartasJugador.get(i);
			for(Carta carta:manoActual) {
				sumaActual+=carta.getNumero().getValor();
			}
			if(i==0 || sumaActual>=sumaGanador) {
				idGanador=i;
				sumaGanador=sumaActual;
			}
		}
		return this.idsJugadores.get(idGanador);
	}
	
	public int devolverTotal(int idJugador) {
		int suma=0;
		ArrayList<Carta> mano=this.cartasJugador.get(idJugador);
		for(Carta carta: mano) {
			suma+=carta.getNumero().getValor();
		}
		return suma;
	}
		
	

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	
	
}
