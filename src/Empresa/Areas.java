package Empresa;

import java.util.ArrayList;

/*
 * Considere a la empresa como una lista de �reas (se puede buscar por
nombre o c�digo de �rea)
 */
public class Areas {
	private String nombre;
	private int codigo;
	private ArrayList<Empleado> empleados;
	
	public Areas(String nombre, int codigo, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.empleados = empleados;
	}

	public Areas() {
		
	}

	public String getNombreArea() {
		return nombre;
	}

	public void setNombreArea(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}


}
