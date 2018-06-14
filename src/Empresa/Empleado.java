package Empresa;
/* nombre, apellido y número
de empleado.
*/
public class Empleado {
	private String nombre;
	private String apellido;
	private int numero;
	
	public Empleado() {
		
	}
	public Empleado(String nombre, String apellido, int nro) {
		this.nombre = nombre;
		this.apellido = apellido;
		numero = nro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
