package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Productos;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProductos {
	private static final Logger LOGGER = LogManager.getLogger(AdminProductos.class);

	public static void insertarProductos(Productos productos) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Producto a insertar>>>" + productos);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into productos (codigo,nombre ,descripcion,precio,stock,fecha_vencimiento) "
							+ "values (?,?,?,?,?,?)");

			ps.setInt(1, productos.getCodigo());
			ps.setString(2, productos.getNombre());
			ps.setString(3, productos.getDescripcion());
			ps.setBigDecimal(4, productos.getPrecio());
			ps.setInt(5, productos.getStock());
			ps.setDate(6, new java.sql.Date(productos.getFechaVencimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar el Producto ", e);
			throw new Exception("Error al insertar el Producto");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizarProductos(Productos productos) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Productos a actualizar>>> " + productos);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"update productos set nombre=? ,descripcion=?,precio,stock=?,fecha_vencimiento=? where codigo=?");

			ps.setString(1, productos.getNombre());
			ps.setString(2, productos.getDescripcion());
			ps.setBigDecimal(3, productos.getPrecio());
			ps.setInt(4, productos.getStock());
			ps.setDate(5, new java.sql.Date(productos.getFechaVencimiento().getTime()));
			ps.setInt(6, productos.getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar productos ", e);
			throw new Exception("Error al actualizar productos");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminarProductos(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Producto a eliminar>>> " + codigo);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement("delete from productos where codigo=?");

			ps.setInt(1, codigo);

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al eliminar el Producto", e);
			throw new Exception("Error al eliminar el Producto");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	
	public static ArrayList<Productos>buscarPorNombreProducto(String nombreProducto)throws Exception{
		ArrayList<Productos> productos=new ArrayList<Productos>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		
		try {
			con = ConexionBDD.conectar();
			ps=con.prepareStatement("select * from productos where nombre like ?");
			ps.setString(1, "%"+nombreProducto+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				
				Productos p=new Productos();
				p.setNombre(nombre);
				productos.add(p);
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre de Producto ", e);
			throw new Exception("Error al consultar por nombre de Producto ");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return productos;
	}
	
	
	public static Productos buscarPorCodigo(int codigoProducto)throws Exception{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		 Productos p = null; 
		
		try {
			con = ConexionBDD.conectar();
			ps=con.prepareStatement("select * from productos where codigo=?");
			ps.setInt(1, codigoProducto);
			
			rs=ps.executeQuery();
			
			if(rs.next()) {
				p= new Productos();
	            p.setCodigo(rs.getInt("codigo"));
	            p.setNombre(rs.getString("nombre"));
	            p.setDescripcion(rs.getString("descripcion"));
	            p.setStock(rs.getInt("stock"));
	            p.setFechaVencimiento(rs.getDate("fecha_vencimiento"));
			}else {
				return null;
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por codigo de Producto ", e);
			throw new Exception("Error al consultar por codigo de Producto ");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return p;
	}

	
	

}
