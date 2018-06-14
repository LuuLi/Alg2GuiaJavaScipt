package Punto;


/*Implemente la clase Punto (pares de coordenadas de tipo float x, y). Defina
constructores y métodos para asignar valores a las coordenadas de los puntos,
retornar el valor de cada coordenada, y sumar dos puntos, retornando su resultado.
Definir un método booleano de igualdad entre dos puntos.
*/
public class Punto {
	private float x;
	private float y;
	
	public Punto() {
		x=0;
		y=0;
	}
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public static Punto sumar(Punto p1, Punto p2) {
		return new Punto(p1.x + p2.x, p1.y + p2.y);
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public boolean iguales(Punto p1, Punto p2) {
		if(p1.x == p2.x && p1.y == p2.y) {
			return true;
		}else
		return false;
	}

}
