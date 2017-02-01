/*
 *  autor : jefferson de almeida
 */
package aula25_27_lista_de_exercicios;

public class Conta {
	String nome;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	void realizaSaque(double quantia){
		if (saldo >= quantia) {
			saldo -= quantia;
			
		}
	}
}
