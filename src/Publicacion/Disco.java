package Publicacion;
/*la clase Disco, con la
duración en minutos y precio.
*/
public class Disco extends Publicacion {
	private int duracionminutos;

	
	public Disco(String t, int p, int minutos) {
		super (t,p);
		duracionminutos = minutos;
	}


	public Disco() {
		super();
		duracionminutos = 0;
	}


	public int getDuracionminutos() {
		return duracionminutos;
	}


	public void setDuracionminutos(int duracionminutos) {
		this.duracionminutos = duracionminutos;
	}
	@Override
	public String toString () {
		return "El disco es: " + getTitulo() + " su duracion en minutoes es: " + duracionminutos + " y su precio es: " + getPrecio();
	}
}
