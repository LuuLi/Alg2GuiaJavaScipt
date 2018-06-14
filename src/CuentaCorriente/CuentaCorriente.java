package CuentaCorriente;
/*Implemente una clase CuentaCorriente, que permita llevar el control del estado de
una cuenta corriente. La cuenta corriente está caracterizada esencialmente por su
saldo, y sobre ella se pueden realizar los siguientes tipos de operaciones:
- saldo(): Retorna el saldo de la cuenta corriente (puede ser negativo).
- deposito(float imp): Deposita un importe dado a la cuenta corriente.
- extraccion(float imp): Extrae un importe dado de la cuenta corriente.
- cantidadOperaciones(): Retorna la cantidad de operaciones válidas
realizadas.
- cantidadExtraccionesInvalidas(): Retorna la cantidad de extracciones
en las que se intentó extraer más dinero del que existía en la cuenta corriente.
*/
public class CuentaCorriente {
	private float saldo;
	private static int cantOperaciones;
	private static int cantExtraccionesInvalidas;
	
	public CuentaCorriente() {
		saldo = 0;
		cantOperaciones = 0;
	}
	public float saldo() {
		return saldo;
	}
	public void deposito(float imp) {
		cantOperaciones = cantOperaciones +1;
		saldo = saldo+imp;
	}
	public boolean extraccion (float imp) {
		if (imp<=saldo) {
		cantOperaciones ++;
		saldo = saldo-imp;
		return true;
	}else
		cantExtraccionesInvalidas++;
		return false;
	}
	
	public static int cantidadOperaciones() {
		return cantOperaciones;
	}
	public int cantidadExtraccionesInvalidas() {
		return cantExtraccionesInvalidas;
	}

}
