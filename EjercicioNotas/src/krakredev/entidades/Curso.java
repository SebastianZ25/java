package krakredev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	public Curso(){
		this.estudiantes=new ArrayList<>();
	}
	
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		String cedulaAbuscar=estudiante.getCedula();
		Estudiante estudianteEnCurso;
		for(int i=0;1<this.estudiantes.size();i++) {
			estudianteEnCurso=this.estudiantes.get(i);
			if(estudianteEnCurso.getCedula().equals(cedulaAbuscar)) {
				System.out.println("Estudiante encontrado:"+ estudianteEnCurso);
			}
		}
		return null;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteEncontrado=buscarEstudiantePorCedula(estudiante);
		if(estudianteEncontrado==null) {
			this.estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double sumarPromedios=0.0;
		Estudiante estudiante;
		for(int i=0;i<this.estudiantes.size();i++) {
			estudiante=this.estudiantes.get(i);
			sumarPromedios+=estudiante.calculaPromedioNotasEstudiantes();
		}
		return sumarPromedios/this.estudiantes.size();
	}
	
	public void mostrar() {
		for(int i=0;i<this.estudiantes.size();i++) {
			Estudiante estudiante=this.estudiantes.get(i);
			estudiante.mostrar();
		}
	}
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
