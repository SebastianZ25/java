package com.krakedev.estaticos;

public class Calculos {
	// final hace q el valor nose pueda cambiar, se convierte en constante
	private final int IVA=12;
	
	public double calcularIva(double monto) {
		
		return monto*IVA/100;
		
	}
	
}
