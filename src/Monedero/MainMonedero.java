package Monedero;

public class MainMonedero {
	public static void main(String[] args) {
		Monedero m = new Monedero();
		m.agregarDinero(50);
		m.sacarDinero(20);
		System.out.println("Mi dinero disponible es: " + m.dineroDisponible());
	}
}
