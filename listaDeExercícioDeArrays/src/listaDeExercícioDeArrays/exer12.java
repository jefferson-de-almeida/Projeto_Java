package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 * 
 */
public class exer12 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int soma = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			soma += a[i];	
		}
		
		System.out.println("A soma dos números do vetor é : " + soma);


	}

}
