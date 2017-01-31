
 class Diretor extends Funcionario implements Autenticavel {
	
	 	public Diretor(String nome, double valor, String cargo) {
			this.nome = nome;
			this.cargo = cargo;
			this.salario = valor;
		}
		
		public double getSalarioComBonus(){
			double salario;
			salario = this.salario * 0.3 + this.salario;
			return salario;
		}

		public boolean autentica(String senha2) {
			// TODO Auto-generated method stub
			return false;
		}
}
