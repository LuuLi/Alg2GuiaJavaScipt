package Hospital;
/*Planta: datosEmpleado, salario, anosAntiguedad, pagarSalario()
 * 
 */
public class Planta extends Empleado{
	private int salario;
	private int añosAntiguedad;
	
	public Planta() {
		super();
		salario =0;
		añosAntiguedad=0;
	}
	public void pagarSalario(int s) {
		salario = salario-s;
	}
	@Override
	public void mostrar () {
		System.out.println(getNombre());
	}
}
