package com.clearmids.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public MaquinaDulces() {
		this.celda1= new Celda();
		this.celda2= new Celda();
		this.celda3= new Celda();
		this.celda4= new Celda();
	}
	
	public void configurarMaquina(String c1,String c2,String c3,String c4) {
		
		this.celda1.setCodigo(c1);
		this.celda2.setCodigo(c2);
		this.celda3.setCodigo(c3);
		this.celda4.setCodigo(c4);
	}
	
	public void mostrarConfiguracion(){
		System.out.println("CELDA 1:"+this.getCelda1().getCodigo());
		System.out.println("CELDA 2:"+this.getCelda2().getCodigo());
		System.out.println("CELDA 3:"+this.getCelda3().getCodigo());
		System.out.println("CELDA 4:"+this.getCelda4().getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		if(this.celda1.getCodigo()==codigo) {
			return this.celda1;
		}else if(this.celda2.getCodigo()==codigo) {
			return this.celda2;
		}else if(this.celda3.getCodigo()==codigo) {
			return celda3;
		}else if(this.celda4.getCodigo()==codigo) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto,cantidad);
	}
	
	public void mostrarProductos() {
		
		if(celda1.getProducto()!=null) {
	System.out.println("Celda "+celda1.getCodigo()+"Stock: "+ celda1.getStock()+celda1.getProducto().getNombre()+" "+" Precio: "+celda1.getProducto().getPrecio()+"Codigo: "+celda1.getProducto().getCodigo());
		}else {
			System.out.println("*****Celda "+celda1.getCodigo());
			System.out.println("Stock: "+celda1.getStock());
			System.out.println("La celda no tiene Porducto!!");
		}
		if(celda2.getProducto()!=null) {
		System.out.println(celda2.getCodigo()+ celda2.getStock()+celda2.getProducto().getNombre()+celda2.getProducto().getPrecio());
		}else {
			System.out.println("*****Cleda "+celda2.getCodigo());
			System.out.println("Saldo"+this.saldo);
			System.out.println("Stock: "+celda2.getStock());
			System.out.println("La celda no tiene Porducto!!");
		}
		if(celda3.getProducto()!=null) {
		System.out.println("*****Celda"+celda3.getCodigo());
		System.out.println("Saldo"+this.saldo);
		System.out.println("Stock: "+celda3.getStock());
		System.out.println("Nombre producto "+celda3.getProducto().getNombre());
		System.out.println("Precio "+celda3.getProducto().getPrecio());
		System.out.println("Codigo producto "+celda3.getProducto().getCodigo());
		}else {
			System.out.println(celda3.getCodigo()+ celda3.getStock());
		}
		if(celda4.getProducto()!=null) {
		System.out.println(celda4.getCodigo()+ celda4.getStock()+celda4.getProducto().getNombre()+celda4.getProducto().getPrecio());
		}else {
			System.out.println(celda4.getCodigo());
			System.out.println("Stock: "+celda4.getStock());
			System.out.println("La celda no tiene Porducto!!");
			System.out.println("Saldo: "+this.saldo);
		}
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celda=buscarCelda(codigo);
		if(celda!= null) {
			return celda.getProducto();
		}else{
			return null;
		}
	}
	
	public double consultarPrecio(String codigo) {
		Producto producto=buscarProductoEnCelda(codigo);
		if(producto!=null) {
			return producto.getPrecio();
			}else {
				return 0.0;
			}
	}
	
	public Celda buscarCeldaProducto(String codigo) {
	if(this.celda1!=null &&this.celda1.getProducto()!=null&& this.celda1.getProducto().getCodigo()==codigo) {
		return this.celda1;
	}else if(this.celda2!=null &&this.celda2.getProducto()!=null&& this.celda2.getProducto().getCodigo()==codigo) {
		return this.celda2;
	}else if(this.celda3!=null &&this.celda3.getProducto()!=null&& this.celda3.getProducto().getCodigo()==codigo) {
		return this.celda3;
	}else if(this.celda4!=null &&this.celda4.getProducto()!=null&& this.celda4.getProducto().getCodigo()==codigo) {
		return this.celda4;
	}else {
		return null;
	}
	}
	
	public void incrementarProductos (String producto, int cantidad) {
		Celda celdaEncontrada=buscarCeldaProducto(producto);
		int stockActual=celdaEncontrada.getStock();
		celdaEncontrada.setStock(stockActual+cantidad);
		
	}
	
	public void vender(String codigoCelda) {
		Celda celdaV=buscarCelda(codigoCelda);
		int stockActual=celdaV.getStock();
		celdaV.setStock(stockActual-1);
		//obtiene el precio
		double precio=celdaV.getProducto().getPrecio();
		this.saldo+=precio;
		mostrarProductos();
	}
	
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		double vuelto=0.0;
		Celda celdaV=buscarCelda(codigoCelda);
		int StockActual=celdaV.getStock();
		celdaV.setStock(StockActual-1);
		//modifica saldo
		double precio=celdaV.getProducto().getPrecio();
		this.saldo+=precio;
		//retorna vuelto
		 vuelto=valorIngresado-precio;
		 return vuelto;
	}
	
	
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
