
public class Carros {
	String cor;
	String modelo;
	double VelocidadeAtual;
	double VelocidadeMaxima;
	
	//*************************** liga o carro ****************************
	void LigaCarro(){
		System.out.println("O Carro está ligado.");
	}
	//******************************** acelera o carro ************************
	void aceleraCarro(double quantidade){
		double VelocidadeNova = this.VelocidadeAtual + quantidade;
		this.VelocidadeAtual = VelocidadeNova;
	}
	//****************************** marcha ***********************************
	int Marcha(){
		if(this.VelocidadeAtual < 0){
			return -1;
		}else if(this.VelocidadeAtual >= 0 && this.VelocidadeAtual <= 40){
			return 1;
		}else if(this.VelocidadeAtual > 40 && this.VelocidadeAtual <= 80){
			return 2;
		}
		return 3;
	}
	
}
