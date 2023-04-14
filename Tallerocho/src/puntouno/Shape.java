package puntouno;

public class Shape {
	private int numSides;
	private boolean regular;
	
	public Shape(int numSides, boolean regular) {
		this.numSides = numSides;
		this.regular = regular;
	}

	public Shape(int numSides) {
		this(numSides, false);
		
	}
	
	//Getters
	public int getNumSides() {
		return this.numSides;	
	}

	public boolean isRregular() {
		return this.regular;
	}
	
	//Setters
	
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	public void setRegular() {
		this.regular = regular;	
	}
	
}

