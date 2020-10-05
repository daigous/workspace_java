package model;

public class questaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public questaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return this.enunciado;
	}
	
	public boolean corrigir(String resposta) {
		if (this.resposta.equals(resposta)){
			return true;
		}
		else {
			return false;
		}
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	

}
