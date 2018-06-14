package Hospital;

public class MainHospital {
	public static void main(String[] args) {
		
		Planta planta = new Planta();
		planta.setNombre("juan");
		planta.mostrar();
		
		Empleado emp = new Empleado();
		emp.leer("Alberto", "rojas", "Almagro",5,7,"Hola");
		emp.mostrar();
	}
}
