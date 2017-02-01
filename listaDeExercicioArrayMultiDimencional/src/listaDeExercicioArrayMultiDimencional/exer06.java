package listaDeExercicioArrayMultiDimencional;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] jogoDaVelha = new String[3][3];
		
		String jogadaPrincipal = "";
		String jogada1 = "[x]";
		String jogada2 = "[O]";
		byte qtdDeJogadas = 1; 
		
		byte linha;
		byte coluna;
		boolean validaJogada;
		boolean verificaValidaJogada;
		boolean confirmacaoDeQueGanhouOJogo = false;
		
		boolean ganhou = false;
		byte jogadorQueganhou;
		byte vencedor = -1;
		
		//******************************************** matriz do jogo da velha recebendo os primeiro caracteres antes de iniciar o jogo
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				jogoDaVelha[i][j] = "[ ]";
			}
		}
		//**************************************************************************************************************************
		// ********************************* implementação de jogadas; 
		//Início de jogo
		/*
		 * - precisa adicionar uma jogada na variável int qtdDeJogadas++ toda vez em que o jogo iniciar;
		 * - precisa verificar para sair.
		 */
		while (!ganhou) {
			
					if (qtdDeJogadas % 2 != 0) {
						/*
						 * - jogadas do jogador 1
						 */
							System.out.println(qtdDeJogadas+"° Jogada, jogador 1.");
							System.out.println("Digite a seguir a linha e a coluna. Opções válidas de 1 a 3.");
							//******************************************* parte da escolha da linha **********************
							do{
								verificaValidaJogada = false;
											do {
												validaJogada = false;
												System.out.print("Digite a linha : ");
												linha = input.nextByte();
												if (linha >=1 && linha <= 3) {
													validaJogada = true;
												}else {
													System.out.println("linha inválida, tente novamente!");
												}
												
											} while (!validaJogada);
											
											do {
												validaJogada = false;
												System.out.print("Digite a coluna : ");
												coluna = input.nextByte();
												if (coluna >=1 && coluna <= 3) {
													validaJogada = true;
												}else {
													System.out.println("linha inválida, tente novamente!");
												}
												
									} while (!validaJogada);
									//****************************************************************************************************************
									if (jogoDaVelha[linha-1][coluna-1] != "[ ]") {
										System.out.println("Jogada inválida, tente novamente!");
										verificaValidaJogada = false;
										
									}else {
										verificaValidaJogada = true;
										jogadaPrincipal = jogada1;
									}
									
							}while(!verificaValidaJogada);
						//*******************************************************************lógica do jogo****************************************************************************	
							if (jogoDaVelha[linha-1][coluna-1] != "[ ]") {
								System.out.println("Jogada inválida, tente novamente!");
								verificaValidaJogada = false;
								
							}else {
								verificaValidaJogada = true;
							}
							//**********************************************************************************************
							
							if ((jogoDaVelha[0][0] == jogada2 && jogoDaVelha[0][1] == jogada2  && jogoDaVelha[0][2] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[1][0] == jogada2 && jogoDaVelha[1][1] == jogada2  && jogoDaVelha[1][2] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[2][0] == jogada2 && jogoDaVelha[2][1] == jogada2  && jogoDaVelha[2][2] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[0][0] == jogada2 && jogoDaVelha[1][0] == jogada2  && jogoDaVelha[2][0] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[0][1] == jogada2 && jogoDaVelha[1][1] == jogada2  && jogoDaVelha[2][1] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[0][2] == jogada2 && jogoDaVelha[1][2] == jogada2  && jogoDaVelha[2][2] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[0][0] == jogada2 && jogoDaVelha[1][1] == jogada2  && jogoDaVelha[2][2] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							else if ((jogoDaVelha[0][2] == jogada2 && jogoDaVelha[1][1] == jogada2  && jogoDaVelha[2][0] == jogada2)) {
								verificaValidaJogada = true;
								confirmacaoDeQueGanhouOJogo = true;
								vencedor = 1;
							}
							
					//***************************************************************************************************************************************************
					//**********************************************A parte que mostra as jogadas.
					for (int i = 0; i < jogoDaVelha.length; i++) {
						for (int j = 0; j < jogoDaVelha[i].length; j++) {
							System.out.print(jogoDaVelha[i][j]);
						}
						System.out.println();
					}
					
				}//************** else do jogador 2
		
			} // final do while principal.
		
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				System.out.print(jogoDaVelha[i][j]);
			}
			System.out.println();
		}
		
		if (vencedor == 0) {
			System.out.println("Quem ganhou o jogo foi o JOGADOR 1.");
			System.out.println("Quantidade de jogadas : "+qtdDeJogadas);
		}else if(vencedor == 1){
			System.out.println("Quem ganhou o jogo foi o JOGADOR 2.");
			System.out.println("Quantidade de jogadas : "+qtdDeJogadas);
		}
		System.out.println("Fim do programa!");
	}
	
}
