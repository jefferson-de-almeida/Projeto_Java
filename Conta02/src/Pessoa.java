import java.util.Scanner;

public class Pessoa {
	String nome;
	String sobreNome;
	String cpf;
	String rg;
	Endere�o enderecoDaPessoa = new Endere�o();
	
	Scanner scan = new Scanner(System.in); 
	
	void cadastroPessoa(){
		System.out.print("Digite o nome: ");
			this.nome = scan.nextLine();
		
		//enderecoDaPessoa.cadastroEndere�o();
		
		System.out.print("Digite o CPF: ");
			this.cpf = scan.next();
			
		System.out.print("Digite o RG: ");
			this.rg = scan.next();
		
	}
	public Pessoa(String nome, String cpf, String rg, String nomeDarua, String estadoDoPais, String numeroDoCep, int numeroDacasa){
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		Endere�o enderecoDaPessoa = new Endere�o( nomeDarua ,  estadoDoPais , numeroDoCep, numeroDacasa  );
		//tenho que chamar o outro construtuor da outra classe.
	}
	public Pessoa(){
		
	}
	/*
	 * preciso fazer a inscri��o do cadastro da pessoa.
	 * modifica��o do cadastro se necessario.
	 * devolver os dados sempre que pedir
	 *  */
	
}
