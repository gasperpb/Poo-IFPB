//Ler 2 valores e perguntar qual opera��o aritm�tica o usu�rio quer fazer com eles.
//Usar switch..case. Informar o resultado da opera��o.

package lista_1;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione o  n�mero");

		int n1 = sc.nextInt();
		System.out.println("Adicione o  proximo n�mero");

		int n2 = sc.nextInt();

		System.out.println("Adicione o tipo de opera��o 1 para somar, 2 para subtrair 3 multiplicar e 4 para dividir");

		int operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println(n1 + n2);

			break;

		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n1 / n2);
			break;

		default:
			break;
		}

	}
}
