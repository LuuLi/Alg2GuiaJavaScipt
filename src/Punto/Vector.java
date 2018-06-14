package Punto;
/*Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). Defina
constructores y métodos para asignar valores a las coordenadas de los vectores3D,
retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su
resultado. Definir un método booleano de igualdad entre dos vectores3D.
Implementar esta clase a partir de la implementación de la clase Punto.
*/
public class Vector extends Punto {
	private float z;
	public Vector() {
		super();
		z = 0;
	}
	public Vector(float x, float y, float z) {
		super(x,y);
		this.z=z;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}

	public boolean equals(Vector v1, Vector v2) {
			return v1.getX() == v2.getX() && v1.getY() == v2.getY() && v1.z == v2.z;	
	}
	@Override
	public String toString () {
		return "(" + getX() + "," + getY() + "," + z + ")";
	}

	public static Vector sumar(Vector v1, Vector v2) {
		return new Vector(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.z + v2.z);
	}
}
