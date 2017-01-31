
 abstract class Funcionario {
	
	protected String nome;
	protected String cargo;
	protected double salario;// isso estede para as classes filhas
	
	
	/*
	 * Se eu coloocar o método abstract aqui nesta classe, todas as classes filhas que chegam a herdar desta classe e podem ter seus métodos próprios
	 * e os que herdam da classe pai.
	 * porem se eu colocar abstract na classe pai para seus métodos,com isso eu obrigo minhas classes filhas, a  terem este método..*/
	//*************************************************************** método construtor
	
	public Funcionario(){
		//construtor normal padrão
		
	}
	public Funcionario(String nome, double valor){
		this.nome = nome;
		this.salario = valor;
	}
	//************************************************************************ fim do método construtor.
	//********************************************************************construindo os getters e setters
	public void setSalarioModificador(double valor){
		this.salario = valor;
	}
	public abstract double getSalarioComBonus();/*{ // com isso eu obrigo minhas classes filhas, a  terem este método.
		double salario;
		salario = this.salario * 0.2 + this.salario;
		return salario;
	}*/
	public double getSalarioBonus(){
		double salario;
		salario = this.salario * 0.2;
		return salario;
	}
	//*********************************************************************************************************
	public void imprimir(){
		System.out.println("Nome: "+this.nome+" Cargo: "+this.cargo);
		System.out.println("Salário líquido: " +this.salario+"R$.");
		System.out.println("Bônus: " +getSalarioBonus()+"R$.");
		System.out.println("Salário com Bônus: "+getSalarioComBonus()+"R$.");
	}
	
	/*public boolean autentica(String senha2) {
		// TODO Auto-generated method stub
		return false;
	}*/
}
