package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 * */
public class exer09 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print("B - Digite umnúmero para a "+(i+1)+"° : ");
			b[i] = input.nextInt();
			c[i] = a[i] / b[i];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A : "+a[i]+" B : "+b[i]+" C[i] =  a[i] / b[i] : "+ c[i]);
		}
	

		
	

	}

}
