package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer25 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print((i+1)+"° elemento : ");
			vetorA[i] = input.nextInt();
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = 0;
			}else {
				vetorB[i] = 1;
			}
		}
		for (int i = 0, j = 9; i < vetorA.length; i++, j--) {
			System.out.println("Vetor A: "+vetorA[i]+" vetor B : "+vetorB[i]);
		}
		System.out.println("Fim do programa!");

	}

}
