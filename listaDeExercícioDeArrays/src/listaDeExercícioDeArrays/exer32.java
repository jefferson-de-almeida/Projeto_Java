package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("O programa a seguir dirá a tabuada de cada número do vetor.");
		int[] vetA = new int[5];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.print((i+1)+"° Elemento : ");
			vetA[i] = input.nextInt();
		}
		for (int i = 0; i < vetA.length; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println((i+1)+"° Tabuada de "+vetA[i]+" "+vetA[i]+"*"+j+" = "+(j*vetA[i]));
			}
		}

	}

}
