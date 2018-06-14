package Hospital;
/*El departamento de informática de un hospital está realizando un nuevo registro de
datos del personal, pacientes y proveedores del hospital, y desea definir la siguiente
jerarquía:
Persona: nombre, direccion, ciudad, leer(), mostrar()
	*/
public class Persona {//superclase
	private String nombre;
	private String direccion;
	private String ciudad;
	
	public Persona (){	
		nombre = "";
		direccion = "";
		ciudad = "";
	}

	public void leer(String nombre , String direccion, String ciudad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void mostrar() {
		System.out.println("La persona se llama :" +  nombre + " vive en la ciudad " + ciudad + " en la direccion " + direccion);
	}


}
