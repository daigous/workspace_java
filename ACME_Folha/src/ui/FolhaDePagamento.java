package ui;

import java.text.NumberFormat;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;
import java.util.ArrayList;

public class FolhaDePagamento {
	public static void main(String[] args) {
		// importo a biblioteca para formatar moeda
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // getCurrentInstance recupera o formato de moedo
		nf.setMinimumFractionDigits(2);  // aqui defino as casas decimais
				
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		lista.add(new Chefe			(123, "Chefão", 12000, 5.0f, 1000));
		lista.add(new Comissionado	(456, "Comissionado da Massa", 5000, 20));
		lista.add(new Empreiteiro	(789, "Empreiteiro Fred", 55000));
		lista.add(new Horista		(012, "Horista do Povo", 9.5f, 160));
		
		System.out.println("      F O L H A     D E    P A G A M E N T O      ");
		System.out.println("--------------------------------------------------");
		
		for (Funcionario f: lista) {
			System.out.printf("   %-30s  %s\n", f.getNome(), nf.format(f.calcularSalario()));
		}
	}

}
