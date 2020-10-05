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
		questao[1] = new questaoSimples("Qual o melhor time do mundo?", "Paran� Clube");
		questao[2] = new questaoMultiplaEscolha("A resposta � a op��o B", "B", "A", "B", "C", "D");
		questao[3] = new questaoComDica("Qual a cor do cavalo Branco de Napole�o?", "Marrom", "Branco era seu nome");
		questao[4] = new questaoSimples("Est� muito calor?", "Sim");
		
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
		System.out.println("Voc� acertou "+nota+" quest�es! Parab�ns!!");
	}
}