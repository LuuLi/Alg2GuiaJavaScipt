package Publicacion;

public class MainPublicacion {
	public static void main(String[] args) {
		
			Libro l = new Libro();
			l.setTitulo("Hola");
			l.setPrecio(200);
			l.setNumeropag(8);
			l.setAñopublicacion(1990);
			
			System.out.println(l.toString());
			
			Disco d = new Disco();
			d.setTitulo("aloH");
			d.setPrecio(200);
			d.setDuracionminutos(50);
			
			System.out.println(d.toString());
			
		}
}
