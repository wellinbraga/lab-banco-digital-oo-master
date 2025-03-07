package br.com.stackmob.Entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
		addionarCliente(conta.getCliente());
		System.out.println("Conta " + conta.getNumero() + " adicionada ao banco " + nome);
	}
	
	public void addionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
    public void listarContas() {
        System.out.println("Contas no banco " + nome + ":");
        contas.forEach(conta -> System.out.println(conta));
    }
    
    public void listarClientes() {
    	System.out.println("Clietes do Banco " + nome + ":");
    	clientes.forEach(cliente -> System.out.println(cliente));
    	
    }

}
