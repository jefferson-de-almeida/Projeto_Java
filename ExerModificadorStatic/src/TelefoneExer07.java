/*
 *  Autor : jefferson de almeida
 */

public class TelefoneExer07 {
	TelefoneExer07[][] tell;
	
	public TelefoneExer07() {
	
	}

	public TelefoneExer07[][] getTell() {
		return tell;
	}

	public void setTell(TelefoneExer07[][] tell) {
		this.tell = tell;
	}
	public void mostraNumeros(){
		for (int i = 0; i < tell.length; i++) {
			for (int j = 0; j < tell[i].length; j++) {
				System.out.print("N° "+j+1+" "+tell[i][j]);
			}
			System.out.println();
		}
	}
}
