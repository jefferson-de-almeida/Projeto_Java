package listaDeExerc�cioDeArrays;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * autor : jefferson de almeida
 */
public class exer2021 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] dolar = new double[20];
		double cotacao;
		DecimalFormat cotacaoDolar = new DecimalFormat("U$ ###.####");
		System.out.println("O programa a seguir ir� dizer a cota��o do d�lar em um vetor de 1 a 20.");
		System.out.print("Informe o valor da cota��o : ");
		cotacao = input.nextDouble();
		for (int i = 0; i < dolar.length; i++) {
			dolar[i] = cotacao * (i+1);
			System.out.println(cotacaoDolar.format(dolar[i]));
		}
		System.out.println("Fim do programa!");
	}

}
