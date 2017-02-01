package listaDeExercícioDeArrays;

import java.util.Scanner;

/*
 * autor : jefferson de almeida
 */
public class exer19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] med = new double[10];
		String situacao = "";
		
		System.out.println("O programa irá dizer as notas dos alunos e se srão aprovados");
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Aluno "+(i+1)+"°.");
			System.out.print((i+1)+"° nota 1 : ");
			nota1[i] = input.nextDouble();
			System.out.print((i+1)+"° nota 2 : ");
			nota2[i] = input.nextDouble();
		}
		System.out.println("\n");
		for (int i = 0; i < nota2.length; i++) {
			med[i] = (nota1[i] + nota2[i])/2;
			if (med[i] >= 7) {
				situacao = "Nota 1 : "+nota1[i]+"\n"+"Nota 2 : "+nota2[i]+"\nMéida : "+med[i]+" Situação : Aprovado!";
				System.out.println(situacao);
			}else {
				situacao = "Nota 1 : "+nota1[i]+"\n"+"Nota 2 : "+nota2+"\nMéida : "+med[i]+" Situação : Reprovado!";
				System.out.println(situacao);
			}
		}
		
 	}

}
