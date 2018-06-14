package Viajes;

public class CantdeVagonesException extends Exception {
	public CantdeVagonesException() {
		super("Cant de vagones debe ser mayor a 0");
	}
}
