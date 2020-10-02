
public class WebLoja {
	public static void main(String[] args) {
		Carro c1, c2; //apenas declaro refer�ncias
		
		c1 = new Carro(); // Reservando mem�ria
		c2 = new Carro(); // M�quina virtual Java ocupa espa�o na mem�ria de acordo com a quantidade de atibutos da classe "Carro"
		
		c1.marca		= "Porsche";
		c1.modelo		= "Cayenne";
		c1.ano			= 2020;
		c1.cor			= "Prata";
		c1.finalPlaca	= 8;
		c1.preco		= 1350000.00;
		
		c2.marca		= "Chevrolet";
		c2.modelo		= "Corsa";
		c2.ano			= 1997;
		c2.cor			= "Sujo";
		c2.finalPlaca	= 9;
		c2.preco		= 6200.00;
		
		// O "fen�meno" de agruparmos v�rios tipos de dados em um �nico novo tipo, n�s chamamos de abstra��o.
		// Agora, quando nos referimos ao tipo "Carro", automaticamente a estrutura toda � referenciada.
		
		// System.out.println(c1.marca+"/"+c1.modelo+"/"+c1.cor+"/Placa: "+c1.finalPlaca);
		// System.out.println(c2.marca+"/"+c2.modelo+"/"+c2.cor+"/Placa: "+c2.finalPlaca);
		
		c1.exibirInfo();
		c1.exibirValorIPVA();
		double ipvaC1 = c1.calcularIPVA(); // a vari�vel ipvaC1 foi carregada com o atributo do RETURN na fun��o calcularIPVA;
		System.out.println("	IPVA calculado com a fun��o = R$ "+ipvaC1);
		double novoPreco = c1.calcularDesconto(15.0);
		System.out.println("	O Patr�o ficou LOUCO! O novo pre�o � R$ "+novoPreco);
		
		System.out.println(" ");
		
		c2.exibirInfo();
		c2.exibirValorIPVA();
		double ipvaC2 = c2.calcularIPVA(); // a vari�vel ipvaC1 foi carregada com o atributo do RETURN na fun��o calcularIPVA;
		System.out.println("	IPVA calculado com a fun��o = R$ "+ipvaC2);
		double novoPreco2 = c2.calcularDesconto(3.0);
		System.out.println("	Fera, o que d� pra fazer � R$ "+novoPreco2);
	}
}
