/* 
 * Autor : jefferson de almeida.
 */
public class FibonacciExer05 {
	
	public static int fibonacci(int num){
		if (num < 2) {
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
