package listaDeExercícioDeArrays;
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
		 * soma dos números inferiores a quinze
		 * quantidade de números iguais a quinze
		 * e a média dos números maiores que quize
		 */
		
		System.out.println("O programa a seguir dirá a média de um vetor dos números ímpares e a porcentagem.");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umnúmero para a "+(i+1)+"° : ");
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
		
		System.out.println("Quantidade de números iguas a 15 : "+qtd15);
		System.out.println("A soma dos números menor que 15 : "+somaMenorQue15);
		System.out.println("A média de números superiores a 15 : "+ med);
		System.out.println("Fim do programa!");
		

	}

}
