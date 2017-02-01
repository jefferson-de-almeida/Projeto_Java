package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer04 {

	public static void main(String[] args) {
		int[] a = new int[15];
		double[] b = new double[15];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite umnúmero para a "+(i+1)+"° : ");
			a[i] = input.nextInt();
			b[i] = Math.sqrt(a[i]);
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("A : "+ a[i]+" e B : "+ b[i]);			
		}

	}

}
