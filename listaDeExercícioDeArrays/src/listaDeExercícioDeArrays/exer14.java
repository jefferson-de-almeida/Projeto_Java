package listaDeExerc�cioDeArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  autor : jefferson de almeida
 */
public class exer14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int qtdimpar = 0;
		int soma = 0;
		double percentual = 0;
		double med = 0;
		DecimalFormat porCento = new DecimalFormat("##,##%");
		
		System.out.println("O programa a seguir dir� a m�dia de um vetor dos n�meros �mpares e a porcentagem.");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("A - Digite umn�mero para a "+(i+1)+"� : ");
			a[i] = input.nextInt();
			if (a[i] % 2 != 0) {
				soma += a[i];
				qtdimpar += 1;
			}	
		}
		med = soma / qtdimpar;
		percentual = (qtdimpar*100)/a.length;
		
		System.out.println("A quantidade de n�meros �mpares : "+qtdimpar);
		System.out.println("A m�dia � : "+ med);
		System.out.println("Porcentagem de n�meros �mpares : "+porCento.format(percentual));
		
	}

}
