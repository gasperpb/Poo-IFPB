//Escrever se um ano informado pelo usu�rio � bissexto ou n�o. Um ano � bissexto quando � (divis�vel por 400) ou � (divis�vel por 4 e n�o por 100);

package lista_1;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano para saber se � bissexto");

		int n1 = sc.nextInt();
	

		if ((n1 % 400==0))  {
			System.out.println(" O ano � bissesxto");
		} else if((n1 %4==0) && (n1%100==0)) {
			System.out.println(" O ano � bissexto");
		}else {System.out.println(" O ano n�o � bissexto");}

	}
}
