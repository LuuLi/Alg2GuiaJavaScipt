package Hora;
/*Programar un procedimiento main(), que cree dos horas inicializadas y uno que
no lo esté. Se deberán sumar los dos objetos inicializados, dejando el resultado
en el objeto no inicializado. Por último, se pide visualizar el valor resultante
*/
public class MainHora {
public static void main(String[] args) {

	Hora h1 = new Hora(22,61,5);
	System.out.println("La primer hora es: " + h1.toString());
	Hora h2 = new Hora(3,70,99);
	System.out.println("La segunda hora es: " + h2.toString());
	h1.sumar(h2);
	System.out.println("la suma es: " + h1.toString());
	}
}
