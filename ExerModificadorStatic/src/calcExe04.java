/*
 *  Autor : jefferson de almeida
 */
public class calcExe04 {
	
	public static int fatorialNormal(int num){
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
	public static int fatorialRecursivo(int num){
		
		if (num == 0) {
			return 1;
		}
		return num * fatorialRecursivo(num -1);
	}
}
