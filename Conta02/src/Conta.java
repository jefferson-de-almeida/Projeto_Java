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
	
	//bloqueioDeConta = true; quando ele receber false, está conta está bloqueada
	
	Scanner lendoVar = new Scanner(System.in);
	public Conta(){
		
	}
	
	//************************************iniciando a conta ****************
	public void saldoInicia(){
		this.saldoDaConta = 0.00f;
		this.limiteDeSaldo = 100.00f;
		this.dataDoUltimoDeposito = "01/08/2016";//* Nesta linha, poderia ser adicionado o dia e a hora do sistema vigente.
		this.dataDoUltimoSaque = "01/08/2016";// por questões didáticas eu decidi colocar essas datas.
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
			this.dataDoUltimoDeposito = "28/11/2016";//dia em que os sistema está registrando.
		}else{
			System.out.println("Deseja sacar tudo o dinheiro que tem na conta junto com Saldo limite disponível?");
			System.out.println("Digite 1 para sim  e 2 para não.");
			aux = lendoVar.nextInt();
			if(aux == 1){
				this.saldoDaConta -= this.limiteDeSaldo;
				this.limiteDeSaldo = 0;
				this.dataDoUltimoDeposito = "28/11/2016";//dia em que os sistema está registrando.
			}
		}
	}
	//**********************************************************************
	public void cadastroDaConta(){
		
		System.out.print("Escreva seus dados: ");
		//contaDapessoa.cadastroPessoa();
		
		System.out.print("Digite o número da Conta: ");
			this.numeroDaConta = lendoVar.next();
			
		System.out.print("Digite a Agência da Conta: ");
			this.agenciaDaConta = lendoVar.next();
		
		System.out.print("Digite sua senha: ");
			this.senhaDaConta = lendoVar.next();
		saldoInicia();
		
		
	}
	//*****************************************************************************
	public void ImprimirConta(){
		System.out.println("************************ Conta do Banco ***********************************");
		System.out.println("Nome: " + contaDapessoa.nome +"."+" Número da Conta: " + numeroDaConta +"."+ " Agência: " + agenciaDaConta +".");
		System.out.println("RG: "+ contaDapessoa.rg +"."+ " CPF: "+ contaDapessoa.cpf +".");
		System.out.println("Saldo Limite: "+ limiteDeSaldo+"R$." + " Saldo da Conta: " + saldoDaConta+"R$.");
		System.out.println("Saldo Disponível: "+ saldoDaConta+"R$.");
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
					 * Aqui a conta terá que ser bloqueada junto com verificação da conta.
					 * que aqui deve receber false e bloquear a conta.*/
					
				}else{
					/*
					 * Aqui ele consegue entrar na conta e fazer o que quiser.
					 * sacar, depositar ou imprimir o saldo disponível.
					 * Porém aqui precisa chamar outra função ==> uma finção menu de opções sobre o que fazer.
					 * */
				}
			
		}
		
		
	}
	//**********************************************************************************
	// menu de opções para escolha.
	void menuEscolhaDaConta(){
		int opc;
		System.out.println("Escolha uma das opções abaixo.");
		System.out.println("Digite 1 para Saque.");// ainda não foi feito
		System.out.println("Digite 2 para Transferência.");// ainda não foi feito
		System.out.println("Digite 3 para Depósito.");//ainda não foi feito
		do{
			opc = lendoVar.nextInt();
			if(opc <= 0 || opc > 3){
				System.out.println("Opção Inválida!!! Por favor tente apenas umas das três opções.");
			}
		}while(opc < 0 );
		 
	}
	
	
	/*
	 * preciso fazer uma função para sacar o dinheiro, porém preciso verificar a senha.
	 * preciso fazer um transfere dinheiro para outra conta, mesma coisa com a senha.
	 * depositar dinheiro na conta.
	 * verificação de bloqueio.
	 *  */
}
