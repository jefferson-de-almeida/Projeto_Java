import java.util.Scanner;
public class Gerente extends Funcionario implements Autenticavel{
	
	private String senha;
	Scanner lendo = new Scanner(System.in);
	/*
	 * Como a classe gerente � uma esten��o da classe funcion�rio, eu posso atribuir os mesmos valores porque ela � uma classe filha.
	 * por�m como algumas de suas fun��es podem ser diferente da classe original. como aqui � o caso.
	 * ois seus b�nus � maior de que um funcion�rio comum.
	 * Para sso eu preciso colocar extends Funcinario que � o nome da classe e na classe funcion�rio eu coloco protected ao inves de privado
	 * 
	 * outro ponto importante, colocando ele como funcionarioautenticav�l, que � uma classe filha de funcion�ria, ela tamb�m herda seus m�todos e atributos.
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
		System.out.println("Sal�rio l�quido: " +this.salario+"R$.");
		System.out.println("B�nus: " +getSalarioBonus()+"R$.");
		System.out.println("Sal�rio com B�nus: "+getSalarioComBonus()+"R$.");
	}*/
	public void getCadastroGerente(){
		System.out.println("Lembrando que este programa tem fins did�ticos.");
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
