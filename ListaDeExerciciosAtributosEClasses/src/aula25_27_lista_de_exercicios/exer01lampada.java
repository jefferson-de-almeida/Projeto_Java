/*
 *  autor : jefferson de almeida
 */
package aula25_27_lista_de_exercicios;

import java.util.Scanner;

public class exer01lampada {
	Scanner input = new Scanner(System.in);
	String lampada;
	double valor;
	int quantidade;
	boolean ligarDesligar = false;
	public void testeLigaDesliga (boolean teste) {
		if (teste == true) {
			System.out.println("A Luz está ligada!");
		}else {
			System.out.println("A luz está apagada!");
		}

	}
	boolean ligarLampada(boolean lampada) {
		byte ligarDesligar = 0;
		boolean flagValida = false;
		System.out.print("Digite 1 para ligar e 0 para desligar : ");
		while(!flagValida){
			ligarDesligar = input.nextByte();
			if (ligarDesligar < 0 && ligarDesligar > 1) {
				flagValida = false;
				System.out.print("Informação inválida! Tente novamente: ");
			}else {
				flagValida = true;
			}
		}
		
		if (ligarDesligar == 1) {
			lampada = true;
		}else if (ligarDesligar == 0) {
			lampada = false;
		}
			
		return lampada;
	}
	
}
