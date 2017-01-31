import java.util.Scanner;

public class Conta {
	String senhaDaConta;//ok
	private double saldoDaConta;
	private double limiteDeSaldo;
	String numeroDaConta;//ok
	String agenciaDaConta;//ok
	String dataDoUltimoSaque;
	String dataDoUltimoDeposito;
	Pessoa contaDapessoa = new Pessoa();//ok 
	
	boolean bloqueioDeConta = true;
	
	//bloqueioDeConta = true; quando ele receber false, est� conta est� bloqueada
	
	Scanner lendoVar = new Scanner(System.in);
	public Conta(){
		
	}
	
	//************************************iniciando a conta ****************
	public void saldoInicia(){
		this.saldoDaConta = 0.00f;
		this.limiteDeSaldo = 100.00f;
		this.dataDoUltimoDeposito = "01/08/2016";//* Nesta linha, poderia ser adicionado o dia e a hora do sistema vigente.
		this.dataDoUltimoSaque = "01/08/2016";// por quest�es did�ticas eu decidi colocar essas datas.
	}
	//**********************************************************************
	public void depositaNaConta(double valorASerDepositado){
		this.saldoDaConta += valorASerDepositado;
		this.dataDoUltimoDeposito = "28/11/2016";
	}
	//**********************************************************************
	//**********************************************************************
	public void sacaDaConta(double valorASerSacado){
		int aux;
		if(valorASerSacado <= this.saldoDaConta){
			this.saldoDaConta -= valorASerSacado;
			this.dataDoUltimoDeposito = "28/11/2016";//dia em que os sistema est� registrando.
		}else{
			System.out.println("Deseja sacar tudo o dinheiro que tem na conta junto com Saldo limite dispon�vel?");
			System.out.println("Digite 1 para sim  e 2 para n�o.");
			aux = lendoVar.nextInt();
			if(aux == 1){
				this.saldoDaConta -= this.limiteDeSaldo;
				this.limiteDeSaldo = 0;
				this.dataDoUltimoDeposito = "28/11/2016";//dia em que os sistema est� registrando.
			}
		}
	}
	//**********************************************************************
	public void cadastroDaConta(){
		
		System.out.print("Escreva seus dados: ");
		//contaDapessoa.cadastroPessoa();
		
		System.out.print("Digite o n�mero da Conta: ");
			this.numeroDaConta = lendoVar.next();
			
		System.out.print("Digite a Ag�ncia da Conta: ");
			this.agenciaDaConta = lendoVar.next();
		
		System.out.print("Digite sua senha: ");
			this.senhaDaConta = lendoVar.next();
		saldoInicia();
		
		
	}
	//*****************************************************************************
	public void ImprimirConta(){
		System.out.println("************************ Conta do Banco ***********************************");
		System.out.println("Nome: " + contaDapessoa.nome +"."+" N�mero da Conta: " + numeroDaConta +"."+ " Ag�ncia: " + agenciaDaConta +".");
		System.out.println("RG: "+ contaDapessoa.rg +"."+ " CPF: "+ contaDapessoa.cpf +".");
		System.out.println("Saldo Limite: "+ limiteDeSaldo+"R$." + " Saldo da Conta: " + saldoDaConta+"R$.");
		System.out.println("Saldo Dispon�vel: "+ saldoDaConta+"R$.");
	}
	public void entrarNaConta(){
		String Senha;
		System.out.print("Entre com a senha: ");
			for(int i = 0; i < 3; i++){
				Senha = lendoVar.nextLine();
				if(Senha != this.senhaDaConta){
					
					System.out.println("Senha Incorreta! Tente Novamente.");
					
				}
				else if(Senha != this.senhaDaConta && i == 2){
					
					/*
					 * Aqui a conta ter� que ser bloqueada junto com verifica��o da conta.
					 * que aqui deve receber false e bloquear a conta.*/
					
				}else{
					/*
					 * Aqui ele consegue entrar na conta e fazer o que quiser.
					 * sacar, depositar ou imprimir o saldo dispon�vel.
					 * Por�m aqui precisa chamar outra fun��o ==> uma fin��o menu de op��es sobre o que fazer.
					 * */
				}
			
		}
		
		
	}
	//**********************************************************************************
	// menu de op��es para escolha.
	void menuEscolhaDaConta(){
		int opc;
		System.out.println("Escolha uma das op��es abaixo.");
		System.out.println("Digite 1 para Saque.");// ainda n�o foi feito
		System.out.println("Digite 2 para Transfer�ncia.");// ainda n�o foi feito
		System.out.println("Digite 3 para Dep�sito.");//ainda n�o foi feito
		do{
			opc = lendoVar.nextInt();
			if(opc <= 0 || opc > 3){
				System.out.println("Op��o Inv�lida!!! Por favor tente apenas umas das tr�s op��es.");
			}
		}while(opc < 0 );
		 
	}
	
	
	/*
	 * preciso fazer uma fun��o para sacar o dinheiro, por�m preciso verificar a senha.
	 * preciso fazer um transfere dinheiro para outra conta, mesma coisa com a senha.
	 * depositar dinheiro na conta.
	 * verifica��o de bloqueio.
	 *  */
}
