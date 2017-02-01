package listaDeExercícioDeArrays;

import java.util.Iterator;

/*
 * autor : jefferson de almeida
 */
public class exer01 {

	public static void main(String[] args) {
		int[] A = new int[3];
		int[] B = new int[3];
		boolean confirma = true;
		A[0] = 3;
		A[1] = 5;
		A[2] = 7;
		
		B[0] = 3;
		B[1] = 5;
		B[2] = 8;
		
		for (int i = 0; i < B.length; i++) {
			if (A[i] != B[i]) {
				confirma = false;
				break;
			}
		}
		if (confirma) {
			System.out.println("O Array é igual! "+ confirma);
		}else {
			System.out.println("O Array não é igual "+ confirma);
		}
		
	}

}
