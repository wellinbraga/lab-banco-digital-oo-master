package br.com.stackmob.Application;

import br.com.stackmob.Entity.Banco;
import br.com.stackmob.Entity.Cliente;
import br.com.stackmob.Entity.Conta;
import br.com.stackmob.Services.ContaCorrente;
import br.com.stackmob.Services.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		// Criando um banco
		Banco banco = new Banco("Banco Digital");

		// Criando clientes
		Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
		Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);

		cc.depositar(999);
		cc.transferir(110, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.adicionarConta(cc);

		cc = new ContaCorrente(cliente2);
		poupanca = new ContaPoupanca(cliente2);

		cc.depositar(5000);
		cc.transferir(200, poupanca);
		
		banco.adicionarConta(cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.listarContas();
		banco.listarClientes();
	}

}
