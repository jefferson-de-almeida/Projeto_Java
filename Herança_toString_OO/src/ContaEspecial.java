/*
 * Autor : jefferson de almeida
 */
public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	public ContaEspecial(String nomeCliente, int numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
		
	}

	@Override
	public String toString() {
		return "Conta Especial Nome: " + nomeCliente + " número da conta : " + numeroConta + " Saldo : " + saldo + " Saldo Limite : "+ limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	//reescrevendo o método sacar dinheiro
	
	public boolean sacarDinheiro(double dinheiro){
		
		double saldolimite = getSaldo() + this.limite;
		
		if (saldolimite >= 0) {
			this.setSaldo(this.getSaldo() - dinheiro);
			return true;
		}
		return false;
	}
	
	
}
