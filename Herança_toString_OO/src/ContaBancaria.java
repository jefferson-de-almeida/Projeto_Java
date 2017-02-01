/* 
 *  Autor : jefferson de almeida
 *  
 */
public  class ContaBancaria {
	
	protected String nomeCliente;
	protected int numeroConta;
	protected double saldo;
	
	
	public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// sacar -> o saldo não pode ficar negativo
	
	public boolean sacarDinheiro(double dinheiro){
		
		if (this.saldo >= dinheiro) {
			this.saldo -= dinheiro;
			return true;
		}
		return false;
	}
	
	// depositar também 
	
	public void depositarDinheiro(double dinheiro){
		this.saldo += dinheiro;
	}

	@Override
	public String toString() {
		return "Conta Bancaria Nome: " + nomeCliente + " número da conta : " + numeroConta + " Saldo : " + saldo ;
	}
	
	
	
	
}
