//Escrever se um ano informado pelo usuário é bissexto ou não. Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100);

package lista_1;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano para saber se é bissexto");

		int n1 = sc.nextInt();
	

		if ((n1 % 400==0))  {
			System.out.println(" O ano é bissesxto");
		} else if((n1 %4==0) && (n1%100==0)) {
			System.out.println(" O ano é bissexto");
		}else {System.out.println(" O ano não é bissexto");}

	}
}
