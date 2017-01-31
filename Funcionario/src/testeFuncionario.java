
public abstract class testeFuncionario {

	public static void main(String[] args) {
		//Funcionario jefferson = new Funcionario("Jefferson De Almeida", 1000.0);
		//jefferson.setSalarioModificador(1200);
		//jefferson.imprimir();
		
		Gerente jonas = new Gerente("Jonas Greco", 2000, "Gerente");
		//Gerente jonas = new Gerente(); // para isso ser possível eu preciso construir um método construtor na classe gerente
		//jonas.setSalarioModificador(2600);
		jonas.getCadastroGerente();
		jonas.imprimir();
		
		Desenvolvedor dr = new Desenvolvedor("Cleilson Perreira", 1500,"Desenvolvedor");
		dr.imprimir();
		Diretor eder = new Diretor("Eder Freitas", 2600.0,"Diretor");
		eder.imprimir();
		Dba Fracisco = new Dba("Francisco raimundo", 2400.0,"DBA");
		Fracisco.imprimir();
		
	}

}
