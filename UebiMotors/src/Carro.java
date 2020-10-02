/* Esta classe carro não terá método Main, poi nela teremos apenas a definição de como é o novo tipo de dado "Carro",
 * ou seja, teremos aqui definições de variáveis.*/

public class Carro {
	// Variáveis do tipo "Carro"
	String	marca;
	String	modelo;
	int		ano;
	String	cor;
	int		finalPlaca;
	double	preco;
	
	/* Posso também declarar funcionalidades para o objeto, capazes de, por exemplo:
	 Receber dados de outras classes, retornar valores calculados, ou simplesmente fazer uma ação.
	 
	 NOME_DA_FUNCIONALIDADE(){
	 	[...]comandos[...];
	 }
	 
	 Porém, toda funcionalidade trabalha no modelo: Entrada -> Processamento -> Saída.
	 
	 TIPO_SAIDA NOME_DA_FUNCIONALIDADE(VARIAVEIS){
	 	[...]comandos[...];
	 }
	 
	 	Tipos possíveis de saída:
	 		int, float, double, etc.;
	 		void -> Aqui é quando a funcionalidade não gera valores de saída;
	*/
	void exibirInfo() { //Criando um novo método (ação) chamado "exibirInfo";
		System.out.println("Carro:	"+marca+"-"+modelo);
		System.out.println("	Ano: "+ano+" Final Placa: "+finalPlaca);
		System.out.println("	Cor: "+cor+"Preço: R$ "+preco);
	}
	
	// Criando uma função vazia, sem entrada, que não gera saída (apenas o texto, que não é uma saída)
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
	
	// Criando uma função sem entrada que gera saída, definida com RETURN
	double calcularIPVA() {
		double ipva;
		if (ano < 2000) {
			ipva = 0.0;
		}
		else {
			ipva = preco * 0.04;
		}
		// Toda função declarada com tipo diferente de void, OBRIGATÓRIAMENTE deve ter a instrução RETURN:
		return ipva;
	}
	
	// Criando uma função que recebe entrada (parâmetro percentual), processa e gera uma saída (parâmetro desconto):
	double calcularDesconto(double percentual) {
		double desconto = preco - preco*percentual/100;
		return desconto;
	}
}
