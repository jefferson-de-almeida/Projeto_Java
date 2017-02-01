package listaDeExercicioArrayMultiDimencional;

import java.util.Scanner;

/*
 *  autor : jefferson de almeida.
 */
public class exer05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][][] agenda = new String[12][31][8]; //31 dias 24 de horas.
		boolean sair = true;
		byte opcao;
		
		boolean diaValido = true;
		int dia = 0;
		boolean horaValido = true;
		int hora = 0;
		boolean mesValido = true;
		int mes = 0;
		
		
		
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
					mesValido = true; // add
					
					System.out.print("Entre com a informa��o do m�s: ");
					while (mesValido) {
						mes = input.nextInt();
						if (mes < 1 || mes > 12) {
							diaValido = true;
							System.out.print("M�s inv�lido, tente novamente : ");
						}else {
							mesValido = false;
						}
					}
					//****************************************************
					System.out.print("Entre com a informa��o do dia: ");
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
						if (hora < 1 || dia > 8) {
							horaValido = true;
							System.out.print("Hora inv�lido, tente novamente : ");
						}else {
							horaValido = false;
						}
					}
					
					//******************************* parte em que a String agenda ler a informa��o.
					System.out.print("Digite o compromisso : ");
					agenda[12-1][dia-1][hora-1] = input.next();
					
				break;
				case 2:
					diaValido = true;
					horaValido = true;
					mesValido = true;
					//************************************************
					System.out.print("Entre com a informa��o do m�s: ");
					while (mesValido) {
						mes = input.nextInt();
						if (mes < 1 || mes > 12) {
							mesValido = true;
							System.out.print("M�s inv�lido, tente novamente : ");
						}else {
							mesValido = false;
						}
					}
					//************************************************************
					// fazer a op��o de verificar na agenda
					System.out.print("Entre com a informa��o do dia : ");
					while (diaValido) {
						dia = input.nextInt();
						if (dia <= 0 || dia > 31) {
							diaValido = true;
							System.out.print("Dia inv�lido, tente novamente : ");
						}else {
							diaValido = false;
						}
					}
					//********************************************
					System.out.print("Entre com a informa��o da hora : ");
					while (horaValido) {
						hora = input.nextInt();
						if (hora < 1 || dia > 8) {
							horaValido = true;
							System.out.print("Hora inv�lido, tente novamente : ");
						}else {
							horaValido = false;
						}
					}
					System.out.println("Est� agendado este compromisso : ");
					System.out.println(agenda[dia-1][dia-1][hora-1]);
					
				break;
	
				default:
					System.out.println("Op��o inv�lida, tente novamente");
					sair = true;
				break;
			}
			
		}
		System.out.println("Fim do programa!");

	}

}
