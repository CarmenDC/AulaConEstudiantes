package aulaEstudiantes;

import java.util.Random;

public class Profesor extends Persona{
	
	private final static String [] MATERIAS = {"Matemáticas","Filosofía","Física"};
	private final static int[] EDADPROFE= {38,40,35,42,50};
	
	String materia;
	
//	GETTERS AND SETTERS
	public String getMateria() {
		return materia;
	}

//	CONSTRUCTORES
	
	public Profesor(){
		super();
		Random random = new Random();
		int materiaAleatoria = random.nextInt(2);
		int edadProfeAleatoria= random.nextInt(4);
		super.setEdad(EDADPROFE[edadProfeAleatoria]);
		materia= MATERIAS[materiaAleatoria];
	}
	
	

	@Override
	public int definirPorcetajeIndisponible() {
		return 20;
	}
	
	@Override
	public Boolean estaDisponible() {
		Random random = new Random();
		int probabilidad = random.nextInt(100);
		return probabilidad>definirPorcetajeIndisponible()? true:false;
	}

	
	@Override
	public String toString() {
		return super.toString() + " materia=" + materia;
	}


}
