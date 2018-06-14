package Empleado;

public class MainEmpleado {
	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		emp1.setNombre("Lucila");
		emp1.setNumero(1);
		System.out.println(emp1.verDatos());
		
		Empleado emp2 = new Empleado();
		emp2.setNombre("Lola");
		emp2.setNumero(2);
		System.out.println(emp2.verDatos());
	}
}
