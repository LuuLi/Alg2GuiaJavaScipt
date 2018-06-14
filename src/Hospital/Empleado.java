package Hospital;
/*Empleado: nombre, direccion, ciudad, codigoEmpleado, horasExtras,
companiaSeguro, leer(), mostrar(), enviarSalario().
*/
public class Empleado extends Persona{
	private int codigoEmpleado;
	public int horasExtras;
	public String companiaSeguro;
	
	public Empleado() {
		super();
		codigoEmpleado = 0;
		horasExtras = 0;
		companiaSeguro = "";
	}
	public void leer(String n, String d, String c, int codigo, int horas, String compania) {
		setNombre(n);
		setDireccion(d);
		setCiudad(c);
		codigoEmpleado= codigo;
		horasExtras = horas;
		companiaSeguro = compania;
	}
	@Override
	public void mostrar() {
		System.out.println("El empleado " + getNombre() + " de codigo " + codigoEmpleado + " tiene " + horasExtras + " horas extras bajo la compania de seguros " + companiaSeguro);
	}
}
