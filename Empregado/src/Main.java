
public class Main {
	public static void main(String[] args) {
		// Declarando variáveis dos empregados:
		Empregado e1, e2;
		
		// Carregando na memória:
		e1 = new Empregado();
		e2 = new Empregado();
		
		// Atribuindo valores às variáveis dos empregados e1 e e2:
		e1.setNome("Diego");
		e1.setCargo("Analista SR");
		e1.setSalario(10000.00);
		
		e2.setNome("Patinho");
		e2.setCargo("Analista PL");
		e2.setSalario(5000.00);
		
		// Executando funções:
		System.out.println("Executando função imprimir()");
		e1.imprimir();
		e2.imprimir();
		System.out.println("Executando a função aumentarSalario(10%)");
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(10.0);
		System.out.println("");
		System.out.println("Novas informações:");
		e1.imprimir();
		e2.imprimir();
	}
}
