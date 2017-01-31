import java.util.Scanner;
public class SistemaInterno {
	
	private Scanner lendo;

	public void autentica(Autenticavel f){
		
		String senha; // em um futuro eu vou pegar do teclado
		lendo = new Scanner(System.in);
		senha = lendo.nextLine();
		
		if(f.autentica(senha) == true ){
			System.out.println("Bem vindo ao Sistema!!!");
		}else{
			System.out.println("Acesso invalido");
		}
	}
}
