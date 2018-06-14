package Microondas;

public class Comida {
	
	private int nivelCoccion;
	private String nombre;
	
	public Comida(String n) {
		nombre = n;
	}
	
	public void cocinar(int nivel) {
		nivelCoccion += nivel;
	}
	
	@Override
	public String toString() {
		return "Comida " + nombre + ", nivel de coccion: " + nivelCoccion;
	}
}
