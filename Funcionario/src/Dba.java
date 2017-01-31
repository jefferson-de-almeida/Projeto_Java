
 class Dba extends Funcionario {
	 
	 public Dba(){
		 
	 }
	 public Dba(String nome, double valor,String cargo) {
			this.nome = nome;
			this.cargo = cargo;
			this.salario = valor;
	 }
	 public double getSalarioComBonus(){
			double salario;
			salario = this.salario * 0.27 + this.salario;
			return salario;
	}
}
