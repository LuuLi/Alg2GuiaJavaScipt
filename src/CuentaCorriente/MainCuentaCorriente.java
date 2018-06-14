package CuentaCorriente;

public class MainCuentaCorriente {
	public static void main(String[] args) {
		CuentaCorriente c = new CuentaCorriente();
		c.deposito(70);
		c.extraccion(20);
		c.extraccion(40);
		c.extraccion(20);
		System.out.println("cantidadOperaciones: " + c.cantidadOperaciones());
		System.out.println("cantidadExtraccionesInvalidas: " + c.cantidadExtraccionesInvalidas());

	}
}
