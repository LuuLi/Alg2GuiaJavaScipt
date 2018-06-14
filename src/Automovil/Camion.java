package Automovil;
/*Los camiones tambi�n podr�n estar habilitados luego de
la adquisici�n de un permiso, pero �ste s�lo podr� expedirse con la debida
autorizaci�n previa de la concesionaria donde fue adquirido
*/
public class Camion implements Automovil {
	private boolean permiso;
	private boolean permisoConcecionaria;
	public Camion (boolean p, boolean permisoConcecionaria) {
		permiso =p;		
		this.permisoConcecionaria = permisoConcecionaria;
	}
	
	public boolean habilitado() {
		return permiso && permisoConcecionaria;
	}
	

}
