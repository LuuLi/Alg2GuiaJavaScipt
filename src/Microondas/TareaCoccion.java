package Microondas;

import java.util.TimerTask;

public class TareaCoccion extends TimerTask {
	
	private Microondas microondas;
	private int transcurrido;
	
	public TareaCoccion(Microondas m) {
		microondas = m;
	}
	
	public void run() {
		cocinar();
	}
	
	private void cocinar() {
		try {
			for (int i = 0; i < microondas.getTiempo(); i++) {
				Thread.sleep(1000);
				transcurrido = i;
				microondas.getContenido().get().cocinar(microondas.getIntensidad());
			}
		} catch (InterruptedException e) {
			System.out.println("Coccion finalizada");
			microondas.cancelar();
		}
		microondas.cancelar();
	}
	
	public int getTiempoTranscurrido() {
		return transcurrido;
	}
}
