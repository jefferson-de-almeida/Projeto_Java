package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 */
public class exer29 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[20];
		
		System.out.println("O programa a seguir irá conter A e B, dois vetores em C");
		
		System.out.println("Vetor A.");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print((i+1)+"° Elemento de A : ");
			vetorA[i] = input.nextInt();
		}
		System.out.println("Vetor B.");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print((i+1)+"° Elemento de B : ");
			vetorB[i] = input.nextInt();
		}
		for (int i = 0, j = 0; i < vetorC.length; i++) {
			if (i <= 9) {
				vetorC[i] = vetorA[i];
			}else {
				vetorC[i] = vetorB[j];
				j++;
			}
		}
		System.out.println("Vetor C.");
		for (int i = 0, j = 0; i < vetorC.length; i++) {
			if (i <= 9) {
				System.out.println("vetor C : "+vetorC[i]+" vetor A : "+vetorA[i]);
			}else {
				System.out.println("vetor C : "+vetorC[i]+" vetor B : "+vetorB[j]);
				j++;
			}
		}
	}
}
