package Parcial;

public class Automotor extends Bien implements Asegurable, Transferible, Gravable {
	private float alicuota;
	private float prima;
	
	public Automotor() {
		super();
	}
	
	public Automotor(Titular titular, float valorMercado, float valorFiscal) {
		super(titular, valorMercado, valorFiscal);
	}
	
	@Override
	public void setAlicuota(float alicuota) throws AlicuotaException{
		if(alicuota < 0 || alicuota >= valorMercado) {
			throw new AlicuotaException("Alicuota Invalida");
		}
		this.alicuota = alicuota;
	}

	@Override
	public float calcularImpuesto() {
		return valorFiscal * alicuota;
	}

	@Override
	public void transferir(Titular titular) throws SistemaEmpresaException{
		if(this.getTitular().equals(titular)) {
			throw new TitularInvalidoException("Es el mismo titular");
		}
		try {
			Empresa.notificarTransferencia(this.titular, titular);
		} catch(TitularVacioException e) {
			System.out.println("El titular insertado esta vacío.");
		} catch(DireccionIncorrectaException e) {
			System.out.println("Email no enviado.");
		}
	}

	@Override
	public void setPrima(float prima) throws PrimaInvalidaException {
		if(prima < 0 || prima >= valorMercado) {
			throw new PrimaInvalidaException();
		}
		this.prima = prima;
	}

	@Override
	public float getPrima() {
		return prima;
	}
	
}
