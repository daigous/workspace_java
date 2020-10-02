package model;

public class Questao {
	
	// Declarando variáveis:
	private String enunciado;
	private String resposta;
	
	// Criando o construtor:
	public Questao(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	// getters and setters:
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
	
	// Criando métodos:
	public String exibirQuestao() {
		return enunciado;
	}
	public boolean corrigir(String respUsuario) {
		if (respUsuario.equals(resposta)) {
			return true;
		}
		else {
			return false;
		}
	}
}
