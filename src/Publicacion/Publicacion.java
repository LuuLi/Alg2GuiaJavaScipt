package Publicacion;
/*Una editorial de libros y discos desea crear fichas que almacenen el título y el precio
de cada publicación. Definir la correspondiente clase Publicacion que implemente
los datos anteriores. Derive dos clases, una llamada Libro, que contenga para cada
libro el número de páginas, año de publicación y precio, y la clase Disco, con la
duración en minutos y precio. Programar una aplicación que pruebe las clases.
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
