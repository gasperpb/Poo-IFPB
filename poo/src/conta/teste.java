package conta;

import java.util.Scanner;

//import java.awt.Container;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Biblioteca para poder adicionar valores digitados

		conta contac = new conta();

		System.out.println("Ola digite o nome do titular da conta");

		contac.nome = sc.nextLine(); // adiciona o nome a conta

		System.out.println("Ola digite o numero da conta");

		contac.numero = sc.nextInt(); // adiciona o numero da conta

		System.out.println("Ola digite o sado inicial ");
		contac.saldo = sc.nextDouble(); // adiciona o saldo

		System.out.println("Ola digite quanto você que depositar");

		contac.depositar(sc.nextDouble()); // vamos fazer um deposito

		contac.sacar(300); // um saque
		System.out.println(contac.saldo);

	}

}
