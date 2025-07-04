package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","zambrano2007");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into persona(cedula,nombre,apellido,fecha_nacimiento,numero_hijos,estatura,cantidad_ahorrada,hora_nacimiento)"
					+ "			values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "1458968725");
			ps.setString(2, "Javier");
			ps.setString(3, "Lopez");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.69);
			ps.setBigDecimal(7,new BigDecimal( 1200.34));
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2020/03/22 10:05:04";
			try {
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				//crea un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time t=new Time(fechaMilis);
				System.out.println(t);
				
				ps.setDate(4, fechaSQL);
				ps.setTime(8, t);
				
				ps.executeUpdate();
				System.out.println("ejecuta insert");
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("PRIMER INSERT DEL RETO");
			
			 ps1 = connection.prepareStatement("insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
			 		+ "values (?,?,?,?,?,?)");
	            ps1.setInt(1, 23);
	            ps1.setString(2, "24356");
	            ps1.setBigDecimal(3, new BigDecimal(1350.5));
	            ps1.setString(4, "C");

	            String fechaTranStr = "2024/01/15 08:30:00"; 
	            try {
	                Date fechaTransaccion = sdf.parse(fechaTranStr);
	                long fechaMilis2= fechaTransaccion.getTime();
	                java.sql.Date fechaSQLTransaccion = new java.sql.Date(fechaMilis2);
	                Time horaT = new Time(fechaMilis2);

	                ps1.setDate(5, fechaSQLTransaccion);
	                ps1.setTime(6, horaT);

	                ps1.executeUpdate();
	                System.out.println("INSERT en transacciones exitoso");

	            } catch (ParseException e) {
	                e.printStackTrace();
	            }
			
	            System.out.println("SEGUNDO INSERT DEL RETO");
	            
	            ps2 = connection.prepareStatement("insert into productos (codigo,nombre ,descripcion,precio,stock,fecha_vencimiento) "
				 		+ "values (?,?,?,?,?,?)");
		            ps2.setInt(1, 50);
		            ps2.setString(2, "Papitas");
		            ps2.setString(3, "Sabor pollo");
		            ps2.setBigDecimal(4, new BigDecimal(0.95));
		            ps2.setInt(5, 15);

		            String fechaVProd = "2014/04/21 08:30:00"; 
		            try {
		                Date fechaProducto = sdf.parse(fechaVProd);
		                long fechaMilis3= fechaProducto.getTime();
		                java.sql.Date fechaSQLProd = new java.sql.Date(fechaMilis3);
		               

		                ps2.setDate(6, fechaSQLProd);
		             

		                ps2.executeUpdate();
		                System.out.println("INSERT en productos exitoso");

		            } catch (ParseException e) {
		                e.printStackTrace();
		            }
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
