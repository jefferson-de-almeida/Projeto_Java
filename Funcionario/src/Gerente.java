import java.util.Scanner;
public class Gerente extends Funcionario implements Autenticavel{
	
	private String senha;
	Scanner lendo = new Scanner(System.in);
	/*
	 * Como a classe gerente é uma estenção da classe funcionário, eu posso atribuir os mesmos valores porque ela é uma classe filha.
	 * porém como algumas de suas funções podem ser diferente da classe original. como aqui é o caso.
	 * ois seus bônus é maior de que um funcionário comum.
	 * Para sso eu preciso colocar extends Funcinario que é o nome da classe e na classe funcionário eu coloco protected ao inves de privado
	 * 
	 * outro ponto importante, colocando ele como funcionarioautenticavél, que é uma classe filha de funcionária, ela também herda seus métodos e atributos.
	 * */
	public Gerente(){
		
	}
	public Gerente(String nome, double valor, String cargo){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = valor;
	}
	//*************************************************************************************************************************
	/*public void imprimir(){
		System.out.println("Nome: "+this.nome+" Cargo: "+this.cargo);
		System.out.println("Salário líquido: " +this.salario+"R$.");
		System.out.println("Bônus: " +getSalarioBonus()+"R$.");
		System.out.println("Salário com Bônus: "+getSalarioComBonus()+"R$.");
	}*/
	public void getCadastroGerente(){
		System.out.println("Lembrando que este programa tem fins didáticos.");
		System.out.println("Digite o nome: ");
		this.nome = lendo.nextLine();
		System.out.println("Digite o cargo: ");
		this.cargo = lendo.next();
		System.out.println("Digiete osaldo inicial: ");
		this.salario = lendo.nextDouble();
	}
	public double getSalarioComBonus(){
		double salario;
		salario = this.salario * 0.3 + this.salario;
		return salario;
	}
	
	public boolean autentica(String senha2) {
		
		return false;
	}
}
