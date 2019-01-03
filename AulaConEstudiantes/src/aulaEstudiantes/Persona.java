package aulaEstudiantes;

import java.util.Random;

public abstract class Persona implements Indisponible {
	
	
	private final static String SEXO [] = {"M","H"};
	private final static String[] NOMBRESMUJERES= {"Carla","Candela", "Blanca", "Laura"};
	private final static String[] NOMBRESHOMBRES= {"Adrian", "Marcos", "David", "Alejandro"};		
	
	private String nombre;
	private int edad;
	private String sexo;
	
	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	//CONSTRUCTORES
		public Persona() {
		Random random = new Random();
		int sexoAleatorio = random.nextInt(2);
		sexo = SEXO [sexoAleatorio];
		int nombreAleatorio = random.nextInt(4);
		if (this.sexo == "M") {
			nombre=NOMBRESMUJERES[nombreAleatorio];
		}
		if (sexo =="H") {
			nombre=NOMBRESHOMBRES[nombreAleatorio];
		}
	}

		@Override
		public String toString() {
			return "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo;
		}

		
	
}
