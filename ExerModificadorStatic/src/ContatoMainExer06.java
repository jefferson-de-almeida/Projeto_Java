/*
 *  Autor : jefferson de almeida
 */
public class ContatoMainExer06 {

	public static void main(String[] args) {
		ContatoExer06 contato = new ContatoExer06();
		contato.setNome("Luke Cage");
		//contato.setTelefone("(99) 99999-9999");
		
		//contato.setEndereco("Rua Osmar Lima");
		
		EnderecoExer06 end = new EnderecoExer06();
		end.setNomeRua("Rua Osmar Lima");
		end.setNumero("1601");
		end.setCidade("Fortaleza");
		end.setEstado("CE");
		end.setCep("60731-040");
		
		//Amostra teste.
		
		
		//System.out.println(contato.getTelefone());
		// Se rodar dessa forma eu obterei a referência do objeto 
		
		System.out.println(contato.getNome());
		//Se isso de baixo não tiver, pode ser perigoso, tomar cuidado com o código
		contato.setEndereco(end);
		
		System.out.println(contato.getEndereco().getCidade());
		
		System.out.println(end.getNomeRua());
		System.out.println(end.getNumero());
		System.out.println(end.getComplemento());
		System.out.println(end.getCidade());
		System.out.println(end.getEstado());
		System.out.println(end.getCep());
		//********************
		
		TelefoneExer06 telefone = new TelefoneExer06();
		
		telefone.setTipo("SmartPhone");
		telefone.setDdd("85");
		telefone.setNumero("3498-1010");
		
		contato.setTelefone(telefone);
		/*
		System.out.println(telefone.getTipo());
		System.out.println(""+telefone.getDdd()+" "+telefone.getNumero() );
		*/
		if (contato != null && contato.getTelefone() != null) {
			System.out.println(telefone.getTipo());
			System.out.println(""+telefone.getDdd()+" "+telefone.getNumero());
		}
		
		System.out.println("Fim do programa!");
	}

}
