import java.util.Scanner;

public class Endere�o {
	String nomeDaRua;
	String EstadoDoPais;
	int numeroDaCasa;
	String numeroDoCep;
	
	Scanner lendoVar = new Scanner(System.in);
	// construtor de acesso.
	public Endere�o(String nomeDaRua,String estadoDoPais,String numeroDoCep, int numeroDaCasa ){
		this.nomeDaRua = nomeDaRua;
		this.EstadoDoPais = estadoDoPais;
		this.numeroDoCep = numeroDoCep;
		this.numeroDaCasa = numeroDaCasa;
	}
	public Endere�o(){
		
	}
	void cadastroEndere�o(){
		
		System.out.print("Digite o nome da Rua: ");
			this.nomeDaRua = lendoVar.nextLine();
		
		System.out.print("Digite o Estado: ");
			this.EstadoDoPais = lendoVar.next();
		
		System.out.print("Digite o n�mero da Casa: ");
			this.numeroDaCasa = lendoVar.nextInt();
		
		System.out.print("Digite o n�mero do CEP: ");
			this.numeroDoCep = lendoVar.next();
		
	}
	/*
	 * Preciso fazer com que esta classe fa�a a verifica��o para inscri��o da conta da pessoa.
	 * inscri��o da conta.
	 * mostrar os dados da conta referente a pessoa
	 * 
	 */
}
