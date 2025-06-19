package clearminds.cuentas;



public class Cuenta {
   private String Id;
   private String Tipo;
   private double Saldo;
   
   
   public Cuenta(String Id) {
	   this.Id=Id;
	   this.Tipo="A";
	   this.Saldo=0.0;
   }
   
   public Cuenta(String Id, String Tipo,double Saldo) {
	   this.Id=Id;
	   this.Tipo=Tipo;
	   this.Saldo=Saldo;
   }
   
   
   public void Imprimir(){
	   System.out.println("***************");
	   System.out.println("CUENTA");
	   System.out.println("***************");
	   System.out.println("Numero de Cuenta: "+ this.Id);
	   System.out.println("Tipo: "+ this.Tipo);
	   System.out.println("Saldo: USD "+ this.Saldo);
	   System.out.println("***************");
   }
   
   public void ImprimirConMiEstilo() {
	   System.out.println("+--------------+");
	   System.out.println("CUENTA");
	   System.out.println("+--------------+");
	   System.out.println("Numero de Cuenta: "+ this.Id);
	   System.out.println("Tipo: "+ this.Tipo);
	   System.out.println("Saldo: USD "+ this.Saldo);
	   System.out.println("+--------------+");
   }
   
   public String getTipo() {
	return Tipo;
   }
   public void setTipo(String tipo) {
	Tipo = tipo;
   }
   public double getSaldo() {
	return Saldo;
   }
   public void setSaldo(double saldo) {
	Saldo = saldo;
   }
   public String getId() {
	return Id;
   }
   
   
   
   
   
}
