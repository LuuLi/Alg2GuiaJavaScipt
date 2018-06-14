package Rectangulo;
/*Suponga que posee dos clases, una llamada Rectangulo (cuadrilátero con dos lados
iguales entre sí y otros dos lados también iguales entre sí), y Cuadrado (cuadrilátero 
con los cuatro lados iguales). Suponiendo que solamente importe poseer como
atributo la medida de sus lados, y como método el cálculo del área, ¿cómo
establecería la jerarquía de herencia entre las dos clases antes mencionadas?
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
