/*
 *  Autor : jefferson de almeida
 */
package pacote_dois;

public class teste2Main {

	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica("Jefferson", 300.00, "46753298967");
		PessoaFisica p2 = new PessoaFisica("Luke cage", 1500.00, "84351320303");
		PessoaFisica p3 = new PessoaFisica("Antônio Darlison", 3000.00, "63459483300");
		PessoaFisica p4 = new PessoaFisica("Jonas", 5000.00, "15582022341");
		PessoaJuridica p5 = new PessoaJuridica("Rayssa Vasconcelos", 40000.00, "37733868000100");
		PessoaJuridica p6 = new PessoaJuridica("Iuri Gaier", 1000.00, "62407432000179");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		System.out.println(p6.toString());
		System.out.println("Fim do programa teste!");
		
	}

}
