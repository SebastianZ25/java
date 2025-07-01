package com.cmc.evaluacion;

import com.cmc.evaluacion.entidades.Cuota;

public class CalculadoraAmortizacion {
  
	public static double calcularCuota(Prestamo prestamo) {
		double monto= prestamo.getMonto();
		double interesAnual=prestamo.getInteres();
		int plazo=prestamo.getPlazo();
		
		double interesMensual=interesAnual/100/12;
		
		double numerador=  monto*interesMensual;
		double denominador= 1-Math.pow(1+ interesMensual,-plazo);
		
		double cuota = numerador /denominador;
		 return cuota;
	}
	
	public static void generarTabla(Prestamo prestamo) {
       
        double cuotaMensual = calcularCuota(prestamo);

        for (int i = 0; i < prestamo.getPlazo(); i++) {
            prestamo.getCuotas()[i] = new Cuota(i + 1); 
            prestamo.getCuotas()[i].setCuota(cuotaMensual);
        }
        prestamo.getCuotas()[0].setInicio(prestamo.getMonto());

        for (int i = 0; i < prestamo.getPlazo(); i++) {
            if (i == prestamo.getPlazo() - 1) {
                calcularValoresCuota(
                        prestamo.getInteres(),
                        prestamo.getCuotas()[i],
                        null 
                );
            } else {
                calcularValoresCuota(
                        prestamo.getInteres(),
                        prestamo.getCuotas()[i],
                        prestamo.getCuotas()[i + 1]
                );
            }
        }
    }
	
	
	private static void calcularValoresCuota(double interes, Cuota cuota, Cuota siguienteCuota) {
        double interesMensual = interes / 100 / 12; 

        double interesActual = cuota.getInicio() * interesMensual;

        
        double abonoCapital = cuota.getCuota() - interesActual;

        double nuevoSaldo = cuota.getInicio() - abonoCapital;

        cuota.setInteres(interesActual);
        cuota.setAbonoCapital(abonoCapital);
        cuota.setSaldo(nuevoSaldo);

        if (siguienteCuota != null) {
            siguienteCuota.setInicio(nuevoSaldo);
        }
    }
	
	public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo");
        for (Cuota cuota : prestamo.getCuotas()) {
            cuota.mostrarPrestamo();
        }
    }

}
