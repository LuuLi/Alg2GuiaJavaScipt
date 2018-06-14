package Publicacion;
/*Una editorial de libros y discos desea crear fichas que almacenen el t�tulo y el precio
de cada publicaci�n. Definir la correspondiente clase Publicacion que implemente
los datos anteriores. Derive dos clases, una llamada Libro, que contenga para cada
libro el n�mero de p�ginas, a�o de publicaci�n y precio, y la clase Disco, con la
duraci�n en minutos y precio. Programar una aplicaci�n que pruebe las clases.
*/
public class Publicacion {
	private String titulo;
	private int precio;
	
	public Publicacion() {
		titulo = "";
		precio = 0;
	}
	public Publicacion(String t, int p) {
		titulo = t;
		precio = p;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String toString () {
		return "La publicacion :" + titulo + " vale: " + precio;
	}
}
