package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer03 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int[] b = new int[15];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			b[i] = a[i]*a[i];
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A : "+ a[i]+" e B : "+ b[i]);			
		}
	

	}

}
