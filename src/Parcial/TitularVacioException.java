package Parcial;

public class TitularVacioException extends SistemaEmpresaException {
	public TitularVacioException() {
		super("El titular insertado no es válido.");
	}
}
