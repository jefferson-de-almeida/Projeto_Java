package listaDeExercicioArrayMultiDimencional;

import java.util.Random;

/*
 * autor : jefferson de almeida
 */
public class exer02 {

	public static void main(String[] args) {
		Random ale = new Random();
		int[][] mat = new int[10][10];
		int maiorDaLin5 = Integer.MIN_VALUE;
		int menorDaLin5 = Integer.MAX_VALUE;
		
		int maiorDacol7 = Integer.MIN_VALUE;
		int menorDacol7 = Integer.MAX_VALUE;
		
		System.out.println("O programa a seguir dirá qual é o maior número e o menor aleoatoriamente.");
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				mat[i][j] = ale.nextInt(10);
				
				if ( i  == 5 && mat[i][j] > maiorDaLin5) {
					maiorDaLin5 = mat[i][j];
				}
				if ( i == 5 && mat[i][j] < menorDaLin5) {
					menorDaLin5 = mat[i][j];
				}
				//*******************************************
				if ( j  == 7 && mat[i][j] > maiorDacol7) {
					maiorDacol7 = mat[i][j];
				}
				if ( j == 7 && mat[i][j] < menorDacol7) {
					menorDacol7 = mat[i][j];
				}
				
			}
			
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(" "+ mat[i][j]);	
			}
			System.out.println("\n");
		}
		System.out.println("O maior número da Linha 5 : "+ maiorDaLin5 );
		System.out.println("O menorr número da Linha 5 : "+ menorDaLin5 );
		System.out.println("O maior número da Linha 7 : "+ maiorDacol7 );
		System.out.println("O menorr número da Linha 7 : "+ menorDacol7);
		System.out.println("Fim do program!");
	}

}
