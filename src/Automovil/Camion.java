package Automovil;
/*Los camiones también podrán estar habilitados luego de
la adquisición de un permiso, pero éste sólo podrá expedirse con la debida
autorización previa de la concesionaria donde fue adquirido
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
