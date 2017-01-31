/*
 *  Autor : jefferson de almeida
 */
public class calcExer03 {
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
	
	public static int fatorial(int num){
		int total = 1;
		if (num == 0) {
			return 1;
		}else{
			
			for (int i = num; i >= 1 ; i--) {
				total *= i;
			}
		}
		return total;
	}
}
