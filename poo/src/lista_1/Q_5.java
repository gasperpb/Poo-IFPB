//5-Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
//No final informar o nome do aluno e a sua média (aritmética).




package lista_1;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nome do aluno!");
		
		String nome = sc.nextLine();//Adiciona o Nome do aluno
		
		
		System.out.println("Adicione a primeira nota do aluno");
		double nota1 = sc.nextDouble();  //Adiciona a nota 1
		System.out.println("Adicione a primeira nota do aluno");
		double nota2 = sc.nextDouble();  //Adiciona a nota 1
		System.out.println("Adicione a primeira nota do aluno");
		double nota3 = sc.nextDouble();  //Adiciona a nota 1
		
		
		
		double media = (nota1+nota2+nota3)/3; // Variavel que da a média
		
		System.out.println("A média do aluno  "+nome+" foi "+media); // emprime na tela o resultado

		

	}

}
