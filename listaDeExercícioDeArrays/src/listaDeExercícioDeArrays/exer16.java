package listaDeExerc�cioDeArrays;
/*
 *  autor : jefferson de almeida
 */

import java.util.Scanner;

public class exer16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int qtd15 = 0;
		int somaMenorQue15 = 0;
		int somaMaiorQue15 = 0;
		double med = 0;
		/*
		 * soma dos n�meros inferiores a quinze
		 * quantidade de n�meros iguais a quinze
		 * e a m�dia dos n�meros maiores que quize
		 */
		
		System.out.println("O programa a seguir dir� a m�dia de um vetor dos n�meros �mpares e a porcentagem.");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umn�mero para a "+(i+1)+"� : ");
			a[i] = input.nextInt();
			if (a[i] == 15) {
				qtd15 += 1;
			}else if (a[i] < 15) {
				somaMenorQue15 += a[i];
			}else if (a[i] > 15) {
				somaMaiorQue15 += a[i];
			}
		}
		med = somaMaiorQue15 / a.length;
		
		System.out.println("Quantidade de n�meros iguas a 15 : "+qtd15);
		System.out.println("A soma dos n�meros menor que 15 : "+somaMenorQue15);
		System.out.println("A m�dia de n�meros superiores a 15 : "+ med);
		System.out.println("Fim do programa!");
		

	}

}
