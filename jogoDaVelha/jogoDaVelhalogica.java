/*
 *  Autor : jefferson De Almeida
 */
package jogoDaVelha;
import java.util.Scanner;

public class jogoDaVelhalogica {
	
	Scanner input = new Scanner(System.in);
	
	private String[][] matrizJogo = new String[3][3];
	String Sinal = ""; // se for 1 -> [x] se for 2 -> [O]
	byte qtdDeJogadas = 0;
	byte linha = 0;
	byte coluna = 0;
	boolean Vencedor = false;
	
	//***************************************** 1# ***********************************************
	public void InicializaJogo(){  
		for (int i = 0; i < matrizJogo.length; i++) {
			for (int j = 0; j < matrizJogo[i].length; j++) {
				matrizJogo[i][j] = "[ ]";
			}
		}
		qtdDeJogadas++;
	}
	//********************************************************************************************
	//***************************************** 2# ***********************************************
	public void MostraJogada(){
		for (int i = 0; i < matrizJogo.length; i++) {
			for (int j = 0; j < matrizJogo[i].length; j++) {
				System.out.print(matrizJogo[i][j]);
			}
			System.out.println();
		}
		/*
		 *  Possivelmente eu precise avaliar a jogada e mostrar o campeão.
		 */
	}
	//********************************************************************************************
	//***************************************** 3# ***********************************************
	public void recebeJogada(){
		
		boolean flagValidaJogada1;
		boolean flagValidaJogada2;
		
		System.out.println("Escolha uma opção de linha e coluna, valores entre 1 e 3.");
		do{
			flagValidaJogada2 = false;
			
					System.out.print("Informe um valor entre 1 e 3 para a LINHA : ");
					do {
						flagValidaJogada1 = false;
						linha = input.nextByte();
						if (linha >= 1 && linha <= 3) {
							flagValidaJogada1 = true;
						}else {
							System.out.print("Opção Inválida, tente novamente : ");
						}
					} while (!flagValidaJogada1);
					
					System.out.print("Informe um valor entre 1 e 3 para a COLUNA : ");
					do {
						flagValidaJogada1 = false;
						coluna = input.nextByte();
						if (coluna >= 1 && coluna <= 3) {
							flagValidaJogada1 = true;
						}else {
							System.out.print("Opção Inválida, tente novamente : ");
						}
					} while (!flagValidaJogada1);
					matrizJogo[linha-1][coluna-1] = Sinal = "[X]";
					/*
					 *  função que testa terá que está aqui.
					 */
					if (matrizJogo[linha-1][coluna-1] != "[X]" && matrizJogo[linha-1][coluna-1] != "[O]") {
						flagValidaJogada2 = true;
					}else {
						System.out.println("A opção de linha e coluna já foi escolhida em uma jogada anterior, por favor tente novamente.");
					}
			
		}while(!flagValidaJogada2);
		
	}
	// preciso fazer uma função que teste a matris pra saber se é uma jogada válida
	//********************************************************************************************
	//***************************************** 4# ***********************************************
	boolean testaJogada(boolean teste){
		for (int i = 0; i < matrizJogo.length; i++) {
			for (int j = 0; j < matrizJogo[i].length; j++) {
				
			}
		}
		return teste;
	}
}

