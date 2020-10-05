package userinterface;
import java.util.Scanner;

import model.CartaoCashBack;
import model.CartaoPrePago;

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
		System.out.println(g);
		g.adicionarCredito(200);
		g.comprar(150);
		System.out.println("");
		
		
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.println("Selecione o Cartão desejado:");
		System.out.println("1. Bronze;");
		System.out.println("2. Silver;");
		System.out.println("3. Gold");
		int tipo = teclado.nextInt();
		
		CartaoPrePago c = new CartaoCashBack("1234.5678.9999.1010", nome, 2025, 8, tipo);
		
		int opcao = 99;
		
		while (opcao != 0) {
			System.out.println("Qual operacao será realizada?");
			System.out.println("1. Adicionar crédito.");
			System.out.println("2. Realizar compra.");
			System.out.println("3. Imprimir informações do cartão.");
			System.out.println("0. Sair.");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Qual valor será adicionado ao Cartão?");
				double valor = teclado.nextDouble();
				c.adicionarCredito(valor);
				System.out.println("");
				break;
			case 2:
				System.out.println("Qual o valor da compra?");
				valor = teclado.nextDouble();
				c.comprar(valor);
				System.out.println("");
				break;
			case 3:
				System.out.println(c);
				System.out.println("");
				break;
			}
		}*/
	}
}

