//4-Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro).
//Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s.



package lista_1;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nome do vendedor!");
		
		String nome = sc.nextLine();//Escrever um programa que leia o nome de um vendedor
		
		
		System.out.println("Adicione o salario fixo do vendedor");
		double salario = sc.nextDouble();  //o seu sal�rio fixo
		
		System.out.println("Adicione o total de vendas");
		double totalVendas = sc.nextDouble();  //Total de vendas
		
		double comicao = totalVendas*0.15+ salario; // Variavel para somar vendas 
		
		System.out.println("O vendedo  "+ nome+" recebeu esse m�s R$"+comicao); // emprime na tela o resultado

		

	}

}
