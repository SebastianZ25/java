package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu=new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		
		resultadoSuma=calcu.sumar(5, 9);
		resultadoResta=calcu.restar(10, 3);
		resultadoMultiplicar=calcu.multiplicar(10,5);
		resultadoDividir=calcu.dividir(10,2);
		resultadoPromediar=calcu.promediar(10,8,9 );
		
		
		
		System.out.println("RESULTADO: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+ resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+ resultadoMultiplicar);
		System.out.println("RESULTADO DIVIDIR: "+ resultadoDividir);
		System.out.println("RESULTADO PROMEDIAR: "+ resultadoPromediar);
		
		calcu.mostrarResultado();
 
		
	}

}
