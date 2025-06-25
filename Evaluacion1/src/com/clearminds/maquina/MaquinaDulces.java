package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	
	
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
		producto= new ArrayList<Producto>();
	}

	public void agregarCelda(Celda codigoCelda) {
		celdas.add(codigoCelda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println(elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				System.out.println("CELDA:" + elementoCelda.getCodigo() + " " + "Stock:" + elementoCelda.getStock()
						+ "Producto:" + elementoCelda.getProducto().getNombre() + "Precio:"
						+ elementoCelda.getProducto().getPrecio());
			} else {
				System.out.println("CELDA:" + elementoCelda.getCodigo() + " " + "Stock:" + elementoCelda.getStock()
						+ " " + "Sin Producto asignado"+" "+"Saldo:"+this.saldo);
			}
		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda celda = buscarCelda(codigo);
		if (celda != null) {
			return celda.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		Producto producto = buscarProductoEnCelda(codigo);
		if (producto != null) {
			return producto.getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				if (codigo.equals(elementoCelda.getProducto().getCodigo())) {
					return elementoCelda;
				}
			}
		}
		return elementoCelda;
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
	private ArrayList<Producto> producto;
	
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores= new ArrayList<Producto>();
		Producto elementoProducto=null;
		for(int i=0;i<producto.size();i++) {
			elementoProducto=producto.get(i);
			if(elementoProducto.getPrecio()<=limite) {
				menores.add(elementoProducto);
			}
		}
		return menores;
	}


	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

}
