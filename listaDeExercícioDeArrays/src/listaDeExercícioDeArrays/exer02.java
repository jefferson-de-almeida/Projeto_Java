package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[8];
		int[] b = new int[8];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			b[i] = a[i]*2;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A : "+ a[i]+" e B : "+ b[i]);			
		}

	}

}
