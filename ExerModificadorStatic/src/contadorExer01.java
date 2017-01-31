/*
 *  Autor : jefferson de almeida
 */
public class contadorExer01 {
	
	private static int contador;
	
	public contadorExer01() {
		contador++;
	}
	public static void Imcrementa(){
		contador++;
	}
	public static void Decrementa(){
		contador--;
	}
	public static void Zerador(){
		contador = 0;
	}
	public static void Imprime(){
		System.out.println("Valor do contador : " + contador);
	}
}
