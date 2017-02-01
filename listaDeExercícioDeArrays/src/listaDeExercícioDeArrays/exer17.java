package listaDeExercícioDeArrays;
/*
 *  autor : jefferson de almeida
 */
import java.util.Scanner;

public class exer17 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int qtd = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Informe a idade da "+(i+1)+"° pessoa : ");
			a[i] = input.nextInt();
			if (a[i] > 35) {
				qtd += 1;
			}	
		}
		
		System.out.println("A quantidade de pessoas com idade superior a 35 anos é : " + qtd);

	}

}
