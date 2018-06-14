package Viajes;
/* distancia en kilómetros multiplicada por la cantidad de estaciones 
dividido 2 sumada a la cantidad de estaciones y de pasajeros dividido 10
*/
public class Diesel extends TipoDeViajes{

	public Diesel (String tipodeviaje, int distancia, int cantvagones, int cantestaciones, int cantmaxpasajeros) {
		super(tipodeviaje, distancia,cantvagones,cantestaciones, cantmaxpasajeros);
	}
	
	@Override
	public int tiempoDemora() {
		return (distancia*cantestaciones)/2+(cantestaciones+cantmaxpasajeros)/10;
	}
	
}
