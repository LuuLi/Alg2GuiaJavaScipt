package Lamparita;
/*Implemente la clase Lamparita, que sirva para representar el estado de encendido de
una lamparita (encendido o apagado). Defina, asimismo, dos m�todos que permitan
encender y apagar la luz de la lamparita y otro que indique en qu� estado se
encuentra. La lamparita inicialmente est� apagada.
*/
public class Lamparita {
	enum EstadoLampara {ENCENDIDO, APAGADO};
	private EstadoLampara estado;
	
	public Lamparita() {
		estado = EstadoLampara.APAGADO;
	}

	public EstadoLampara getEstado() {
		return estado;
	}

	public void encenderLamparit() {
		estado = EstadoLampara.ENCENDIDO;
	}
	public void apagarLamparit() {
		estado = EstadoLampara.APAGADO;
	}
	
	
}
