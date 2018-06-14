package Hora;
/*Implemente la clase Hora que contenga miembros datos separados para
almacenar horas, minutos y segundos. Un constructor inicializará estos datos en
0 y otro a valores dados. Una función miembro deberá visualizar la hora en
formato hh:mm:ss. Otra función miembro sumará dos objetos de tipo hora,
retornando la hora resultante. Realizar otra versión de la suma que asigne el
resultado de la suma en el primer objeto hora
*/
public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora() {
		hora=0;
		minutos=0;
		segundos=0;
	}
	public Hora(int hora, int minutos,int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		corregirHora();
	}
	
	private void corregirHora() {
		if (segundos <0) {
			segundos =0;
		}
		if (minutos <0) {
			minutos =0;
		}
		if(hora<0) {
			hora=0;
		}
		while (segundos >= 60) {
			segundos = segundos -60;
			minutos = minutos +1;
		}
		while (minutos >= 60) {
			minutos = minutos - 60;
				hora = hora+1;
		}
		while (hora >= 24) {
			hora = hora-24;
		}
	}
	@Override
	public String toString () {
		return  String.format("%02d", hora) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundos);
	}
	public Hora sumar(Hora h1,Hora h2) { //sumará dos objetos de tipo hora, retornando la hora resultante
		Hora h3 = new Hora();
		h3.clone(h1);
		h3.sumar(h2);
		corregirHora();
		return h3;
	}
	private void clone (Hora h) {
		hora = h.hora;
		minutos = h.minutos;
		segundos = h.segundos;
	}
	public void sumar(Hora h) {
		hora = hora + h.hora;
		minutos = minutos + h.minutos;
		segundos = segundos + h.segundos;		
	}
}
