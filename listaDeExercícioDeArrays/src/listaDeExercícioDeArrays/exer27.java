package listaDeExercícioDeArrays;

import java.util.Scanner;

import javax.lang.model.element.Element;

/*
 *  autor : jefferson de almeida
 */
public class exer27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		/*
		 * b = 'a' quando a < 7
		 * b = 'b' quando a == 7
		 * b = 'c' quando a > 7 e a < 10
		 * b = 'd' quando a == 10
		 * b = 'e' quandp a > 10
		 */
		System.out.println("o programa a seguir pedirá para preencher os dados em um vetor A, de acordo com os valores de A, B receberá A, B, C, D OU E.");
		System.out.println("b = 'a' quando a < 7");
		System.out.println("b = 'b' quando a == 7");
		System.out.println("b = 'c' quando a > 7 e a < 10");
		System.out.println("b = 'd' quando a == 10");
		System.out.println("b = 'e' quandp a > 10");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print((i+1)+"° Elemento de A : ");
			vetorA[i] = input.nextInt();
			if (vetorA[i] < 7) {
				
				vetorB[i] = 'a';
				
			}else if (vetorA[i] == 7) {
				
				vetorB[i] = 'b';
				
			}else if (vetorA[i] > 7 && vetorA[i] < 10) {
				
				vetorB[i] = 'c';
				
			}else if (vetorA[i] == 10) {
				
				vetorB[i] = 'd';
				
			}else {
				
				vetorB[i] = 'e';
			}
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("vetor A : "+vetorA[i]+" Vetor B :"+vetorB[i]);
		}
	}

}
