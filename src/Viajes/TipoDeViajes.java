package Viajes;

public abstract class TipoDeViajes {
	public static String tipoViaje;
	private String tipodeviaje;
	private int cantvagones;
	protected int distancia; // en km
	protected int cantestaciones;
	protected int cantmaxpasajeros;
	
	public TipoDeViajes(String tipodeviaje, int distancia, int cantvagones, int cantestaciones, int cantmaxpasajeros) {
		this.tipodeviaje = tipodeviaje;
		this.distancia = distancia;
		this.cantvagones = cantvagones;		
		this.cantestaciones=cantestaciones;
		this.cantmaxpasajeros = cantmaxpasajeros;
	}
	public TipoDeViajes() {
		
	}

	public String getTipodeviaje() {
		return tipodeviaje;
	}

	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) throws DistanciaException{
		if(distancia <=0) {
			throw new DistanciaException();
		}
		this.distancia = distancia;
	}
	public int getCantestaciones() {
		return cantestaciones;
	}
	public void setCantestaciones(int cantestaciones) {
		this.cantestaciones = cantestaciones;
	}
	public void setTipodeviaje(String tipodeviaje)throws TipoDeViajeErroneoException {
		if(tipodeviaje == "Diesel" || tipodeviaje == "Electrico" || tipodeviaje == "Alta velocidad") {
			this.tipodeviaje = tipodeviaje;
		}else {	
		throw new TipoDeViajeErroneoException();
		}
	}

	public int getCantvagones() {
		return cantvagones;
	}

	public void setCantvagones(int cantvagones) throws CantdeVagonesException{
		if(cantvagones <=0) {
			throw new CantdeVagonesException();
		}
		this.cantvagones = cantvagones;
	}

	public int getCantmaxpasajeros() {
		return cantmaxpasajeros;
	}

	public void setCantmaxpasajeros(int cantmaxpasajeros) throws CantMaxPasajerosException{
		if(cantmaxpasajeros<=0) {
			throw new CantMaxPasajerosException();
		}
		this.cantmaxpasajeros = cantmaxpasajeros;
	}

	public abstract int tiempoDemora();
}
