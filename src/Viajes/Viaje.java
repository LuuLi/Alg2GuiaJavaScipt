package Viajes;

public class Viaje {
	private Trayecto trayecto;
	private TipoDeViajes tipoviaje;
	
	public Viaje() {
		
	}
	public Viaje(Trayecto trayecto, TipoDeViajes tipoviaje) {
		this.trayecto = trayecto;
		this.tipoviaje = tipoviaje;		
	}
	
	public int tiempoDemora() throws TipoDeViajeErroneoException {
		if(tipoviaje.getTipodeviaje() == "Diesel" || tipoviaje.getTipodeviaje() == "Electrico" ||tipoviaje.getTipodeviaje() == "Alta velocidad" ) {
			return tipoviaje.tiempoDemora();
		}else {
			throw new TipoDeViajeErroneoException();
		}
	}

	public Trayecto getTrayecto() {
		return trayecto;
	}


	public void setTrayecto(Trayecto trayecto) {
		this.trayecto = trayecto;
	}


	public TipoDeViajes getTipoviaje() {
		return tipoviaje;
	}


	public void setTipoviaje(TipoDeViajes tipoviaje) {
		this.tipoviaje = tipoviaje;
	}
	
}
