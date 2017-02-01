/*
 * autor : jefferson de almeida
 */
public class exer02 {
	String nomeLivro;
	String autor;
	int qtdPaginas;
	int anoLancamento;
	
	public exer02() {
		
	}
	public exer02 (String nomeLivro, String autor, int qtdpaginas, int anoLancamento){
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.qtdPaginas = qtdpaginas;
		this.anoLancamento = anoLancamento;
	}
	public void Imprime(){
		System.out.println("Nome do livro : "+ nomeLivro);
		System.out.println("Nome do autor : "+ autor);
		System.out.println("quantidade de páginas : "+ qtdPaginas);
		System.out.println("Ano de lançamento : "+ anoLancamento);
	}
		
}
