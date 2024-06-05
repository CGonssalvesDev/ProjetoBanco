package br.banco.classes;

public class Cadastro {

	private String nomeDoCliente;
	private int numeroDaConta;
	private double saldo;
	
	
	public Cadastro(String nomeDoCliente, int numeroDaConta) {
		this.nomeDoCliente = nomeDoCliente;
		this.numeroDaConta = numeroDaConta;
	}

	public Cadastro(String nomeDoCliente, int numeroDaConta, double depositoInicial) {
		this.nomeDoCliente = nomeDoCliente;
		this.numeroDaConta = numeroDaConta;
		deposita(depositoInicial);
	}
	
	public String toString() {
		return " - Nome: "+ nomeDoCliente +
		" - Conta: "+ numeroDaConta +
		" - Saldo atual: $ "+ saldo;
	}

	public void deposita (double valorDoDeposito) {
		 saldo += valorDoDeposito;
	}

	public void saca (double valorDoSaque) {
		 saldo -= valorDoSaque + 5;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
}