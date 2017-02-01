package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 * 
 */
public class exer13 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int soma = 0;
		int quantidade = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			if (a[i] % 5 == 0) {
				soma += a[i];
				quantidade += 1;
			}	
		}
		
		System.out.println("A soma dos números do vetor que são mult de 5 é : " + soma);
		System.out.println("Quantidade de mult 5 é : "+quantidade);
	}

}
