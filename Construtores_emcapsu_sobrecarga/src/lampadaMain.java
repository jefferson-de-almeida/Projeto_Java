/*
 *  Autor : Jefferson de almeida
 */
public class lampadaMain {

	public static void main(String[] args) {
		lampadaexer01 teste1 = new lampadaexer01("Incandecente", 60, 6.25 );
		teste1.Imprime();
		System.out.println("Modificando o valor.");
		teste1.setPreco(5.50);
		teste1.Imprime();
		lampadaexer01 teste2 = new lampadaexer01("Fluorecente", 25, 9.50 );
		teste2.Imprime();
	}

}
