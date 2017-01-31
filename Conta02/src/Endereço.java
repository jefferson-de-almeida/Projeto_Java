import java.util.Scanner;

public class Endereço {
	String nomeDaRua;
	String EstadoDoPais;
	int numeroDaCasa;
	String numeroDoCep;
	
	Scanner lendoVar = new Scanner(System.in);
	// construtor de acesso.
	public Endereço(String nomeDaRua,String estadoDoPais,String numeroDoCep, int numeroDaCasa ){
		this.nomeDaRua = nomeDaRua;
		this.EstadoDoPais = estadoDoPais;
		this.numeroDoCep = numeroDoCep;
		this.numeroDaCasa = numeroDaCasa;
	}
	public Endereço(){
		
	}
	void cadastroEndereço(){
		
		System.out.print("Digite o nome da Rua: ");
			this.nomeDaRua = lendoVar.nextLine();
		
		System.out.print("Digite o Estado: ");
			this.EstadoDoPais = lendoVar.next();
		
		System.out.print("Digite o número da Casa: ");
			this.numeroDaCasa = lendoVar.nextInt();
		
		System.out.print("Digite o número do CEP: ");
			this.numeroDoCep = lendoVar.next();
		
	}
	/*
	 * Preciso fazer com que esta classe faça a verificação para inscrição da conta da pessoa.
	 * inscrição da conta.
	 * mostrar os dados da conta referente a pessoa
	 * 
	 */
}
