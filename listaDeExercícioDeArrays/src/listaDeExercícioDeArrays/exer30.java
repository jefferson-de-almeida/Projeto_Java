package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetA = new int[20];
		int quantidadeImpa = 0;
		int quantidadePar = 0;
		for (int i = 0; i < vetA.length; i++) {
			System.out.print((i+1)+"° Elemento : ");
			vetA[i] = input.nextInt();
			if (vetA[i] % 2 == 0) {
				quantidadePar++;
			}else {
				quantidadeImpa++;
			}
		}
		//**************************************** continuação
		int[] vetBImpar = new int[quantidadeImpa];
		int[] vetCPar = new int[quantidadePar];
		
		for (int i = 0, j = 0, w = 0; i < vetA.length; i++) {
			if (vetA[i] % 2 == 0) {
				vetCPar[w] = vetA[i];
				w++;
			}else {
				vetBImpar[j] = vetA[i];
				j++;
			}
		}
		System.out.println("Vetor B.");
		for (int i = 0; i < vetBImpar.length; i++) {
			System.out.println(vetBImpar[i]);
		}
		System.out.println("vetor C");
		for (int i = 0; i < vetCPar.length; i++) {
			System.out.println(vetCPar[i]);
		}
		
		System.out.println("Quantidade de números ímpares de A : "+quantidadeImpa);
		System.out.println("Quantidade de números pares de A"+quantidadePar);
		System.out.println("Fim do programa!");
	}

}
