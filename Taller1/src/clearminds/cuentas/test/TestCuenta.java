package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1=new Cuenta("03476");
		cuenta1.setSaldo(444);
		
		Cuenta cuenta2=new Cuenta("03476","C",557);
		
		Cuenta cuenta3=new Cuenta("03476");
		cuenta3.setTipo("D");
		
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5=new Cuenta("0557","C",10);
		
		Cuenta cuenta6=new Cuenta("0666");
		
		System.out.println("------Valores Inciales------");
		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();
		
		System.out.println("------Valores Modificados------");
		
		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();
		
		System.out.println("Valores Con Mi Estilo");
		cuenta4.ImprimirConMiEstilo();
		cuenta5.ImprimirConMiEstilo();
		cuenta6.ImprimirConMiEstilo();
	}

}
