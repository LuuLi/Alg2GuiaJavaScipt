package Rectangulo;

public class Cuadrado implements Cuadrilateros{
	private int lado;
	
	public Cuadrado(int l ) {
		lado = l;
	}
	public float area() {
		return lado*lado;
	}

}
