package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {

	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(">>>>>>"+producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("ACTUALIZANDO PRODUCTO>>>>>>"+producto);
	}
	
	    @Path("consultar")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public ArrayList<Producto> recuperarTodos() {
	        ArrayList<Producto> productos = new ArrayList<>();
	        Categoria categoria = new Categoria(1, "Electrónica");
	        productos.add(new Producto("P111", "Laptop", categoria, 999.99, 50));
	        productos.add(new Producto("P222", "Telefono", categoria, 499.99, 100));
	        productos.add(new Producto("P333", "Monitor", categoria, 299.99, 75));

	        return productos;
	    }
}
