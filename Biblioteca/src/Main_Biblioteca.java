
public class Main_Biblioteca {
	public static void main(String[] args) {
		// Declarando vari�veis:
		Livro l1, l2, l3, l4, l5;
		
		// Carregando na mem�ria:
		l1 = new Livro("Java Basico", "Prof. Isidro", 2020, "Terror", 1, 2);
		l2 = new Livro("Guia do Mochileiro das Gal�xias", "Douglas Adams", 1979, "Com�dia", 12, 14);
		
		//l1.imprimir();
		//l2.imprimir();
		//l3.imprimir();
		//l4.imprimir();
		//l5.imprimir();
		
		l2.imprimir();
		l2.emprestar();
		l2.imprimir();
		l2.devolver();
		l2.imprimir();
	}
}
