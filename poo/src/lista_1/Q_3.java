//3-Escrever um programa para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia total percorrida pelo autom�vel e o total de combust�vel gasto.


package lista_1;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione a distancia total!");
		
		double n1 = sc.nextDouble();
		System.out.println("Adicione o total de combustivel gasto");
		double n2 = sc.nextDouble();
		
		System.out.println("Media gasto por km");
		System.out.println(n2/n1 +"   Litros por km");
		// TODO Auto-generated method stub
		
		

	}

}
