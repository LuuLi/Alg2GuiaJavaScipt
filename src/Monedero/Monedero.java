package Monedero;
/*Implemente una clase Monedero que permita gestionar la cantidad de dinero que
una persona dispone en un momento dado. La clase deberá tener un constructor que
permitirá crear un monedero con una cantidad de dinero inicial y deberá definir un
método para meter dinero en el monedero, otro para sacarlo y finalmente, otro para
consultar el disponible; solo podrá conocerse la cantidad de dinero del monedero a
través de este último método. Por supuesto, no se podrá sacar más dinero del que
haya en un momento dado en el monedero.
*/
public class Monedero {
	private int cant;
	
	public Monedero() {
		cant = 0;
	}
	public Monedero(int cant) {
		this.cant = cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public void agregarDinero(int cant) {
		this.cant = this.cant + cant;
	}
	public void sacarDinero(int extraer) {
		if(extraer > cant) {
			cant = 0;
		}else
			cant = cant-extraer;
	}
	public int dineroDisponible() {
		return cant;
	}
}
