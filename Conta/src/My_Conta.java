
public class My_Conta {
	
	int Num_Conta;
	double Saldo;
	double limite;
	Cliente titular = new Cliente();
	Funcionario funcDaEmpresa = new Funcionario();
	
	//**************************************************************
	 void Saca(double PedidoDin){
		if(PedidoDin > Saldo){
			System.out.println("Você não pode pedir mais dinheiro do que você tem!");
		}else if(Saldo <= 10.00F){
			System.out.println("Saldo insufuciente para a retirada!");
		}else{
			double newSaldo = this.Saldo - PedidoDin;
			this.Saldo = newSaldo;
		}
	 
	 }
	 //******************************************************************
	 void Deposita(double Depositando){
		 this.Saldo = Saldo + Depositando;
	 }
	 //*******************************************************************
	public void transfere(My_Conta origem, My_Conta destino, double valor){
		 if(origem.Saldo < valor){
			 System.out.println("Não pode transferir!"); 
		 }else{
			 origem.Saldo = this.Saldo - valor;
			 destino.Saldo = this.Saldo + valor;
		 }
	 }
	public void transferePara(My_Conta destino, double valor){
		 
			 this.Saldo = this.Saldo - valor;
			 destino.Saldo = this.Saldo + valor;
		 
	 }
}
