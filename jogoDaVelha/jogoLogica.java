/*
 *  autor : jefferson de almeida
 */
package jogoDaVelha;

import java.util.Scanner;

public class jogoLogica {
	
	Scanner input = new Scanner(System.in);
	
	String[][] jogoVelha = new String[3][3];
	String sinal = "";
	boolean ganhou = false;
	int jogada = 1;
	int linha = 0;
	int coluna = 0;
	
	boolean linhaValida = false;
	boolean ColunaValida = false;
	
	byte repetirJogoEscolha = 0;
	boolean repetirJogo = false;
	boolean escolharepeticao = false;
	
	public void Inicializa(){
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				jogoVelha[i][j] = "[ ]";
			}
		}
	}
	// ******************************************************** Jogadas lógica.
	public void Jogadas(){
		if (jogada % 2 == 1) { //jogador um.
			System.out.println("Vez do jogador 1. Linhas e colunas vão de 1 à 3.");
			sinal = "[X]";
		}else { //jogador dois
			System.out.println("Vez do jogador 2. Linhas e colunas vão de 1 à 3.");
			sinal = "[0]";
		}
		
		linhaValida = false;
		while (!linhaValida) {
			System.out.print("Entre com a lina(1 , 2, 3) : ");;
			linha = input.nextInt();
			if (linha >= 1 && linha <=3) {
				linhaValida = true;
			}else {
				System.out.print("Entrada inválida, tente novamente : ");
			}	
		}
		
		ColunaValida = false;
		while (!ColunaValida) {
			System.out.print("Entre com a Coluna (1 , 2, 3) : ");;
			coluna = input.nextInt();
			if (coluna >= 1 && coluna <=3) {
				ColunaValida = true;
			}else {
				System.out.print("Entrada inválida, tente novamente : ");
			}		
		}
		
		if (jogoVelha[linha-1][coluna-1] == "[X]" || jogoVelha[linha-1][coluna-1] == "[0]") {
			System.out.println("Jogada inválida, tente novamente.");
		}else {
			jogoVelha[linha-1][coluna-1] = sinal;
			jogada++;
		}
	}
	// *****************************************************************************************************
	public void MostraJogo(){
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print(jogoVelha[i][j]);
			}
			System.out.println();
		}
	}
	//****************************************************************************************************
	public void logicDoJogo(){
		
			if (jogoVelha[0][0] == "[X]" && jogoVelha[0][1] == "[X]" &&jogoVelha[0][2] == "[X]" || 
					jogoVelha[1][0] == "[X]" && jogoVelha[1][1] == "[X]" &&jogoVelha[1][2] == "[X]" ||
					jogoVelha[2][0] == "[X]" && jogoVelha[2][1] == "[X]" &&jogoVelha[2][2] == "[X]" ||
					jogoVelha[0][0] == "[X]" && jogoVelha[1][0] == "[X]" &&jogoVelha[2][0] == "[X]" || 
					jogoVelha[0][1] == "[X]" && jogoVelha[1][1] == "[X]" &&jogoVelha[2][1] == "[X]" ||
					jogoVelha[0][2] == "[X]" && jogoVelha[1][2] == "[X]" &&jogoVelha[2][2] == "[X]" ||
					jogoVelha[0][0] == "[X]" && jogoVelha[1][1] == "[X]" && jogoVelha[2][2] == "[X]" || 
					jogoVelha[0][2] == "[X]" && jogoVelha[1][1] == "[X]" && jogoVelha[2][0] == "[X]"){ //jogadas das linha 0, 1, 2
				
				ganhou = true;
				System.out.println("O jogador 1 ganhou!");
				
			}else if (jogoVelha[0][0] == "[0]" && jogoVelha[0][1] == "[0]" &&jogoVelha[0][2] == "[0]" || 
				jogoVelha[1][0] == "[0]" && jogoVelha[1][1] == "[0]" &&jogoVelha[1][2] == "[0]" ||
				jogoVelha[2][0] == "[0]" && jogoVelha[2][1] == "[0]" &&jogoVelha[2][2] == "[0]" ||
				jogoVelha[0][0] == "[0]" && jogoVelha[1][0] == "[0]" &&jogoVelha[2][0] == "[0]" || 
				jogoVelha[0][1] == "[0]" && jogoVelha[1][1] == "[0]" &&jogoVelha[2][1] == "[0]" ||
				jogoVelha[0][2] == "[0]" && jogoVelha[1][2] == "[0]" &&jogoVelha[2][2] == "[0]" ||
				jogoVelha[0][0] == "[0]" && jogoVelha[1][1] == "[0]" && jogoVelha[2][2] == "[0]" || 
				jogoVelha[0][2] == "[0]" && jogoVelha[1][1] == "[0]" && jogoVelha[2][0] == "[0]"){//jogadas das linha 0, 1, 2
				
				ganhou = true;
				System.out.println("O jogador 2 ganhou!");
			
			}else if(jogada > 9){
			
			ganhou = true;
			System.out.println("Fim de jogo, ninguém ganhou!!!");
		
		}
	}
	
	public void jogo(){
		
		do{
			Inicializa();
			ganhou = false;
			System.out.println("Início de Jogo.");
				while(!ganhou){
					
					Jogadas();
					MostraJogo();
					logicDoJogo();
					
				}
			System.out.println("Deseja repetir o jogo? Digite (1) para sim e (2) para não.");
			do{
				repetirJogoEscolha = input.nextByte();
				if (repetirJogoEscolha == 1) {
					repetirJogo = false;
					escolharepeticao = true;
					jogada = 1;
				}else if (repetirJogoEscolha == 2) {
					repetirJogo = true;
					escolharepeticao = true;
				}else {
					System.out.print("Escolha inválida! Tente novamente : ");
					escolharepeticao = false;
				}
			}while(!escolharepeticao);
		
		}while(!repetirJogo);
		
	}
	
	
}
