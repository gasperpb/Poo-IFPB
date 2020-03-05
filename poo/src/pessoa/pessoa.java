/*1.	Crie uma classe para representar uma pessoa, com os atributos privados de nome, 
********data de nascimento e altura. Crie os métodos públicos necessários para sets e gets e 
********também um método para imprimir todos dados de uma pessoa. 
********Crie um método para calcular a idade da pessoa?*/

package pessoa;

public class pessoa {
	
	private static String nome;            // Atributo privado de nome  Obs: CTRL + ALT + seta (para baixo ou para cima) duplica as linhas.
	private static String dataNascimento; // Atributo privado de data
	private static double altura; // Atributo privado altura
	/**
	 * @return the nome
	 */
	public static String getNome() { //get nome
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public static void setNome(String nome) {
		pessoa.nome = nome;
	}
	/**
	 * @return the dataNascimento
	 */
	public static String getDataNascimento() {//get data de nascimento
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public static void setDataNascimento(String dataNascimento) {
		pessoa.dataNascimento = dataNascimento;
	}
	/**
	 * @return the altura
	 */
	public static double getAltura() {//get altura
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public static void setAltura(double altura) {
		pessoa.altura = altura;
	}
	

}


