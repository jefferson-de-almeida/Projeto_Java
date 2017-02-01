/*
 *  autor : jefferson de almeida
 */
public class exer02main {
	public static void main (String args[]){
		exer02 livro = new exer02();
		livro.nomeLivro = "As Crônicas de Narnia";
		livro.autor = "Allan Pool";
		livro.qtdPaginas = 788;
		livro.anoLancamento = 2003;
		livro.Imprime();
		exer02 livro2 = new exer02(" O Jubileu"," Casias Alombar", 965, 2005);
		livro2.Imprime();
		
		
	}
}
