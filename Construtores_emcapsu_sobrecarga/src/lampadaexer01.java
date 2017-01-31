import java.text.DecimalFormat;

/*
 *  Autor : jefferson de almeida
 */
public class lampadaexer01 {

	private String lampadaTipo;
	private int potencia;
	private double preco;
	DecimalFormat watts;
	DecimalFormat valor;
	
	public lampadaexer01(String lampadaTipo, int potencia, double preco) {
		super();
		this.lampadaTipo = lampadaTipo;
		this.potencia = potencia;
		this.preco = preco;
	}

	public String getLampadaTipo() {
		return lampadaTipo;
	}

	public void setLampadaTipo(String lampadaTipo) {
		this.lampadaTipo = lampadaTipo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void Imprime(){
		watts = new DecimalFormat("#.# W");
		valor = new DecimalFormat("#.## R$");
		System.out.println("Tipo de Lâmpada : " + this.lampadaTipo);
		System.out.println("Potência da Lâmpada: " + watts.format(this.potencia));
		System.out.println("Preço do produto : "+ valor.format(this.preco));
	}
	
}
