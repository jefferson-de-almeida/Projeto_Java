package listaDeExercícioDeArrays;
/*
 *  autor : jefferson de almeida
 */

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			b[i] = a[i]*i;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A : "+ a[i]+" e B : "+ b[i]);			
		}


	}

}
