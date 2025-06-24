package com.clearminds.componentes;

public class Celda {
		private Producto producto;
		private int stock;
		private String codigo;
		
		public Celda() {}
		
		public Celda(String codigo) {
			this.codigo = codigo;
		}


		public void ingresarProducto(Producto p1, int stock1) {
			this.producto=p1;
			this.stock=stock1;
		}
		
		
		public Producto getProducto() {
			return producto;
		}


		public void setProducto(Producto producto) {
			this.producto = producto;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}


		public String getCodigo() {
			return codigo;
		}


		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		
		
}
