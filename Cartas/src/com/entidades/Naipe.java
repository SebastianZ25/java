package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		this.numerosPosibles = new ArrayList<>();
		this.cartas = new ArrayList<>();

		this.numerosPosibles.add(new Numero("A", 11));
		this.numerosPosibles.add(new Numero("2", 2));
		this.numerosPosibles.add(new Numero("3", 3));
		this.numerosPosibles.add(new Numero("4", 4));
		this.numerosPosibles.add(new Numero("5", 5));
		this.numerosPosibles.add(new Numero("6", 6));
		this.numerosPosibles.add(new Numero("7", 7));
		this.numerosPosibles.add(new Numero("8", 8));
		this.numerosPosibles.add(new Numero("9", 9));
		this.numerosPosibles.add(new Numero("10", 10));
		this.numerosPosibles.add(new Numero("J", 10));
		this.numerosPosibles.add(new Numero("Q", 10));
		this.numerosPosibles.add(new Numero("K", 10));
		Palos palos = new Palos();
		ArrayList<String> palosPosibles = new ArrayList<>();
		palosPosibles.add(palos.getCorazonRojo());
		palosPosibles.add(palos.getCorazonNegro());
		palosPosibles.add(palos.getDiamante());
		palosPosibles.add(palos.getTrebol());
		

		for (Numero numero : numerosPosibles) {
		    for (String palo : palosPosibles) {
		        Carta nuevaCarta = new Carta(numero, palo);
		        this.cartas.add(nuevaCarta);
		    }
		}
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int posicionAleatoria = Random.obtenerPosicion();
			Carta cartaAleatoria = this.cartas.get(posicionAleatoria);
			if (cartaAleatoria.getEstado().equals("N")) {
				auxiliar.add(cartaAleatoria);
				cartaAleatoria.setEstado("C");
			}
		}
		Carta carta;
		for(int i=0;i<cartas.size();i++) {
			carta=cartas.get(i);
			if(carta.getEstado().equals("N")){
				auxiliar.add(carta);
			}
		}
		return auxiliar;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
