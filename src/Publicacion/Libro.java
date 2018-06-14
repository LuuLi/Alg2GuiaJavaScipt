package Publicacion;
/*Derive dos clases, una llamada Libro, que contenga para cada
libro el n�mero de p�ginas, a�o de publicaci�n y precio,
*/
public class Libro  extends Publicacion{
	private int numeropag;
	private int a�opublicacion;

	
	public Libro (String t, int p, int pag, int a�o) {
		super(t,p);
		numeropag = pag;
		a�opublicacion = a�o;
	}


	public Libro() {
		super();
		numeropag = 0;
		a�opublicacion = 0;
	}


	public int getNumeropag() {
		return numeropag;
	}


	public void setNumeropag(int numeropag) {
		this.numeropag = numeropag;
	}


	public int getA�opublicacion() {
		return a�opublicacion;
	}


	public void setA�opublicacion(int a�opublicacion) {
		this.a�opublicacion = a�opublicacion;
	}
	@Override
	public String toString () {
		return "El libro es: " + getTitulo() + " se publico en el a�o " + a�opublicacion + " su cantidad de paginas es " + numeropag + " y su precio es: " + getPrecio();
	}


}
