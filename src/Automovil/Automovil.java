package Automovil;
/*Definir la clase Automovil, que puede subclasificarse en AutoMediano o Camion.
Los autos medianos son capaces de estar habilitados luego de la adquisici�n de un
permiso en una fecha dada. Los camiones tambi�n podr�n estar habilitados luego de
la adquisici�n de un permiso, pero �ste s�lo podr� expedirse con la debida
autorizaci�n previa de la concesionaria donde fue adquirido. Las concesionarias de
camiones verifican ciertas caracter�sticas del cami�n para poder registrar al mismo.
Este dato tambi�n es registrado dentro de la misma concesionaria.
 */
public interface Automovil {
	boolean habilitado();
}
