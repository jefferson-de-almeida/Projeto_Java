package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor :jefferson de almeida
 */
public class exer10 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			b[i] = a[i] % 2;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A : "+a[i]+" B = a[i] % 2: "+b[i]);
		}

	}

}
