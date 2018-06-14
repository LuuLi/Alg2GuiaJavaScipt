package Parcial;


public abstract class Bien {
	protected Titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	
	private static int proximoCodigo  = 0;
	
	public Bien() {
		codigo = proximoCodigo;
		proximoCodigo++;
	}
	
	public Bien(Titular titular, float valorMercado, float valorFiscal) {
		this.titular = titular;
		this.valorFiscal = valorFiscal;
		this.valorMercado = valorMercado;
		codigo = proximoCodigo;
		proximoCodigo++;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) throws TitularVacioException{
		if(titular == null) {
			throw new TitularVacioException();
		}
		this.titular = titular;
	}

	public float getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(float valorMercado) throws ValorInvalidoException {
		if(valorMercado < 0) {
			throw new ValorInvalidoException("El valor de mercado insertado es inválido.");
		}
		this.valorMercado = valorMercado;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(float valorFiscal) throws ValorInvalidoException {
		if (valorFiscal < 0) {
			throw new ValorInvalidoException("El valor fiscal ingresado es incorrecto.");
		}
		this.valorFiscal = valorFiscal;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public boolean equals(Bien bien) {
		return this.getCodigo() == bien.getCodigo();
	}

}
