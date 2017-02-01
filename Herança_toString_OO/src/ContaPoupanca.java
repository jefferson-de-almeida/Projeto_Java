
public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public ContaPoupanca(String nomeCliente, int numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
		
	}
	
	public String toString() {
		return "Conta Poupan�a Nome: " + nomeCliente + " n�mero da conta : " + numeroConta + " Saldo : " + saldo ;
	}
	
}
