package userinterface;
import model.CartaoPrePago;
import model.CartaoCashBack;

public class Compra {
	public static void main(String[] args) {
		
		System.out.println("Cartão comum: ");
		CartaoPrePago c = new CartaoPrePago("1234-5678-1010", "Diego Augusto", 2025, 8);
		c.adicionarCredito(200);
		c.comprar(150);
		System.out.println("");
		
		System.out.println("Cartão BRONZE: ");
		CartaoCashBack b = new CartaoCashBack("1234-5678-1010", "Diego Augusto", 2025, 8, 1);
		b.adicionarCredito(200);
		b.comprar(150);
		System.out.println("");
		
		System.out.println("Cartão SILVER: ");
		CartaoCashBack s = new CartaoCashBack("1234-5678-1010", "Diego Augusto", 2025, 8, 2);
		s.adicionarCredito(200);
		s.comprar(150);
		System.out.println("");
		
		System.out.println("Cartão GOLD: ");
		CartaoCashBack g = new CartaoCashBack("1234-5678-1010", "Diego Augusto", 2025, 8, 3);
		g.adicionarCredito(200);
		g.comprar(150);
		System.out.println("");
	}
	

}
