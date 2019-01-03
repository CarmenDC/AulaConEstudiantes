package aulaEstudiantes;


public class EjecutarClase {

	public static void main(String[] args) {

		Aula aula1 = new Aula();
		
		if (aula1.materiaCorrecta()&&aula1.profesorDisponible()&&aula1.alumnosDisponibles()) {
			aula1.imprimirAulaNotas();
		}
		else {
			System.out.println ("No es posible dar la clase");
		}
		
	}

}
