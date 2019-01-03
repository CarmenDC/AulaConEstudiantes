package aulaEstudiantes;

import java.util.Random;

public class Estudiante extends Persona {
	
	private final static int[] EDADALUMNOS= {18,19,20,21,22};
	private final static int[] CALIFICACIONES= {1,2,3,4,5,6,7,8,9,10};
	
	private int calificacionAlumno;
	
	
	public int getCalificacionAlumno() {
		return calificacionAlumno;
	}



	public Estudiante() {
		super();
		Random random = new Random();
		int edadAleatoria = random.nextInt(4);
		int califAleatoria = random.nextInt(9);
		super.setEdad(EDADALUMNOS[edadAleatoria]);
		this.calificacionAlumno = CALIFICACIONES[califAleatoria];
	}



	@Override
	public int definirPorcetajeIndisponible() {
		return 50;
	}

	@Override
	public Boolean estaDisponible() {
		Random random = new Random();
		return random.nextBoolean();
	}

	@Override
	public String toString() {
		return super.toString() + " nota=" + calificacionAlumno;
	}




	

	
	
	
}
