/*
 *  autor : jefferson de almeida
 */
package aula25_27_lista_de_exercicios;

public class exer01lampada_main {

	public static void main(String[] args) {
		exer01lampada lampada = new exer01lampada();
		lampada.lampada = "Incandecente";
		lampada.valor = 2.80;
		lampada.quantidade = 13;
		lampada.testeLigaDesliga(lampada.ligarDesligar);
		System.out.println("Tipo de Lâmpada : "+ lampada.lampada);
		System.out.println("Valor : "+ lampada.valor + " R$.");
		System.out.println("QUantidade : "+ lampada.quantidade);
		System.out.println(""+ lampada.ligarDesligar);
		lampada.ligarLampada(lampada.ligarDesligar);
		System.out.println("Tipo de Lâmpada : "+ lampada.lampada);
		System.out.println("Valor : "+ lampada.valor + " R$.");
		System.out.println("QUantidade : "+ lampada.quantidade);
		System.out.println(""+ lampada.ligarDesligar);
	}

}
