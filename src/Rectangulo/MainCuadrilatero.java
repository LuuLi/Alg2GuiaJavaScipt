package Rectangulo;

public class MainCuadrilatero {
	public static void main(String[] args) {
		
		Cuadrado cuad = new Cuadrado(4);
		System.out.println(cuad.area());
		
		Rectangulo rect = new Rectangulo(2,3);
		System.out.println(rect.area());
	}

}
