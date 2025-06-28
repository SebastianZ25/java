package krakredev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	
	
	
	
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas=new ArrayList<>();
	}

	public void agregarNota(Nota nuevaNota) {
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			if (nuevaNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
				System.out.println("Ya tienes una nota asignada con este codigo");
			}
		}
		this.notas.add(nuevaNota);
	}

	public void modificarNota(String codigo, double nuevaNota) {
		boolean encontrada = false;
		for (Nota nota : this.notas) {
			if (nuevaNota >= 0 && nuevaNota <= 10) {
				if (nota.getMateria().getCodigo().equals(codigo)) {
					nota.setCalificacion(nuevaNota);
				}
			}
		}
		if(!encontrada) {
			System.out.println("No se encontro la materia con el codigo:"+ codigo);
		}
	}
	
	
	public double calculaPromedioNotasEstudiantes() {
		double sumarNotas=0;
		Nota elementoNota=null;
		for(int i=0;i<notas.size();i++) {
			elementoNota=notas.get(i);
			sumarNotas+=elementoNota.getCalificacion();
		}
		return sumarNotas/this.notas.size();
	}
	
	public void mostrar() {
		System.out.println("Nombre:"+this.nombre+" " +"Apellido:"+ this.apellido+" "+"Cedula:"+ this.cedula);
		for(int i=0;i<this.notas.size();i++) {
			this.notas.get(i).mostrar();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
