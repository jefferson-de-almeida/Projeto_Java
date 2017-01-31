/*
 *  Autor : jefferson de almeida
 */
public class calcExer02 {
	
	public static int soma(int num1, int num2){
		return num1 + num2;
	}
	public static int subtrair(int num1, int num2){
		return num1 - num2;
	}
	public static int multiplicacao(int num1, int num2){
		return num1 * num2;
	}
	public static int divisao(int num1, int num2){
		return num1 / num2;
	}
	public static int potecia(int num1, int num2){
		int total = 1;
				for (int i = 1; i <= num2; i++) {
					total *= num1;
				}
		return total;
	}
}
