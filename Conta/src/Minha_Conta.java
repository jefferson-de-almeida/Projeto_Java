
public class Minha_Conta {

	public static void main(String[] args) {
		My_Conta minhaConta, x;
		
		minhaConta = new My_Conta();
		//minhaConta.titular.nome = "Jefferson";
		//minhaConta.Saldo = 0.0f;
		//minhaConta = minhaConta.funcDaEmpresa.recebeDados("Leandro", "Markting", "Bloco F", 17, 4, 9, 1300);
		x = new My_Conta();
		x.titular.nome = "Leando";
		x.Saldo = 300.00f;
		
		Funcionario w = new Funcionario();
		/*w.nome = "Alisson";
		w.Data_de_entrada.dia = 13;
		w.Data_de_entrada.mes = 12;
		w.Data_de_entrada.ano = 2015;
		w.departamento = "Markting";
		w.local_de_trabalho  = "Bloco J";
		w.salario = 1200.00;*/
		w = w.recebeDados("Jefferson", "Eletrônica","Concertos",13,11,15,300);
		
		//minhaConta.Saca(minhaConta.Saldo);
		minhaConta.Deposita(300);
		minhaConta.Saca(50);
		minhaConta.Deposita(500);
		
		
		
		//System.out.println("Nome da conta: "+ minhaConta.titular.nome + " " + minhaConta.Saldo + "R$.");
		//System.out.println("Nome da conta: "+ x.titular.nome + " " + x.Saldo + "R$.");
		/*if(x == minhaConta){
			System.out.println("São iguais");
		}else{
			System.out.println("Não são iguais");
		}*/
		minhaConta.funcDaEmpresa.ImprimeEstado();
		minhaConta.transferePara( x , 200);
		
		//System.out.println("Nome da conta: "+ minhaConta.titular.nome + " " + minhaConta.Saldo + "R$.");
		//System.out.println("Nome da conta: "+ x.titular.nome + " " + x.Saldo + "R$.");
		w.ImprimeEstado();
		minhaConta.funcDaEmpresa.ImprimeEstado();
	}
/*
 * Como as duas contas apontam para o mesmo endereço de memória, se eu
 * alterar uma, a outra também será aletera.
 * Agora se as duas tivessem sido criadas cada uma com um "new" diferente.
 * Para poder comparar com o comando if eu teria que fazer atributo por atributo.
 * 
 */
}
