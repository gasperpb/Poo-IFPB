//2-Escrever um programa que receba dois n�meros e ao final mostre a soma, subtra��o, multiplica��o e a divis�o dos n�meros lidos.

package lista_1;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o primeiro n�mero");
		
		int n1 = sc.nextInt();
		System.out.println("Adicione o proximo n�mero");
		int n2 = sc.nextInt();
		System.out.println("Soma");
		System.out.println(n1+n2);
		System.out.println("Subtra��o");
		System.out.println(n1-n2);
		System.out.println("Multiplica��o");
		System.out.println(n1*n2);
		System.out.println("Divis�o");
		System.out.println(n1/n2);
		// TODO Auto-generated method stub
		
		

	}

}
