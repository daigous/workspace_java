package model;

public class questaoComDica extends questaoSimples {
	
	protected String dica;
	
	public questaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		// TODO Auto-generated constructor stub
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		return this.enunciado+"\n"+"Dica: "+dica;
	}
}
