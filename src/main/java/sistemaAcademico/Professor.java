package sistemaAcademico;

import java.util.ArrayList;

public class Professor extends Pessoa{

	private ArrayList<Curso> curssosQueEnsina = new ArrayList<Curso>();

	public ArrayList<Curso> getCurssosQueEnsina() {
		return curssosQueEnsina;
	}

	public void setCurssosQueEnsina(ArrayList<Curso> curssosQueEnsina) {
		this.curssosQueEnsina = curssosQueEnsina;
	} 
}
