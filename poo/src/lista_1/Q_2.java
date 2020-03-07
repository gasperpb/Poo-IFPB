//2-Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

package lista_1;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o primeiro número");
		
		int n1 = sc.nextInt();
		System.out.println("Adicione o proximo número");
		int n2 = sc.nextInt();
		System.out.println("Soma");
		System.out.println(n1+n2);
		System.out.println("Subtração");
		System.out.println(n1-n2);
		System.out.println("Multiplicação");
		System.out.println(n1*n2);
		System.out.println("Divisão");
		System.out.println(n1/n2);
		// TODO Auto-generated method stub
		
		

	}

}
