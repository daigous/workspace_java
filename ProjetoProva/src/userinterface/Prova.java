package userinterface;

import java.util.Scanner;

import model.Questao;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nota = 0;
		double media;
		
		//System.out.println("Quantas questões quer responder?");
		// int qtde = teclado.nextInt();
		
		Questao listaDeQuestoes[];
		listaDeQuestoes = new Questao[4];
		
		for (int cont = 0; cont <= listaDeQuestoes.length - 1; cont++) {
			listaDeQuestoes[cont] = new Questao("Questao numero "+(cont+1), "Resposta "+(cont+1));
		}
		
		// for (int cont = 0; cont <= listaDeQuestoes.length - 1; cont++) {
		for (Questao cont : listaDeQuestoes) {
			System.out.println(cont.exibirQuestao());
			System.out.printf("Resposta: ");
			String resposta = teclado.nextLine();
			if (cont.corrigir(resposta)) {
				System.out.println("Certa Resposta!");
				nota++;
			}
			else {
				System.out.println("ERROOUUUU!!");
			}
			// System.out.println("Próxima Questão:");
			System.out.println("");	
		}
		media = 10.0 * (nota / (1.0 * listaDeQuestoes.length));
		System.out.println("");
		System.out.println("Resultado: ");
		System.out.printf("Acertou %d questão(ões). Média final: %.1f\n", nota, media);
		//System.out.printf(" questão(ões). Média final: %.1f\n", media);
	}
}
