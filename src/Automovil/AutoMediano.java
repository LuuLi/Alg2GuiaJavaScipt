package Automovil;
/*Los autos medianos son capaces de estar habilitados luego de la adquisición de un
permiso en una fecha dada.
*/
public class AutoMediano implements Automovil {
	private boolean permiso;
	private String fechaPermiso;

	public AutoMediano (boolean permiso, String f) {
		this.permiso = permiso;
		fechaPermiso = f;
	}
	public boolean habilitado() {
		return permiso;
	}
}
