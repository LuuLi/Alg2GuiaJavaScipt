package Microondas;

public class SistemaMicroondas {

	public static void main(String[] args) {
		
		Comida carne = new Comida("Carne al horno");
		Microondas micro = new Microondas();
		
		micro.abrir();
		micro.insertarComida(carne);
		micro.cerrar();
		micro.encender();
		micro.cocinar(5, 3);
			
		try {
			for (int i=0; i < 10; i++) {
				Thread.sleep(1000);
				micro.mostrarEstado();
			}
		} catch (InterruptedException e) {
			
		}
	}

}
