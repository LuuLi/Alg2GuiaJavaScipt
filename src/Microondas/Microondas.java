package Microondas;

import java.util.*;

/*
 *  Implemente una clase Microondas que permita cocinar una comida. El microondas
 *  posee una puerta que puede estar abierta o cerrada, y un contenido que puede tener
 *  una comida o estar vacío. Se puede insertar una comida (si la puerta está abierta, y
 *  no hay otra comida adentro), retirar una comida (si la puerta está abierta y hay una
 *  comida adentro). También se puede iniciar una cocción con un nivel de intensidad
 *  de cocción y una cantidad de segundos de cocción, si la puerta está cerrada, y hay
 *  una comida adentro. También se puede finalizar la cocción (cuando se acaba su
 *  tiempo), lo cual la comida cocinada tendrá tantos puntos adicionales de cocción
 *  como el nivel de intensidad de la cocción finalizada multiplicado por la cantidad de
 *  segundos de esa cocción. Cuando una cocción se encuentra en curso, la puerta no se
 *  puede abrir. Lo que sí se puede hacer es abortar una cocción a una cantidad de
 *  segundos faltantes, si existe una cocción en curso. El efecto de esto último sería
 *  cocinar la comida por sólo el tiempo parcial en que estuvo cocinándose (el tiempo
 *  de la cocción del inicio menos el tiempo que faltaba al abortar) y abrir la puerta
 *  También se solicita que se pueda mostrar el estado completo del microondas en
 *  cualquier momento, incluyendo el de la comida que puede estar dentro. La comida
 *  se caracteriza por poseer un nombre y una cantidad de puntos de cocción.
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
