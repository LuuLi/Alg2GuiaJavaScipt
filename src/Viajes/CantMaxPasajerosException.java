package Viajes;

public class CantMaxPasajerosException extends Exception {
	public CantMaxPasajerosException() {
		super("La cant max de pasajeros debe ser mayor a 0");
	}
}
