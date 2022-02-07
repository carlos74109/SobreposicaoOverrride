package Entidades;

public class Conta {
	
	protected Double saldo;

	public Conta() {
		super();
	}
	
	
	

	public Conta(Double saldo) {
		super();
		this.saldo = saldo;
	}




	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double depostio) {
		saldo += depostio;
	}
	
	public void sacar(double sacar) {
		saldo -= sacar;
	}
	
	
}
