/* 
 *  Autor : jefferson de almeida
 */

public class somatorioMainExer06 {

	public static void main(String[] args) {
		System.out.println("Somat�rio dos 10 primeiros n�meros");
		for (int i = 0; i <= 10; i++) {
			System.out.print(" "+Somatorio.Somatoria(i));
		}
		System.out.println();
		
		System.out.println(Somatorio.Somatoria(100));
		System.out.println("Fim do programa!");
	}

}
