package model;

/* Por que criamos classes abstratas?
 * Para termos um TEMPLATE de como as classes filhas devem ser efinidas.
 * Desde a sua estrutura mínima até definind um "compromisso" (ou "contrato") no qual as classes filhas obrigam-se a cumprir.
 * De que maneira?
 * Definindo métodos abstratos na classe pai e as classes filhas inserindo a lógica desdes métodos.
 */

public class Veiculo {
	protected String marca;
	protected String modelo;
	
	public Veiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	/* Aqui está o grande trunfo das classes abstratas:
	 * Defino O QUE as filhas devem implementar e o 
	 */
	
	public abstract void acelerar();
	public abstract void frear();
	

}
