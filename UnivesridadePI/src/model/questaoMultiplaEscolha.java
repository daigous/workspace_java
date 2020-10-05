package model;

public class questaoMultiplaEscolha extends questaoSimples {
	
	protected String rA;
	protected String rB;
	protected String rC;
	protected String rD;

	public questaoMultiplaEscolha(String enunciado, String resposta, String rA, String rB, String rC, String rD) {
		super(enunciado, resposta);
		// TODO Auto-generated constructor stub
		this.rA = rA;
		this.rB = rB;
		this.rC = rC;
		this.rD = rD;
	}
	
	public String aplicarQuestao() {
		return super.enunciado+"\n"+"A) "+rA+"\n"+"B) "+rB+"\n"+"C) "+rC+"\n"+"D) "+rD;
	}

}
