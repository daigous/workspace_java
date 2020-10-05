package model;

public class CartaoCashBack extends CartaoPrePago {
	
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		double cashback;
		if (saldo >= valor) {
			switch(tipo) {
				case 1:
					cashback = valor * 0.02;
					super.saldo = super.saldo - valor + cashback;
					break;
				case 2:
					cashback = valor * 0.05;
					super.saldo = super.saldo - valor + cashback;
					break;
				case 3:
					cashback = valor * 0.08;
					super.saldo = super.saldo - valor + cashback;
					break;
				default:
					cashback = 0;
					super.saldo = super.saldo - valor + cashback;
					break;
			}
			System.out.println("Compra autorizada.\nDébito de R$ "+valor+". Cashback: R$ "+cashback+". Saldo Restante: R$ "+super.saldo);
			return true;
		}
		else {
			System.out.println("Compra rejeitada. Saldo insuficiente.");
			return false;
		}
	}
	
	
	
}
