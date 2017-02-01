
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
		return "Conta Poupança Nome: " + nomeCliente + " número da conta : " + numeroConta + " Saldo : " + saldo ;
	}
	
}
