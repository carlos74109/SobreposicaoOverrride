package Entidades;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	

	public ContaPoupanca(Double saldo, Double taxaJuros) {
		super(saldo);
		this.taxaJuros = taxaJuros;
	}



	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void sacar(double sacar) {
		super.sacar(sacar);
		saldo -= 5;
	}
	
}
