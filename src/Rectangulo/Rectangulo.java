package Rectangulo;
/*Suponga que posee dos clases, una llamada Rectangulo (cuadril�tero con dos lados
iguales entre s� y otros dos lados tambi�n iguales entre s�), y Cuadrado (cuadril�tero 
con los cuatro lados iguales). Suponiendo que solamente importe poseer como
atributo la medida de sus lados, y como m�todo el c�lculo del �rea, �c�mo
establecer�a la jerarqu�a de herencia entre las dos clases antes mencionadas?
Discutir.

*/
public class Rectangulo implements Cuadrilateros {
	private int ancho;
	private int altura;
	
	public Rectangulo(int ancho, int altura) {
		this.ancho = ancho;
		this.altura = altura;
	}
	public float area() {
		return ancho*altura;
	}
}
