package Viajes;
/*El tiempo de
demora promedio -en minutos- en un tipo de viaje de alta velocidad es la distancia
en kilómetros dividido 10.
*/
public class AltaVelocidad extends TipoDeViajes {

	public AltaVelocidad(String tipodeviaje, int distancia, int cantvagones, int cantestaciones, int cantmaxpasajeros) {
		super(tipodeviaje, distancia,cantvagones,cantestaciones, cantmaxpasajeros);
	}

	@Override
	public int tiempoDemora() {
		return distancia/10;
	}
	
}
