package Publicacion;
/*Derive dos clases, una llamada Libro, que contenga para cada
libro el número de páginas, año de publicación y precio,
*/
public class Libro  extends Publicacion{
	private int numeropag;
	private int añopublicacion;

	
	public Libro (String t, int p, int pag, int año) {
		super(t,p);
		numeropag = pag;
		añopublicacion = año;
	}


	public Libro() {
		super();
		numeropag = 0;
		añopublicacion = 0;
	}


	public int getNumeropag() {
		return numeropag;
	}


	public void setNumeropag(int numeropag) {
		this.numeropag = numeropag;
	}


	public int getAñopublicacion() {
		return añopublicacion;
	}


	public void setAñopublicacion(int añopublicacion) {
		this.añopublicacion = añopublicacion;
	}
	@Override
	public String toString () {
		return "El libro es: " + getTitulo() + " se publico en el año " + añopublicacion + " su cantidad de paginas es " + numeropag + " y su precio es: " + getPrecio();
	}


}
