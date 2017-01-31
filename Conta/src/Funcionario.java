
public class Funcionario {
	String nome;
	String departamento;
	String local_de_trabalho;
	String RG;
	Data Data_de_entrada = new Data();
	double salario;
	boolean estaNaImpresa;
	
	Funcionario recebeDados(String nome, String dep, String localDeTrab, int dia, int mes, int ano, double sal){
		Funcionario aux = new Funcionario();
		aux.nome = nome;
		aux.departamento = dep;
		aux.local_de_trabalho = localDeTrab;
		aux.Data_de_entrada.dia = dia;
		aux.Data_de_entrada.mes = mes;
		aux.Data_de_entrada.ano = ano;
		aux.salario = sal;
		return aux;
	}
	
	//*****************************************************************************************
	// verificação se o funcionário está na impresa ou não.
	boolean Ponto_Verifica_impresa(){
		if(this.estaNaImpresa = true){
			System.out.println("O funcionário está Presente.");
		}else{
			System.out.println("O funcionário está Ausente");
		}
		return this.estaNaImpresa = true;
	}
	
	boolean Entrada_impresa(){
		this.estaNaImpresa = true;
		return this.estaNaImpresa;
	}
	
	boolean Saida_impresa(){
		this.estaNaImpresa = false;
		return this.estaNaImpresa;
	}
	//****************************************************************
	void salarioAnual(){
		System.out.println(12*this.salario);
	}
	double AumentoDeSalario(double aumento){
		this.salario = this.salario + aumento;
		return this.salario;
	}
	//*****************************************************************
	void ImprimeEstado(){
		System.out.println("Nome do Funcionário: "+this.nome);
		System.out.println("Departamento: "+ this.departamento+" Local de Trabalho: "+ this.local_de_trabalho);
		System.out.print("data de entrada na Empresa: ");
		Data_de_entrada.MostraData();
		System.out.print("Salário Anual: ");
		salarioAnual();
		
	}
	
}
