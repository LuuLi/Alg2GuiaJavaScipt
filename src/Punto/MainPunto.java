package Punto;


public class MainPunto {
	public static void main(String[] args) {
		Punto p1 = new Punto(5f,6f);
		Punto p2 = new Punto(5f,6f);
		System.out.println("Son iguales?" + p1.iguales(p1, p2));
		p2.setX(7);
		System.out.println("Son iguales?" + p1.iguales(p1, p2));
		
		System.out.println("La suma de puntos es:" + Punto.sumar(p1, p2));
		
		Vector v1 = new Vector(6,2,3);
		System.out.println("El vector es: " + v1.toString());
		
		Vector v2 = new Vector(1,2,3);
		System.out.println("El vector es: " + v2.toString());
		
		System.out.println("La suma es: " + Vector.sumar(v1, v2));
		
	}
}
