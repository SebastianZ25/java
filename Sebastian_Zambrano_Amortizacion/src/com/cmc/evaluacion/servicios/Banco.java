package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.entidades.Cliente;

public class Banco {
	private ArrayList<Cliente> clientes;
	private ArrayList<Prestamo> prestamos;
	private ArrayList<String> cedulasDePrestamos;
	public Banco() {
		clientes = new ArrayList<>();
		prestamos = new ArrayList<>();
		cedulasDePrestamos = new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public Cliente buscarCliente(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
        Cliente clienteExistente = buscarCliente(cliente.getCedula());

        if (clienteExistente != null) {
            System.out.println("Ya existe este cliente: " + clienteExistente.getCedula());
        } else {
            clientes.add(cliente);
            System.out.println("Cliente registrado correctamente.");
        }
    }
	
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            System.out.println("No es cliente del banco.");
        }

        CalculadoraAmortizacion.generarTabla(prestamo);

        prestamos.add(prestamo);
        cedulasDePrestamos.add(cedula);
    }
	
	 public ArrayList<Prestamo> buscarPrestamos(String cedula) {
	        Cliente cliente = buscarCliente(cedula);
	        if (cliente == null) {
	            System.out.println("No es cliente del banco.");
	            return null;
	        }

	        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

	        for (int i = 0; i < prestamos.size(); i++) {
	            if (cedulasDePrestamos.get(i).equals(cedula)) {
	                listaPrestamos.add(prestamos.get(i));
	            }
	        }

	        if (listaPrestamos.size()==0) {
	            return null;
	        }

	        return listaPrestamos;
	    }
	
	
}
