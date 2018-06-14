package Parcial;

public class Titular {
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	
	public Titular(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException{
		if (nombre == null) {
			throw new NombreInvalidoException("Se insertó nombre vacío.");
		}
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws ApellidoInvalidoException{
		if(apellido == null) {
			throw new ApellidoInvalidoException("Se inserto un apellido inválido.");
		}
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public boolean equals(Titular titular) {
		return this.getApellido() == titular.getApellido() && this.getNombre() == titular.getNombre();
	}
	
}
