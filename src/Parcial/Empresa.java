package Parcial;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private List<Bien> bienes;
	private static Empresa instancia = null;
	
	private Empresa() {
		nombre = "Empresa BBD";
		bienes = new ArrayList<>();
	}
	
	public static Empresa getEmpresa() {
		if (instancia == null) {
			instancia = new Empresa();
		}
		return instancia;
	}
	
	public void agregarBien(Bien bien) throws BienInvalidoException{
		if(bien == null) {
			throw new BienInvalidoException("Bien vacío");
		}
		if(pertenece(bien, bienes)) {
			throw new BienInvalidoException("Bien ya existente");
		}
		if (!esBienValido(bien)) {
			throw new BienInvalidoException("Bien de tipo inexistente");
		}
		this.bienes.add(bien);
	}
	
	private boolean esBienValido(Bien bien) {
		if ((bien instanceof Automotor) || (bien instanceof Cuenta)) {
			return true;
		}
		return false;
	}

	private boolean pertenece(Bien bien, List<Bien> bienes2) {
		for(Bien b: bienes2) {
			if(b.equals(bien)) {
				return true;
			}
		}
		return false;
	}
	
	public void eliminarBien(Bien bien) throws BienInvalidoException {
		if(bien == null) {
			throw new BienInvalidoException("Bien vacío");
		}
		if(!bienes.remove(bien)) {
			throw new BienInvalidoException("Bien no existente");
		}
	}
	public static void notificarTransferencia(Titular titular1, Titular titular2) throws SistemaEmpresaException {
		if (titular2 == null) {
			throw new TitularVacioException();
		}
		if(titular1.getDireccion() == null || titular2.getDireccion() == null) {
			throw new DireccionIncorrectaException();
		}
		System.out.println("Enviar mail al titular anterior" + titular1.getNombre() + " de cambio alñ nuevo titular " + titular2.getNombre());
	}
	
	public void mostrarBienesTitular(Titular titular) {
		for(Bien b: bienes) {
			if(b.getTitular().equals(titular)) {
				System.out.println("tipo de bien: ");
				System.out.println(b.getClass());
				System.out.println("Codigo: ");
				System.out.println(b.getCodigo());
			}
		}
	}
	
	public static void main(String[] args) {
		Empresa empresa;
		empresa = Empresa.getEmpresa();
		
		List<Bien> bienes = new ArrayList<>();
		Titular t1 = new Titular("Mario", "Herrero");
		t1.setDireccion("m203");
		Titular t2 = new Titular("Juan", "Pereira");
		t2.setDireccion("m403");
		Titular t3 = new Titular("Natalia", "Flores");
		t3.setDireccion("m332");
		Titular t4 = new Titular("Florencia", "Herrero");
		try {
			Cuenta cuenta = new Cuenta(t2, 200, 400);
			Automotor autom1 = new Automotor(t1, 120, 220);
			autom1.setAlicuota(20);
			autom1.setPrima(100);
			Automotor autom2 = new Automotor();
			autom2.setTitular(t2);
			autom2.setValorFiscal(100);
			autom2.setValorMercado(200);
			autom2.setAlicuota(4);
			autom2.setPrima(102);
			empresa.agregarBien(cuenta);
			empresa.agregarBien(autom1);
			empresa.agregarBien(autom2);
			cuenta.transferir(t3);
		} catch(TitularVacioException e) {
			System.out.println("El titular insertado esta vacio.");
		} catch(ValorInvalidoException e) {
			System.out.println("El valor ingresado es invalido");
		} catch (AlicuotaException e) {
			System.out.println("La alicuota insertada es invalida.");
		} catch (PrimaInvalidaException e) {
			System.out.println("La prima insertada es invalida.");
		} catch (SistemaEmpresaException e) {
			System.out.println("Error al enviar mail.");
		}
		
		
	}
}
