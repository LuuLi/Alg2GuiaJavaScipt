package Hospital;
/*
 * Proveedor: nombre, direccion, ciudad, codigoVendedor, saldo, fax, telefono,
descuentos, leer(), mostrar(), pagarFactura()
 */
public class Proveedor extends Persona{
	private int codigoVendedor;
	private int saldo;
	private String fax;
	private int telefono;
	private int descuentos;
	
	public Proveedor() {
		super();
		 codigoVendedor=0;
		 saldo =0;
		 fax="";
		 telefono=0;
		 descuentos =0;
	}
	public void leer(String n, String d, String c, int codigo, int s, String f, int tel, int desc) {
		setNombre(n);
		setDireccion(d);
		setCiudad(c);
		codigoVendedor = codigo;
		saldo = s;
		fax = f;
		telefono = tel;
		descuentos = desc;
	}
	@Override
	public void mostrar() {
		System.out.println("El proveedor " + getNombre() + " de codigo " + codigoVendedor + "..");
	}
}
