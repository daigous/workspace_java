
public class Empregado {
	private String	nome;
	private String	cargo;
	private double	salario;
	
	// uma função para modificar os atributos:
	public void setNome(String nome) {
		this.nome = nome;
	}
	// uma função para consultar o nome:
	public String getNome() {
		return nome;
	}
	// Para Cargo:
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo() {
		return cargo;
	}
	// Para Salário:
	public void setSalario(double salario) {
		this.salario = salario;	// THIS é OBRIGATÓRIO pois o parâmetro tem o mesmo nome da variável
	}
	public double getSalario() {
		return salario;			// THIS é opcional pois não conflita
	}	
	
	
	void imprimir() {
		System.out.println("-------- IMPRESSÃO --------");
		System.out.println("Nome:		"+nome);
		System.out.println("Cargo:		"+cargo);
		System.out.println("Salário: R$	"+salario);
		System.out.println("----------- FIM -----------");
		System.out.println("");
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + salario*percentual/100;
	}
}
