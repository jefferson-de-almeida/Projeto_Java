
 abstract class Funcionario {
	
	protected String nome;
	protected String cargo;
	protected double salario;// isso estede para as classes filhas
	
	
	/*
	 * Se eu coloocar o m�todo abstract aqui nesta classe, todas as classes filhas que chegam a herdar desta classe e podem ter seus m�todos pr�prios
	 * e os que herdam da classe pai.
	 * porem se eu colocar abstract na classe pai para seus m�todos,com isso eu obrigo minhas classes filhas, a  terem este m�todo..*/
	//*************************************************************** m�todo construtor
	
	public Funcionario(){
		//construtor normal padr�o
		
	}
	public Funcionario(String nome, double valor){
		this.nome = nome;
		this.salario = valor;
	}
	//************************************************************************ fim do m�todo construtor.
	//********************************************************************construindo os getters e setters
	public void setSalarioModificador(double valor){
		this.salario = valor;
	}
	public abstract double getSalarioComBonus();/*{ // com isso eu obrigo minhas classes filhas, a  terem este m�todo.
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
		System.out.println("Sal�rio l�quido: " +this.salario+"R$.");
		System.out.println("B�nus: " +getSalarioBonus()+"R$.");
		System.out.println("Sal�rio com B�nus: "+getSalarioComBonus()+"R$.");
	}
	
	/*public boolean autentica(String senha2) {
		// TODO Auto-generated method stub
		return false;
	}*/
}
