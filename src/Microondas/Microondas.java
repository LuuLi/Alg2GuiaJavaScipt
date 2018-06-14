package Microondas;

import java.util.*;

/*
 *  Implemente una clase Microondas que permita cocinar una comida. El microondas
 *  posee una puerta que puede estar abierta o cerrada, y un contenido que puede tener
 *  una comida o estar vac�o. Se puede insertar una comida (si la puerta est� abierta, y
 *  no hay otra comida adentro), retirar una comida (si la puerta est� abierta y hay una
 *  comida adentro). Tambi�n se puede iniciar una cocci�n con un nivel de intensidad
 *  de cocci�n y una cantidad de segundos de cocci�n, si la puerta est� cerrada, y hay
 *  una comida adentro. Tambi�n se puede finalizar la cocci�n (cuando se acaba su
 *  tiempo), lo cual la comida cocinada tendr� tantos puntos adicionales de cocci�n
 *  como el nivel de intensidad de la cocci�n finalizada multiplicado por la cantidad de
 *  segundos de esa cocci�n. Cuando una cocci�n se encuentra en curso, la puerta no se
 *  puede abrir. Lo que s� se puede hacer es abortar una cocci�n a una cantidad de
 *  segundos faltantes, si existe una cocci�n en curso. El efecto de esto �ltimo ser�a
 *  cocinar la comida por s�lo el tiempo parcial en que estuvo cocin�ndose (el tiempo
 *  de la cocci�n del inicio menos el tiempo que faltaba al abortar) y abrir la puerta
 *  Tambi�n se solicita que se pueda mostrar el estado completo del microondas en
 *  cualquier momento, incluyendo el de la comida que puede estar dentro. La comida
 *  se caracteriza por poseer un nombre y una cantidad de puntos de cocci�n.
 */

public class Microondas implements IMicroondas {
	
	enum EstadoMicroondas {APAGADO, STANDBY, COCINANDO};
	
	private Puerta puerta;
	private Optional<Comida> contenido;
	private EstadoMicroondas estado;
	private Timer timer;
	private int intensidad;
	private int tiempo;
	private TareaCoccion coccion;
	
	public Microondas() {
		estado = EstadoMicroondas.APAGADO;
		puerta = new Puerta();
		contenido = Optional.empty();
		timer = new Timer("Temporizador");
	}
	
	public Optional<Comida> getContenido() {
		return contenido;
	}
	
	public int getIntensidad() {
		return intensidad;
	}
	
	public int getTiempo() {
		return tiempo;
	}
	
	private boolean estaCocinando() {
		return estado == EstadoMicroondas.COCINANDO;
	}
	
	private boolean estaStandBy() {
		return estado == EstadoMicroondas.STANDBY;
	}
	
	private boolean estaApagado() {
		return estado == EstadoMicroondas.APAGADO;
	}
	
	public void encender() {
		if (estaApagado()) { 
			estado = EstadoMicroondas.STANDBY;
		}
	}
	
	public void apagar() {
		if (estaCocinando()) {
			cancelar();
		}
		estado = EstadoMicroondas.APAGADO;
	}
	
	@Override
	public boolean abrir() {
		if (estaCocinando()) {
			return false;
		}
		puerta.abrir();
		return true;
	}
	
	@Override
	public void cerrar() {
		puerta.cerrar();
	}

	@Override
	public boolean retirarComida() {
		if (!estaCocinando() && puerta.estaAbierta() && contenido.isPresent()) {
			contenido = Optional.empty();
			return true;
		} else {			
			return false;
		}
	}

	@Override
	public boolean insertarComida(Comida c) {
		if (!estaCocinando() && puerta.estaAbierta() && ! contenido.isPresent()) {
			contenido = Optional.of(c);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void mostrarEstado() {
		String msg = "Estado de microondas: " + estado + "\n Puerta: " + puerta.getEstado() + "\n Contenido: ";
		
		if (contenido.isPresent()) {
			msg += contenido.get().toString();
		} else {
			msg += "Vacio";
		}
		
		if (estaCocinando()) {
			msg += "\n Tiempo de coccion restante: " + coccion.getTiempoTranscurrido();
		}
		System.out.println(msg);
	}
	
	@Override
	public boolean cocinar(int nivel, int segundos) {
		if (estaStandBy() && !contenido.isPresent() || puerta.estaAbierta() || nivel < 1 || segundos < 1) {
			return false;
		}
		estado = EstadoMicroondas.COCINANDO;
		intensidad = nivel;
		tiempo = segundos;
		coccion = new TareaCoccion(this);
		timer.schedule(coccion, 0);
		return true;
	}
	
	@Override
	public void cancelar() {
		if (estaCocinando()) {
			timer.cancel();
			estado = EstadoMicroondas.STANDBY;
		}
	}
	
}
