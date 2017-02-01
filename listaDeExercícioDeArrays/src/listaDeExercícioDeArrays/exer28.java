package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 */
public class exer28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		System.out.println("O programa a seguir, de acordo com o que for digitado em A, o vetor b será a ordem inversa.");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print((i+1)+"° Elemento de A : ");
			vetorA[i] = input.nextInt();
			
		}
		for (int i = 0, j = (vetorA.length -1); i < vetorA.length; i++, j--) {
			vetorB[j] = vetorA[i];
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("vetor A : "+vetorA[i]+" Vetor B : "+vetorB[i]);
		}
	}

}
