//Entrar com dois números e imprimir o menor número (suponha números diferentes).

package lista_1;

import java.util.Scanner;

public class Q_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o  número");

		int n1 = sc.nextInt();
		System.out.println("Adicione o  proximo número");

		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("O valor maior é, valor =" + n1);
		} else {
			System.out.println("O valor maior é, valor =" + n2);
		}

	}
}
