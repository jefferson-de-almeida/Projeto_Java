package listaDeExerc�cioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 */
public class exer15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int soma = 0;
		int qtdimpar = 0;
		double med = 0.0;
		
		System.out.println("O programa a seguir dir� a m�dia de um vetor dos n�meros �mpares.");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umn�mero para a "+(i+1)+"� : ");
			a[i] = input.nextInt();
			if (a[i] % 2 != 0) {
				soma += a[i];
				qtdimpar += 1;
			}	
		}
		med = soma / qtdimpar;
		
		System.out.println("A quantidade de n�meros �mpares : "+qtdimpar);
		System.out.println("A m�dia � : "+ med);
	}

}
