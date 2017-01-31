/*
 *  Autor : jefferson de almeida
 */
public class Somatorio {
	public static int Somatoria(int num){
		if (num == 0) {
			return 0;
		}
		return num + Somatoria(num-1);
	}
}
