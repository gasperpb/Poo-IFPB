//Entrar com dois n�meros e imprimir o menor n�mero (suponha n�meros diferentes).

package lista_1;

import java.util.Scanner;

public class Q_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o  n�mero");

		int n1 = sc.nextInt();
		System.out.println("Adicione o  proximo n�mero");

		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("O valor maior �, valor =" + n1);
		} else {
			System.out.println("O valor maior �, valor =" + n2);
		}

	}
}
