
public class Empregado {
	private String	nome;
	private String	cargo;
	private double	salario;
	
	// uma fun��o para modificar os atributos:
	public void setNome(String nome) {
		this.nome = nome;
	}
	// uma fun��o para consultar o nome:
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
	// Para Sal�rio:
	public void setSalario(double salario) {
		this.salario = salario;	// THIS � OBRIGAT�RIO pois o par�metro tem o mesmo nome da vari�vel
	}
	public double getSalario() {
		return salario;			// THIS � opcional pois n�o conflita
	}	
	
	
	void imprimir() {
		System.out.println("-------- IMPRESS�O --------");
		System.out.println("Nome:		"+nome);
		System.out.println("Cargo:		"+cargo);
		System.out.println("Sal�rio: R$	"+salario);
		System.out.println("----------- FIM -----------");
		System.out.println("");
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + salario*percentual/100;
	}
}
