package Viajes;

public class DistanciaException extends Exception {
	public DistanciaException() {
		super("Distancia debe ser mayor a 0");
	}
}
