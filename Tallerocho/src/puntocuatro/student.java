package puntocuatro;

public class student {
 
	    private String nombre;
	    private int creditos;
	    private double GPA;
	    private double puntosDeCalidad;

	    public student(String nombre, int creditos, double puntosDeCalidad) {
	        this.nombre = nombre;
	        this.creditos = creditos;
	        this.puntosDeCalidad = puntosDeCalidad;
	        this.GPA = puntosDeCalidad / creditos;
	    }

	    public double promedioPonderado() {
	        return this.GPA;
	    }

	    public void actualizarInfo(int creditos, double puntosDeCalidad) {
	        this.creditos += creditos;
	        this.puntosDeCalidad += puntosDeCalidad;
	        this.GPA = this.puntosDeCalidad / this.creditos;
	    }

	    // getters y setters para las variables de instancia
	    public String getNombre() {
	        return this.nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getCreditos() {
	        return this.creditos;
	    }

	    public void setCreditos(int creditos) {
	        this.creditos = creditos;
	    }

	    public double getGPA() {
	        return this.GPA;
	    }

	    public double getPuntosDeCalidad() {
	        return this.puntosDeCalidad;
	    }

	    public void setPuntosDeCalidad(double puntosDeCalidad) {
	    	 this.puntosDeCalidad = puntosDeCalidad;
	    	  }
	        
	    
	    }
	    


