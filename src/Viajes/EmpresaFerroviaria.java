package Viajes;
/*
 * Una empresa ferroviaria administra viajes en tren entre dos estaciones terminales de
su red. Un viaje tiene asociado un trayecto (desde una estación terminal de origen a
una de destino, con una distancia determinada y una cantidad de estaciones) y una
cierta cantidad de vagones y una capacidad máxima de pasajeros. También posee
qué tipo de viaje corresponde en relación a sus características técnicas, si es un viaje
con tecnología diesel, si es eléctrico o si es de alta velocidad (esto es independiente
del trayecto recorrido). El tiempo de demora promedio -en minutos- en un tipo de
viaje diesel es la distancia en kilómetros multiplicada por la cantidad de estaciones 
dividido 2 sumada a la cantidad de estaciones y de pasajeros dividido 10. El tiempo
de demora promedio -en minutos- en un tipo de viaje eléctrico es la distancia en
kilómetros multiplicada por la cantidad de estaciones dividido 2. El tiempo de
demora promedio -en minutos- en un tipo de viaje de alta velocidad es la distancia
en kilómetros dividido 10. Definir dentro de la clase Viaje el método
tiempoDeDemora, que retorne la cantidad de minutos que tarda en efectuar su
recorrido, can las siguientes variantes:
a) Especializando la clase Viaje en función del tipo de viaje.
b) Sin especializar la clase Viaje, relacionándola con la clase TipoDeViaje, que
está especializada por cada tipo de viaje.
 */

import java.util.ArrayList;

	public class EmpresaFerroviaria {
		public static void main(String args[]) throws TipoDeViajeErroneoException {
			ArrayList<Viaje> viajes = new ArrayList<>();
			Diesel diesel = new Diesel("Diesel", 500, 6, 4, 200);
			Electrico electrico = new Electrico("Electrico", 700, 7, 7, 55);
			AltaVelocidad altavel = new AltaVelocidad("Alta Velocidad", 700, 7, 5, 0);
			AltaVelocidad altavelExtra = new AltaVelocidad("Minima Velocidad", 700, 7, 0, 0);
			Estacion estorig = new Estacion("Liniers", "Liniers 400");
			Estacion estdest = new Estacion("Caballito", "Avellaneda 300");
			Trayecto tray = new Trayecto(estorig, estdest);
			Viaje viajeD = new Viaje(tray, diesel);
			Viaje viajeE = new Viaje(tray, electrico);
			Viaje viajeA = new Viaje(tray, altavel);
			Viaje viajeExtra = new Viaje(tray, altavelExtra);
			viajes.add(viajeD);
			viajes.add(viajeE);
			viajes.add(viajeA);
			viajes.add(viajeExtra);
			
			Trayecto tr1 = new Trayecto();
			for(Viaje x: viajes) {
				tr1 = x.getTrayecto();
				System.out.println("Estacion de origen: " + tr1.getOrig().getNombre());
				System.out.println("Estacion de destino: " + tr1.getDest().getNombre());
				System.out.println("Tipo de viaje: " + x.getTipoviaje().tipoViaje);
				System.out.println("Tiempo de demora: " + x.tiempoDemora());
				System.out.println("Distancia en kilometros: " + x.getTipoviaje().distancia);
			}
			
		}
	}