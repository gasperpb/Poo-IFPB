//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F ­ Feminino, M  Masculino, Sexo Inválido.


package lista_1;

import java.util.Scanner;

public class Q_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite F para feminino e M para maxculino");

		String sexo = sc.nextLine();
	

		if (sexo.equals("F"))  {
			System.out.println(" O Sexo é feminino");
		} else if(sexo.equals("M"))  {
			System.out.println(" O Sexo é masculino");
		}else {System.out.println(" Sexo invalido");}

	}
}
