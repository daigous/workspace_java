
public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, int ano, String categoria, int estante, int prateleira) {
		this.titulo		= titulo;
		this.autor		= autor;
		this.ano		= ano;
		this.categoria	= categoria;
		this.estante	= estante;
		this.prateleira	= prateleira;
		this.emprestado = false;
	}
	
	// Getters and Setter gerados automaticamente através das opções: Source > Generate Getters and Setters.
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstante() {
		return estante;
	}
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public int getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	
	// Emprestar
	void emprestar() {
		emprestado = true;
	}
	
	// Devolver
	void devolver() {
		emprestado = false;
	}
	
	// Imprimir
	void imprimir() {
		System.out.println("Título:	"+titulo);
		System.out.println("Autor: "+autor+", Ano: "+ano+", Categoria: "+categoria+", Posição: "+estante+"-"+prateleira);
		if (emprestado) {
			System.out.println("Situação: Indisponível, este livro foi emprestado por alguem.");
		}
		else {
			System.out.println("Situação: Disponível.");
		}
		System.out.println("");
	}
}
