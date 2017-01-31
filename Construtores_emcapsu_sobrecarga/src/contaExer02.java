import java.text.DecimalFormat;

/*
 *  Autor : Jefferson de almeida
 */
public class contaExer02 {
	
	private int  numCota;
	private int numAgencia;
	private double saldo;
	
	private String nome;
	DecimalFormat Din;

	public contaExer02(int numCota, int numAgencia, String nome) {
		super();
		this.numCota = numCota;
		this.numAgencia = numAgencia;
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double sacaDinheiro(double valor){
		
		if (valor > this.saldo) {
			System.out.println("Valor não permidito! você não possue essa quantia.");
		}else {
			this.saldo -= valor;
		}
		
		return this.saldo;
	}
	public void ImprimeSaldo(){
		Din = new DecimalFormat("#.## R$");
		System.out.println("Nome : "+this.nome);
		System.out.println("Número da Agência : "+this.numAgencia);
		System.out.println("Número da Conta : "+this.numCota);
		System.out.println("Saldo Atual : "+Din.format(this.saldo));
	}
	
}
