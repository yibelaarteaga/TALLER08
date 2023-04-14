package puntocuatro;

public class cincoseis {
	public cincoseis () {
		
		student[] students = new student[3];
		// Crear los tres estudiantes
		students[0] = new student("Mary Jones", 14, 46);
		students[1] = new student("John Stiner", 60, 173);
		students[2] = new student("Ari Samala", 31, 69);
		
		// Modificar al ultimo estudiante
		int creditos = students[2].getCreditos();
		int qualityPoints = (int) students[2].getPuntosDeCalidad();;
		students[2].setCreditos(creditos + 3);
		students[2].setPuntosDeCalidad(qualityPoints + 52);
		
		
	}

}
