package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		int quantidadeImpa = 0;
		int quantidadePar = 0;
		int contadorAux = 0;
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.print((i+1)+"° Elemento : ");
			vetA[i] = input.nextInt();
			if (vetA[i] % 2 == 0) {
				quantidadePar++;
			}else {
				quantidadeImpa++;
			}
		}
		System.out.println("Preenchimento Par!");
		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] % 2 == 0) {
				quantidadePar++;
				vetB[contadorAux] = vetA[i];
				contadorAux++;
			}
		}
		System.out.println("Preenchimento Ímpar!");
		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] % 2 != 0) {
				quantidadePar++;
				vetB[contadorAux] = vetA[i];
				contadorAux++;
			}
		}
		for (int i = 0; i < vetB.length; i++) {
			System.out.println("Vetor A : "+vetA[i]+" vetor B : "+vetB[i]);
		}
		System.out.println("Quantidade de números ímpares de A : "+quantidadeImpa);
		System.out.println("Quantidade de números pares de A"+quantidadePar);
		System.out.println("Fim do programa!");
	}

}
