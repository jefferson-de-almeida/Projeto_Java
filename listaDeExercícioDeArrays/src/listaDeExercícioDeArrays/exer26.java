package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		System.out.println("O programa a seguir dirá c = 1 quando A for maior que B, 0 se A = B e -1 quand B for maior que A.");
		System.out.println("Vetor A.");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print((i+1)+"° Elemento de A : ");
			vetorA[i] = input.nextInt();
		}
		System.out.println("Vetor B.");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print((i+1)+"° Elemento de B : ");
			vetorB[i] = input.nextInt();
		}
		System.out.println("vetor C.");
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else if(vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}
			System.out.println("vetor A : "+vetorA[i]+" Vetor B : "+vetorB[i]+" vetor C : "+vetorC[i]);
			
		}
	}

}
