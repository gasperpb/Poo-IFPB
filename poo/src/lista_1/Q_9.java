//Entrar com dois n�meros e imprimi-los em ordem decrescente (suponha n�meros diferentes)
package lista_1;

import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o  n�mero");

		int n1 = sc.nextInt();
		System.out.println("Adicione o  proximo n�mero");

		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(" Ordem decrescente � " + n1 + " e " + n2);
		} else {
			System.out.println(" Ordem decrescente  � " + n2 + " e " + n1);
		}

	}
}
