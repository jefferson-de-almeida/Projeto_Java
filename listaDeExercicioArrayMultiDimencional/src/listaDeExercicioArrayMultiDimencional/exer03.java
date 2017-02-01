package listaDeExercicioArrayMultiDimencional;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] m = new int[3][3];
		 int contador = 1;
		 int qtdImpa = 0;
		 int qtdPar = 0;
		 
		 for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite o "+contador+" termo : ");
				m[i][j] = input.nextInt();
				if (m[i][j] % 2 == 0) {
					qtdPar++;
				}else {
					qtdImpa++;
				}
				contador++;
			}
		}
		 System.out.println("A quantidade de números ìmpares na Matriz(3*3) é : " +qtdImpa);
		 System.out.println("A quantidade de números pares na Matriz(3*3) é : " +qtdPar);
		 System.out.println("Fim do programa!");
		

	}

}
