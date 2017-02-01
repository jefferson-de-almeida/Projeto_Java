package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer11 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int quantidadePar = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			if (a[i] % 2 == 0) {
				quantidadePar += 1;
			}	
		}
		
		System.out.println("A quantidade de números pares no vetor é : " + quantidadePar);

	}

}
