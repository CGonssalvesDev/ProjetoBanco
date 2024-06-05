package br.banco.principal;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import br.banco.classes.Cadastro;

public class Clientes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro conta;

		System.out.println("Olá, vamos criar sua conta!");
		System.out.print("Digite o numero da sua conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Quer fazer o deposito inicial?(y/n): ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Qual o valor do deposito?: ");
			double depositoInicial = sc.nextInt();
			conta = new Cadastro(nome, numero, depositoInicial);
		} 
		else {
			conta = new Cadastro(nome, numero);
		}
		
		System.out.println();
		System.out.println("Os dados da sua conta são:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposita(valorDeposito);
		System.out.println();
		System.out.println("Conta com o novo saldo: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saca(valorSaque);
		System.out.println();
		System.out.println("Conta com o novo saldo: ");
		System.out.println(conta);
		
		sc.close();
	}
}
