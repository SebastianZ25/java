package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminTransacciones {

	private static final Logger LOGGER = LogManager.getLogger(AdminTransacciones.class);

	public static void insertarTransaccion(Transacciones transacciones) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Transaccion a insertar>>>" + transacciones);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)" + "values (?,?,?,?,?,?)");

			ps.setInt(1, transacciones.getCodigo());
			ps.setString(2, transacciones.getNumeroCuenta());
			ps.setBigDecimal(3, transacciones.getMonto());
			ps.setString(4, transacciones.getTipo());
			ps.setDate(5, new java.sql.Date(transacciones.getFecha().getTime()));
			ps.setTime(6, new Time(transacciones.getHora().getTime()));
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar la transaccion ", e);
			throw new Exception("Error al insertar la transaccion");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizarTransaccion(Transacciones transacciones) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Transaccion a actualizar>>> " + transacciones);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"update transacciones set numero_cuenta=?, monto=?, tipo=? ,fecha=? ,hora=? where codigo=?");

			ps.setString(1, transacciones.getNumeroCuenta());
			ps.setBigDecimal(3, transacciones.getMonto());
			ps.setString(2, transacciones.getTipo());
			ps.setDate(4, new java.sql.Date(transacciones.getFecha().getTime()));
			ps.setTime(5, new Time(transacciones.getHora().getTime()));
			ps.setInt(6, transacciones.getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar la transaccion ", e);
			throw new Exception("Error al actualizar la transaccion");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminarTransaccion(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Transaccion a eliminar>>> " + codigo);
		try {

			con = ConexionBDD.conectar();

			ps = con.prepareStatement("delete from transacciones where codigo=?");

			ps.setInt(1, codigo);

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al eliminar la Transaccion", e);
			throw new Exception("Error al eliminar la Transaccion");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos ", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

}
