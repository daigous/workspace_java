
public class Main {
	public static void main(String[] args) {
		// Declarando vari�veis dos empregados:
		Empregado e1, e2;
		
		// Carregando na mem�ria:
		e1 = new Empregado();
		e2 = new Empregado();
		
		// Atribuindo valores �s vari�veis dos empregados e1 e e2:
		e1.setNome("Diego");
		e1.setCargo("Analista SR");
		e1.setSalario(10000.00);
		
		e2.setNome("Patinho");
		e2.setCargo("Analista PL");
		e2.setSalario(5000.00);
		
		// Executando fun��es:
		System.out.println("Executando fun��o imprimir()");
		e1.imprimir();
		e2.imprimir();
		System.out.println("Executando a fun��o aumentarSalario(10%)");
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(10.0);
		System.out.println("");
		System.out.println("Novas informa��es:");
		e1.imprimir();
		e2.imprimir();
	}
}
