package Microondas;

public class Puerta {
	
	enum EstadoPuerta {ABIERTA, CERRADA};
	
	EstadoPuerta estado;
		 
	 public Puerta() {
		 estado = EstadoPuerta.CERRADA;
	 }
	 
	 public void abrir() {
		 estado = EstadoPuerta.ABIERTA;
	 }
	 
	 public void cerrar() {
		 estado = EstadoPuerta.CERRADA;
	 }
	 
	 public EstadoPuerta getEstado() {
		 return estado;
	 }
	 
	 public boolean estaAbierta() {
		 return estado == EstadoPuerta.ABIERTA;
	 }
}
