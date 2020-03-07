//Entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes)
package lista_1;

import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o  número");

		int n1 = sc.nextInt();
		System.out.println("Adicione o  proximo número");

		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(" Ordem decrescente é " + n1 + " e " + n2);
		} else {
			System.out.println(" Ordem decrescente  é " + n2 + " e " + n1);
		}

	}
}
