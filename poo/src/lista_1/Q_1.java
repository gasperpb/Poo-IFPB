//6-Escrever uma programa em que leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A 
//	A asse a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

package lista_1;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione a primeira variavel");

		int n1 = sc.nextInt();
		System.out.println("Adicione a segunda");
		int n2 = sc.nextInt();

		int n3 = n1;
		n1 = n2;

		n2 = n3;

		System.out.println("A primeira variave A é:" + n1);
		System.out.println("A seguda variave B é:" + n2);
	

	}

}
