//import java.util.Scanner;

public class ProgramaContaMain {

	public static void main(String[] args) {
		
		Conta jefferson = new Conta();
		jefferson.cadastroDaConta();
		jefferson.depositaNaConta(1000.0);
		jefferson.sacaDaConta(500.0);
		System.out.println("************************** imprimindo a conta *********************");
		jefferson.ImprimirConta();
		 
		//jefferson.menuEscolhaDaConta();
	}

}
/*
 * também posso ter o método constrututor, em cada classe eu posso fazer um ou vários.
 * 
 */