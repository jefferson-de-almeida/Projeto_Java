
public class My_Carro {

	public static void main(String[] args) {
		
		Carros carro;
		carro = new Carros();
		carro.cor = "Black";
		carro.modelo = "Combe";
		carro.VelocidadeAtual = 0;
		carro.VelocidadeMaxima = 80;
		
		carro.LigaCarro();       
		carro.aceleraCarro(20);
		System.out.println(carro.VelocidadeAtual+"km/h");
	}

}
