package Viajes;

public class Trayecto {
	private Estacion orig;
	private Estacion dest;

	public Trayecto(Estacion orig, Estacion dest) {
		this.orig = orig;
		this.dest = dest;
	}
	public Trayecto() {
	}

	public Estacion getOrig() {
		return orig;
	}

	public void setOrig(Estacion orig) throws EstacionErroneaException {
		if(orig == null) {
			throw new EstacionErroneaException();
		}
		this.orig = orig;
	}

	public Estacion getDest() {
		return dest;
	}

	public void setDest(Estacion dest) throws EstacionErroneaException{
		if (dest == null) {
			throw new EstacionErroneaException();
		}
		this.dest = dest;
	}
}
