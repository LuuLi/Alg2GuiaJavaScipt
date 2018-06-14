package Microondas;

public interface IMicroondas {
	void encender();
	void apagar();
	boolean abrir();
	void cerrar();
	boolean retirarComida();
	boolean insertarComida(Comida c);
	void mostrarEstado();
	boolean cocinar(int nivel, int segundos);
	void cancelar();
}
