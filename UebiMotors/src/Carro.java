/* Esta classe carro n�o ter� m�todo Main, poi nela teremos apenas a defini��o de como � o novo tipo de dado "Carro",
 * ou seja, teremos aqui defini��es de vari�veis.*/

public class Carro {
	// Vari�veis do tipo "Carro"
	String	marca;
	String	modelo;
	int		ano;
	String	cor;
	int		finalPlaca;
	double	preco;
	
	/* Posso tamb�m declarar funcionalidades para o objeto, capazes de, por exemplo:
	 Receber dados de outras classes, retornar valores calculados, ou simplesmente fazer uma a��o.
	 
	 NOME_DA_FUNCIONALIDADE(){
	 	[...]comandos[...];
	 }
	 
	 Por�m, toda funcionalidade trabalha no modelo: Entrada -> Processamento -> Sa�da.
	 
	 TIPO_SAIDA NOME_DA_FUNCIONALIDADE(VARIAVEIS){
	 	[...]comandos[...];
	 }
	 
	 	Tipos poss�veis de sa�da:
	 		int, float, double, etc.;
	 		void -> Aqui � quando a funcionalidade n�o gera valores de sa�da;
	*/
	void exibirInfo() { //Criando um novo m�todo (a��o) chamado "exibirInfo";
		System.out.println("Carro:	"+marca+"-"+modelo);
		System.out.println("	Ano: "+ano+" Final Placa: "+finalPlaca);
		System.out.println("	Cor: "+cor+"Pre�o: R$ "+preco);
	}
	
	// Criando uma fun��o vazia, sem entrada, que n�o gera sa�da (apenas o texto, que n�o � uma sa�da)
	void exibirValorIPVA() {
		double ipva;
		if (ano < 2000) {
			System.out.println("	Veiculo isento de IPVA");
		}
		else {
			ipva = preco * 0.04;
			System.out.println("	Valor do IPVA R$ "+ipva);
		}
	}
	
	// Criando uma fun��o sem entrada que gera sa�da, definida com RETURN
	double calcularIPVA() {
		double ipva;
		if (ano < 2000) {
			ipva = 0.0;
		}
		else {
			ipva = preco * 0.04;
		}
		// Toda fun��o declarada com tipo diferente de void, OBRIGAT�RIAMENTE deve ter a instru��o RETURN:
		return ipva;
	}
	
	// Criando uma fun��o que recebe entrada (par�metro percentual), processa e gera uma sa�da (par�metro desconto):
	double calcularDesconto(double percentual) {
		double desconto = preco - preco*percentual/100;
		return desconto;
	}
}
