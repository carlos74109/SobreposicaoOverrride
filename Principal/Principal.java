package Principal;

import Entidades.Conta;
import Entidades.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
		
		
		ContaPoupanca cp = new ContaPoupanca(200.0, 50.0);
		
		cp.sacar(100);
		Conta acc1 = new ContaPoupanca(200.0, 20.2);
		acc1.sacar(100);
		System.out.println(acc1.getSaldo());
		
	}

}
