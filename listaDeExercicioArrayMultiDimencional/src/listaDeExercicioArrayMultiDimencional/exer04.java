package listaDeExercicioArrayMultiDimencional;
/*
 *  autor : jefferson de almeida
 */
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class exer04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] agenda = new String[31][24]; //31 dias 24 de horas.
		boolean sair = true;
		byte opcao;
		
		boolean diaValido = true;
		int dia = 0;
		boolean horaValido = true;
		int hora = 0;
		
		
		
		while (sair) {
			System.out.println("Digite 1 para adcionar na Agenda.");
			System.out.println("Digite 2 para verificar na Agenda.");
			System.out.println("Digite 0 para para sair.");
			opcao = input.nextByte();
			
			switch (opcao) {
				case 0: 
					sair = false;
				break;
				case 1:
					// adcionar dia e a hora.
					diaValido = true;
					horaValido = true;
					System.out.print("Entre com a informa��o do dia do m�s: ");
					while (diaValido) {
						dia = input.nextInt();
						if (dia <= 0 || dia > 31) {
							diaValido = true;
							System.out.print("Dia inv�lido, tente novamente : ");
						}else {
							diaValido = false;
						}
					}
					//******************************
					System.out.print("Entre com a informa��o da hora : ");
					while (horaValido) {
						hora = input.nextInt();
						if (hora < 0 || dia > 24) {
							horaValido = true;
							System.out.print("Hora inv�lido, tente novamente : ");
						}else {
							horaValido = false;
						}
					}
					
					//******************************* parte em que a String agenda ler a informa��o.
					System.out.print("Digite o compromisso : ");
					agenda[dia-1][hora] = input.next();
					
				break;
				case 2:
					diaValido = true;
					horaValido = true;
					// fazer a op��o de verificar na agenda
					System.out.print("Entre com a informa��o do dia do m�s: ");
					while (diaValido) {
						dia = input.nextInt();
						if (dia <= 0 || dia > 31) {
							diaValido = true;
							System.out.print("Dia inv�lido, tente novamente : ");
						}else {
							diaValido = false;
						}
					}
					//******************************
					System.out.print("Entre com a informa��o da hora : ");
					while (horaValido) {
						hora = input.nextInt();
						if (hora < 0 || dia > 24) {
							horaValido = true;
							System.out.print("Hora inv�lido, tente novamente : ");
						}else {
							horaValido = false;
						}
					}
					System.out.println("Est� agendado este compromisso : ");
					System.out.println(agenda[dia-1][hora]);
					
				break;
	
				default:
					System.out.print("Op��o inv�lida, tente novamente: ");
					sair = true;
				break;
			}
			
		}
		System.out.println("Fim do programa!");

	}

}
