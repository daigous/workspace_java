package model;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Crédito no valor de R$"+valor+" adicionado. Saldo total: R$ "+this.saldo);
	}
	
	public boolean comprar(double valor) {
		if (saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Compra autorizada.\nDébito de R$ "+valor+". Saldo Restante: R$ "+this.saldo);
			return true;
		}
		else {
			System.out.println("Compra rejeitada. Saldo insuficiente.");
			return false;
		}
	}
	
	public String toString() {
		return "Cartão: "+this.numeroCartao+". Titular: "+this.nomeTitular+". Saldo: "+this.saldo;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

}
