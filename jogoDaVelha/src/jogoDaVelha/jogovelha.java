package jogoDaVelha;

import java.util.Scanner;

public class jogovelha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] jogoVelha = new String[3][3];
		String sinal = "";
		boolean ganhou = false;
		int jogada = 1;
		int linha = 0;
		int coluna = 0;
		
		
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				jogoVelha[i][j] = "[ ]";
			}
		}
		
		while (!ganhou) {
			if (jogada % 2 == 1) {//jogador um.
				System.out.println("Vez do jogador 1. Linhas e colunas vão de 1 à 3.");
				sinal = "[X]";
			}else {//jogador dois
				System.out.println("Vez do jogador 2. Linhas e colunas vão de 1 à 3.");
				sinal = "[0]";
			}
			//// continuação da lógica
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.print("Entre com a lina(1 , 2, 3) : ");;
				linha = input.nextInt();
				if (linha >= 1 && linha <=3) {
					linhaValida = true;
				}else {
					System.out.print("Entrada inválida, tente novamente : ");
				}
					
					
			}
			
			boolean ColunaValida = false;
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
			
			//********************* mostrar a jogada **************************
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j]);
				}
				System.out.println();
			}
			
			///*********************** lógica do jogo e saber se ganhou. **********
			
			if (jogoVelha[0][0] == "[X]" && jogoVelha[0][1] == "[X]" &&jogoVelha[0][2] == "[X]" || 
							jogoVelha[1][0] == "[X]" && jogoVelha[1][1] == "[X]" &&jogoVelha[1][2] == "[X]" ||
							jogoVelha[2][0] == "[X]" && jogoVelha[2][1] == "[X]" &&jogoVelha[2][2] == "[X]" ||
							jogoVelha[0][0] == "[X]" && jogoVelha[1][0] == "[X]" &&jogoVelha[2][0] == "[X]" || 
							jogoVelha[0][1] == "[X]" && jogoVelha[1][1] == "[X]" &&jogoVelha[2][1] == "[X]" ||
							jogoVelha[0][2] == "[X]" && jogoVelha[1][2] == "[X]" &&jogoVelha[2][2] == "[X]" ||
							jogoVelha[0][0] == "[X]" && jogoVelha[1][1] == "[X]" && jogoVelha[2][2] == "[X]" || 
							jogoVelha[0][2] == "[X]" && jogoVelha[1][1] == "[X]" && jogoVelha[2][0] == "[X]"
				){//jogadas das linha 0, 1, 2
						ganhou = true;
						System.out.println("O jogador 1 ganhou!");
						
			}else if (jogoVelha[0][0] == "[0]" && jogoVelha[0][1] == "[0]" &&jogoVelha[0][2] == "[0]" || 
						jogoVelha[1][0] == "[0]" && jogoVelha[1][1] == "[0]" &&jogoVelha[1][2] == "[0]" ||
						jogoVelha[2][0] == "[0]" && jogoVelha[2][1] == "[0]" &&jogoVelha[2][2] == "[0]" ||
						jogoVelha[0][0] == "[0]" && jogoVelha[1][0] == "[0]" &&jogoVelha[2][0] == "[0]" || 
						jogoVelha[0][1] == "[0]" && jogoVelha[1][1] == "[0]" &&jogoVelha[2][1] == "[0]" ||
						jogoVelha[0][2] == "[0]" && jogoVelha[1][2] == "[0]" &&jogoVelha[2][2] == "[0]" ||
						jogoVelha[0][0] == "[0]" && jogoVelha[1][1] == "[0]" && jogoVelha[2][2] == "[0]" || 
						jogoVelha[0][2] == "[0]" && jogoVelha[1][1] == "[0]" && jogoVelha[2][0] == "[0]"
				){//jogadas das linha 0, 1, 2
					ganhou = true;
					System.out.println("O jogador 2 ganhou!");
					
				}
			else if(jogada > 9){
				ganhou = true;
				System.out.println("Fim de jogo, ninguém ganhou!!!");
				
			}
			
			
		}
		System.out.println("Fim do programa!");
	}

}
