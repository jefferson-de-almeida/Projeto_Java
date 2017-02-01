package jogoDaVelha;

public class jogoDaVelhaMain {
	public static void main (String args[]){
		jogoDaVelhalogica game = new jogoDaVelhalogica();
		game.InicializaJogo();
		game.MostraJogada();
		game.recebeJogada();
		game.MostraJogada();
		game.recebeJogada();
		System.out.println("Fim do Jogo!");
	}
}
