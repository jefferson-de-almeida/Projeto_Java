package listaDeExercicioArrayMultiDimencional;
/*
 *  autor : jefferson de almeida
 */
import java.util.Random;
import java.util.Scanner;

public class exer03_new {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		int TamLine;
		int TamCol;
		int OpcaoDeLinha;
		int OpcaoDeCol;
		
		int linhaMaior = Integer.MIN_VALUE;
		int linhaMenor = Integer.MAX_VALUE;
		int ColMaior = Integer.MIN_VALUE;
		int ColMenor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		boolean flagValida = true;
		
		//  ********************************* parte que informa quantas linhas tem a matriz
		
		System.out.print("Informe o quantas linhas a Matriz tem : ");
		do{
			flagValida = true;
			TamLine = input.nextInt();
			if (TamLine < 0) {
				flagValida = false;
				System.out.print("Op��o inv�lida, tente novamente : ");
			}
		}while (flagValida == false);
		 // *************************** parte que informa a quantidade de colunas.
		System.out.print("Informe o quantas colunas a Matriz tem : ");
		flagValida = true;
		do{
			flagValida = true;
			TamCol = input.nextInt();
			if (TamCol < 0) {
				flagValida = false;
				System.out.print("Op��o inv�lida, tente novamente : ");
			}
		}while (flagValida == false);
		
		//*************************************** parte que cria  amatriz    
		int[][] matriz = new int[TamLine][TamCol];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(10);
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		//***************************** agora para digita qual voc� quer saber o maior n�mero da linha e o menor
		
		System.out.print("Informe qual linha voc� quer saber quem � o maior e menor n�mero : ");
		do {
			flagValida = true;
			OpcaoDeLinha =  input.nextInt();
			if (OpcaoDeLinha < 1 || OpcaoDeLinha > TamLine) {
				flagValida = false;
				System.out.print("Op��o inv�lida, tente novamente : ");
			}
		} while (flagValida == false);
		// ****************************** parte que procura a maior e o menor n�mero na linha pr� definida pelo usu�rio
		for (int i = 0; i < matriz[OpcaoDeLinha-1].length; i++) {
			if (matriz[OpcaoDeLinha-1][i] > linhaMaior) {
				linhaMaior = matriz[OpcaoDeLinha-1][i];
			}
			if (matriz[OpcaoDeLinha-1][i] < linhaMenor) {
				linhaMenor = matriz[OpcaoDeLinha-1][i];
			}
		}
		//******************************agora para digita qual voc� quer saber o maior n�mero da coluna e o menor
		System.out.print("Informe qual coluna voc� quer saber quem � o maior e menor n�mero : ");
		do {
			flagValida = true;
			OpcaoDeCol =  input.nextInt();
			if (OpcaoDeCol < 1 || OpcaoDeCol > TamCol) {
				flagValida = false;
				System.out.print("Op��o inv�lida, tente novamente : ");
			}
		} while (flagValida == false);
		//********************************* parte que procura a maior e o menor n�mero na coluna pr� definida pelo usu�rio 
		for (int i = 0; i < matriz[i][OpcaoDeCol-1]; i++) {
			if (matriz[i][OpcaoDeCol-1] > ColMaior) {
				ColMaior = matriz[i][OpcaoDeCol-1];
			}
			if (matriz[i][OpcaoDeCol-1] < ColMenor) {
				ColMenor = matriz[i][OpcaoDeCol-1];
			}
		}
		
		//******************************* parte que mostra a matriz 
		
		for (int i = 0; i < matriz.length; i++) {
			//System.out.print((i+1)+"� ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" "+ matriz[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("O maior n�mero foi : "+maior);
		System.out.println("O menor n�mero foi : "+menor);
		System.out.println("O maior n�mero da linha "+ linhaMaior);
		System.out.println("O maior n�mero da linha "+ linhaMenor);
		System.out.println("O maior n�mero da coluna "+ ColMaior);
		System.out.println("O maior n�mero da coluna "+ ColMenor);
		System.out.println("Fim do programa!");
		
	}

}
