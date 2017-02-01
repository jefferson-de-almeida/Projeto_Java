package listaDeExercícioDeArrays;
/*
 *  autor : jefferson de almeida
 *  
 */
import java.text.DecimalFormat;


public class exer22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int qtd0 = 0;
		int qtd1 = 0;
		double per1 = 0.0;
		double per0 = 0.0;
		DecimalFormat porCento = new DecimalFormat("##,##%");
		System.out.println("O programa a seguir irá dizer a cotação do dólar em um vetor de 1 a 20.");
		
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
			if (vetorA[i] == 0) {
				qtd0++;
			}else {
				qtd1++;
			}
		}
		per0 = (qtd0*100)/vetorA.length;
		per1 = (qtd1*100)/vetorA.length;
		
		System.out.println("Porcetagem de núemros 0 : "+ porCento.format(per0));
		System.out.println("Porcetagem de núemros 1 : "+ porCento.format(per1));
		System.out.println("Fim do programa!");

	}

}
