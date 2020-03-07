//4-Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.



package lista_1;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nome do vendedor!");
		
		String nome = sc.nextLine();//Escrever um programa que leia o nome de um vendedor
		
		
		System.out.println("Adicione o salario fixo do vendedor");
		double salario = sc.nextDouble();  //o seu salário fixo
		
		System.out.println("Adicione o total de vendas");
		double totalVendas = sc.nextDouble();  //Total de vendas
		
		double comicao = totalVendas*0.15+ salario; // Variavel para somar vendas 
		
		System.out.println("O vendedo  "+ nome+" recebeu esse mês R$"+comicao); // emprime na tela o resultado

		

	}

}
