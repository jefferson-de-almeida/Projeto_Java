import java.text.DecimalFormat;

public class exer01 {
	DecimalFormat emDin = new DecimalFormat("###,###.### R$");
	String lampada;
	double valor;
	int quantidade;
	public void  exer01(String lampada, double valor, int quantidade) {
		this.lampada = lampada;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public exer01() {
		
	}
	void Imprime(){
		System.out.println("L�mpada : " + lampada);
		System.out.println("Pre�o : " + emDin.format(valor*quantidade) );
		System.out.println("Quantidade de produto : " + quantidade);
	}
	
}
