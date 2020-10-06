package model;

/* Por que criamos classes abstratas?
 * Para termos um TEMPLATE de como as classes filhas devem ser efinidas.
 * Desde a sua estrutura m�nima at� definind um "compromisso" (ou "contrato") no qual as classes filhas obrigam-se a cumprir.
 * De que maneira?
 * Definindo m�todos abstratos na classe pai e as classes filhas inserindo a l�gica desdes m�todos.
 */

public class Veiculo {
	protected String marca;
	protected String modelo;
	
	public Veiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	/* Aqui est� o grande trunfo das classes abstratas:
	 * Defino O QUE as filhas devem implementar e o 
	 */
	
	public abstract void acelerar();
	public abstract void frear();
	

}
