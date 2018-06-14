package Viajes;
/*El tiempo
de demora promedio -en minutos- en un tipo de viaje el�ctrico es la distancia en
kil�metros multiplicada por la cantidad de estaciones dividido 2
*/
public class Electrico extends TipoDeViajes {
	
	public Electrico(String tipodeviaje, int distancia, int cantvagones, int cantestaciones, int cantmaxpasajeros) {
		super(tipodeviaje, distancia,cantvagones,cantestaciones, cantmaxpasajeros);
	}
	@Override
	public int tiempoDemora() {
		return distancia*cantestaciones/2;
	}

	
}
