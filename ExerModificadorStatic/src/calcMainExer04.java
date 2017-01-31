/* 
 *  Autor : jefferson de almeida
 */
public class calcMainExer04 {
	
	public static void Imprimir(int num){
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		System.out.print("Fatorial normal : ");
		Imprimir(calcExe04.fatorialNormal(6));
		System.out.print("Fatorial Recursivo : ");
		Imprimir(calcExe04.fatorialRecursivo(6));
	}

}
