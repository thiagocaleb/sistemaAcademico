package sistemaAcademico;

import java.util.ArrayList;
import java.util.Observable;

public class AlunosEmEspera extends Observable{

	private ArrayList<Aluno> listaDeAlunosParaMatricula = new ArrayList<Aluno>();

	public ArrayList<Aluno> getListaDeAlunosParaMatricula() {
		return listaDeAlunosParaMatricula;
	}

	public void setListaDeAlunosParaMatricula(ArrayList<Aluno> listaDeAlunosParaMatricula) {
		this.listaDeAlunosParaMatricula = listaDeAlunosParaMatricula;
		setChanged();
        notifyObservers();
	}
}
