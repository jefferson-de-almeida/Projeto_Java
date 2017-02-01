package listaDeExercícioDeArrays;
/* 
 * autor : jefferson de almeida
 */
import java.util.Scanner;

public class exer18 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int maiorIdade = Integer.MIN_VALUE;
		int posMaior = 0;
		int menorIdade = Integer.MAX_VALUE;
		int posMenor = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Informe a idade da "+(i+1)+"° pessoa : ");
			a[i] = input.nextInt();
			if (a[i] > maiorIdade) {
				maiorIdade = a[i];
				posMaior = (i + 1);
			}
			if (a[i] < menorIdade) {
				menorIdade = a[i];
				posMenor = (i + 1);
			}
		}
		
		System.out.println("A maior idade : " +maiorIdade+" Pocição : "+ posMaior);
		System.out.println("A maior idade : " +menorIdade+" Pocição : "+ posMenor);

	}

	

}
