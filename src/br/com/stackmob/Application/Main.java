package br.com.stackmob.Application;
import br.com.stackmob.Entity.Cliente;
import br.com.stackmob.Entity.Conta;
import br.com.stackmob.Services.ContaCorrente;
import br.com.stackmob.Services.ContaPoupanca;


public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
