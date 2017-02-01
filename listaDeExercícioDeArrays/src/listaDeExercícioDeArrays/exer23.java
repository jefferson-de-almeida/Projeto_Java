package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int j = 0;
		boolean condicao = true;
		System.out.println("O programa a seguir pedirá que digite 10 números, quando mostrar na tela, se não par, para a execução.");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o número "+(i+1)+" : ");
			vetorA[i] = input.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.println(vetorA[i]);
			}else {
				System.out.println("Não permitido!");
				break;
			}
		}
		while (condicao) {
			if (vetorA[j] % 2 == 0) {
				System.out.println(vetorA[j]);
			}else {
				System.out.println("Não permitido!");
				condicao = false;
			}
			j++;
		}
		System.out.println("Fim do programa!");
	}

}
