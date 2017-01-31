import java.util.Scanner;

public class Pessoa {
	String nome;
	String sobreNome;
	String cpf;
	String rg;
	Endereço enderecoDaPessoa = new Endereço();
	
	Scanner scan = new Scanner(System.in); 
	
	void cadastroPessoa(){
		System.out.print("Digite o nome: ");
			this.nome = scan.nextLine();
		
		//enderecoDaPessoa.cadastroEndereço();
		
		System.out.print("Digite o CPF: ");
			this.cpf = scan.next();
			
		System.out.print("Digite o RG: ");
			this.rg = scan.next();
		
	}
	public Pessoa(String nome, String cpf, String rg, String nomeDarua, String estadoDoPais, String numeroDoCep, int numeroDacasa){
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		Endereço enderecoDaPessoa = new Endereço( nomeDarua ,  estadoDoPais , numeroDoCep, numeroDacasa  );
		//tenho que chamar o outro construtuor da outra classe.
	}
	public Pessoa(){
		
	}
	/*
	 * preciso fazer a inscrição do cadastro da pessoa.
	 * modificação do cadastro se necessario.
	 * devolver os dados sempre que pedir
	 *  */
	
}
