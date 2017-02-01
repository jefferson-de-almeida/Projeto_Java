
public class TesteMian {

	public static void main(String[] args) {
		ContaBancaria myconta = new ContaBancaria("Jefferson de almeida", 123456789, 200.00);
		System.out.println(myconta.toString());
		myconta.depositarDinheiro(50.00);
		System.out.println(myconta.sacarDinheiro(300.00));
		System.out.println(myconta.toString());
		System.out.println();
		ContaPoupanca myconta2 = new ContaPoupanca("Luke Cage", 987654321, 300.00);
		System.out.println(myconta2.toString());
		myconta2.depositarDinheiro(50.00);
		System.out.println(myconta2.sacarDinheiro(300.00));
		System.out.println(myconta2.toString());
		System.out.println();
		ContaEspecial myconta3 = new ContaEspecial("George whisley", 987654321, 800.00);
		System.out.println(myconta3.toString());
		myconta3.depositarDinheiro(150.00);
		System.out.println(myconta3.sacarDinheiro(300.00));
		System.out.println(myconta3.toString());
	}

}
