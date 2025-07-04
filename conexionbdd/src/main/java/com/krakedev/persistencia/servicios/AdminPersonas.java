package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>>" + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into persona(cedula,nombre,apellido,fecha_nacimiento,numero_hijos,estatura,cantidad_ahorrada,hora_nacimiento)"
							+ "			values(?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDate(4, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar ", e);
			throw new Exception("Error al insertar");
		} finally {
			// Cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a actualizar>>> " + persona);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"update persona set nombre=?, apellido=?, fecha_nacimiento=?, hora_nacimiento=?, numero_hijos=?, estatura=?, cantidad_ahorrada=? where cedula=?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setDate(3, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(4, new Time(persona.getHoraNacimiento().getTime()));
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setString(8, persona.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar ", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a eliminar>>> " + cedula);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement("delete from persona where cedula=?");

			ps.setString(1, cedula);

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al eliminar ", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static ArrayList<Persona>buscarPorNombre(String nombreBusqueda)throws Exception{
		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		
		try {
			con = ConexionBDD.conectar();
			ps=con.prepareStatement("select * from persona where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				
				Persona p=new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				personas.add(p);
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre ", e);
			throw new Exception("Error al consultar por nombre ");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
		
	}

}
