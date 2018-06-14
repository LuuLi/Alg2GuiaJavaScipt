package Hospital;
/*Paciente: nombre, direccion, ciudad, codigoDiagnostico, telefono,
fechaNacimiento, leer(), mostrar(), enviarFactura().
*/

import java.nio.charset.CoderResult;

public class Paciente extends Persona{
	private int codigoDiagnostico;
	private int telefono;
	private String fechaNacimiento;
	
	public Paciente (){
		super();
		codigoDiagnostico=0;
		telefono = 0;
		fechaNacimiento="";
	}
	
	public void leer(String n, String d, String c, int codigo, int t, String f) {
		setNombre(n);
		setDireccion(d);
		setCiudad(c);
		codigoDiagnostico = codigo;
		telefono = t;
		fechaNacimiento = f;
	}
	@Override
	public void mostrar() {
		System.out.println("El paciente " + getNombre() + " esta diagnosticado de " + codigoDiagnostico + " su telefono es: " + telefono + " nacido en " + fechaNacimiento);
	}

}
