/*
 *  Autor : jefferson de almeida
 */
public class contaMain {

	public static void main(String[] args) {
		contaExer02 teste1 = new contaExer02(1234, 4321, "Jefferson De Alemida");
		teste1.setSaldo(6000);
		teste1.sacaDinheiro(2500);
		teste1.ImprimeSaldo();
		System.out.println(teste1.getSaldo());
	}

}
