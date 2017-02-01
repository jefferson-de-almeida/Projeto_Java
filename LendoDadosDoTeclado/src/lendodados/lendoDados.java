package lendodados;

import java.util.Scanner;

public class lendoDados {

	public static void main(String[] args) {
		String nomeCompleto;
		String nomeApelido;
		int a;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("Digite seu nome:");
		nomeCompleto = scan.nextLine();		
		System.out.println("O seu nome é:"+ nomeCompleto);
		System.out.print("Digite seu Apelido:");
		nomeApelido = scan.next();
		System.out.println("O seu apelido é:"+ nomeApelido);
		
		System.out.println("digite um valor:");
		a = scan.nextInt();
		a = Fatorial(a);
		System.out.println("O valor de a:"+a);
	}
	static int Fatorial(int b){
		int fat =1;
		while( b != 1){
			fat = fat*b;
			b--;
		}
		b = fat;
		return b;
	}
}
