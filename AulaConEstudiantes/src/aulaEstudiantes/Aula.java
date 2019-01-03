package aulaEstudiantes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Aula implements ClasePosible{
	
	private final static String [] MATERIAS = {"Matemáticas","Filosofía","Física"};
	private static int IDENTIFICADOR;
	
	int idAula;
	int numMaxAlumnos;
	String materia;
	Collection<Estudiante> alumnosAula = new ArrayList<>(numMaxAlumnos);
	Profesor profesorAula;
	
	
//	GETTERS AND SETTERS
	
	public int getIdAula() {
		return idAula;
	}
	public int getNumMaxAlumnos() {
		return numMaxAlumnos;
	}
	public String getMateria() {
		return materia;
	}
	public Collection<Estudiante> getAlumnosAula() {
		return alumnosAula;
	}
	public Profesor getProfesorAula() {
		return profesorAula;
	}
	
//CONSTRUCTOR
		
	
	public Aula() {
		Random random = new Random();
		IDENTIFICADOR++;
		idAula = IDENTIFICADOR;
		
		numMaxAlumnos = random.nextInt (20);
		materia = MATERIAS[random.nextInt(2)];
		profesorAula = new Profesor();
		
		for (int i = 0; i<numMaxAlumnos; i++) {
			Estudiante e = new Estudiante();
			alumnosAula.add(e);
		}
	}

	
//OTROS METODOS
	@Override
	public Boolean profesorDisponible() {
		return profesorAula.estaDisponible();
	}
	@Override
	public Boolean alumnosDisponibles() {
		int minimosEnClase = getNumMaxAlumnos()/4;
		int sumaDisponibles = 0;
		for (Estudiante estudiante: alumnosAula) {
			if (estudiante.estaDisponible()&&minimosEnClase>0) {
				sumaDisponibles++;
			}
		}
		return sumaDisponibles >= minimosEnClase? true:false;
	}
	@Override
	public Boolean materiaCorrecta() {
		return materia == profesorAula.getMateria()? true:false;
	}

	
	
	public void imprimirAulaNotas() {
		System.out.println ("El profesor es: " + profesorAula.toString());
		System.out.println ("La materia es: " + materia);
		System.out.println ("Las notas son: ");
		for (Estudiante estudiante : alumnosAula) {
			if (estudiante.estaDisponible()){
				System.out.println (estudiante.toString()+"\n");
			}
		}
	}
	
}
