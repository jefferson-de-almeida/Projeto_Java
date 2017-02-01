package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 *  
 */
public class exer24 {
	public static void main (String args[]){
		int[] vetorA = new int[10];
		//int[] vetorB = new int[10];
		boolean palindromo = true;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0, j = 9; i < vetorA.length; i++, j--) {
			System.out.print((i+1)+"° elemento : ");
			vetorA[i] = input.nextInt();
		}
		for (int i = 0; i < (vetorA.length)/2; i++) {
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
				palindromo = false;
				break;
			}
		}
		if (palindromo) {
			System.out.println("O vetor é Palíndromo.");
		}else {
			System.out.println("O vetor não é Palíndromo.");
		}
		
		System.out.println("Fim do programa!");
		
	}
}
