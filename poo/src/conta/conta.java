package conta;

public class conta {
	String nome;
	double numero;
	double saldo;

	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;

	}
	

	   public void sacar(double valorSaque){
           if (valorSaque <= saldo)
		saldo = saldo - valorSaque;
	      else
		System.out.println("Saldo insuficiente!");

	   }

}
