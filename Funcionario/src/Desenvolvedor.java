
public class Desenvolvedor extends Funcionario {
	
	public Desenvolvedor() {
		
	}		
	
	public Desenvolvedor(String nome, double valor, String cargo){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = valor;
	}
	
	public double getSalarioComBonus(){
		double salario;
		salario = this.salario * 0.25 + this.salario;
		return salario;
	}
}
