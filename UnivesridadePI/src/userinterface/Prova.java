package userinterface;
import model.questaoComDica;
import model.questaoMultiplaEscolha;
import model.questaoSimples;
import java.util.Scanner;

public class Prova {
	public static void main(String[] args) {
		questaoSimples questao[];
		questao = new questaoSimples[5];
		questao[0] = new questaoSimples("Quem descobriu o Brasil", "Pedro Alvares Cabral");
		questao[1] = new questaoSimples("Qual o melhor time do mundo?", "Paraná Clube");
		questao[2] = new questaoMultiplaEscolha("A resposta é a opção B", "B", "A", "B", "C", "D");
		questao[3] = new questaoComDica("Qual a cor do cavalo Branco de Napoleão?", "Marrom", "Branco era seu nome");
		questao[4] = new questaoSimples("Está muito calor?", "Sim");
		
		Scanner teclado = new Scanner(System.in);
		int nota = 0;
		
		for (questaoSimples q: questao) {
			System.out.println(q.aplicarQuestao());
			String resposta = teclado.nextLine();
			if (q.corrigir(resposta)) {
				System.out.println("Resposta Correta!");
				nota++;
			}
			else {
				System.out.println("Errou!");
			}
		}
		System.out.println("Você acertou "+nota+" questões! Parabéns!!");
	}
}