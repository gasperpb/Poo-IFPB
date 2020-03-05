package conta;

//import java.awt.Container;

public class teste {
	
	
	public static void main(String[] args) {
		
      conta contac= new conta();
      
      contac.nome= "achilles";
      contac.numero=1209;
      contac.saldo =1000;
      
      
      contac.depositar(500);
      contac.sacar(300);
      System.out.println(contac.saldo);
      
}

}
