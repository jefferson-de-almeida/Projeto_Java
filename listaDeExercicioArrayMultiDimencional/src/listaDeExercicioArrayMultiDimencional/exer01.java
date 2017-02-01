package listaDeExercicioArrayMultiDimencional;

import java.util.Random;

/*
 * autor : jefferson de almeida 
 * */
public class exer01 {

	public static void main(String[] args) {
		Random geradorNumAleatorio = new Random();
		int[][] MatrizMult = new int [4][4];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int colMaior = 0;
		int colMenor=0;
		int linhaMaior = 0;
		int linhaMenor = 0;
		
		System.out.println("O prgrama a seguir dirá o número maior e o menor em uma matriz que recebe dados aleatoriamente.");
		
		// para gerar um número aleatório foi necessrio cria uma variável 
		// número aleatório de 0 à 9
		for (int i = 0; i < MatrizMult.length; i++) {
			for (int j = 0; j < MatrizMult[i].length; j++) {
				MatrizMult[i][j] = geradorNumAleatorio.nextInt(10);
				if (maior < MatrizMult[i][j]) {
					maior = MatrizMult[i][j];
					colMaior = j;
					linhaMaior = i;
				}
				if (menor > MatrizMult[i][j]) {
					menor = MatrizMult[i][j];
					linhaMenor = i;
					colMenor = j;
				}
			}
		}
		
		//******************************************** parte que mostra a matriz
		for (int i = 0; i < MatrizMult.length; i++) {
			for (int j = 0; j < MatrizMult[i].length; j++) {
				System.out.print(" "+ MatrizMult[i][j]);	
			}
			System.out.println("\n");
		}
		System.out.println("O maior número foi "+ maior + " lin : "+(linhaMaior+1)+" Col : "+(colMaior+1));
		System.out.println("O menor número foi "+ menor + " lin : "+(linhaMenor+1)+" Col : "+(colMenor+1));
	}
	

}
