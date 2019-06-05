package sistemaAcademico;

import java.util.ArrayList;

public class Secretaria extends Pessoa {

	private ArrayList<Aluno> listaDeAlunosParaMatricula = new ArrayList<Aluno>();
	private ArrayList<Professor> listaDeProfessoresParaContratar = new ArrayList<Professor>();

	public void cadastraAlunoEmEspera(Aluno aluno, Curso curso) {
		aluno.setCurso(curso);
		listaDeAlunosParaMatricula.add(aluno);

	}

	public void cadastraPrfessorEmEspera(Professor professor) {
		listaDeProfessoresParaContratar.add(professor);
	}

	public ArrayList<Aluno> getListaDeAlunosParaMatricula() {
		return listaDeAlunosParaMatricula;
	}

	public void setListaDeAlunosParaMatricula(ArrayList<Aluno> listaDeAlunosParaMatricula) {
		this.listaDeAlunosParaMatricula = listaDeAlunosParaMatricula;
	}

	public ArrayList<Professor> getListaDeProfessoresParaContratar() {
		return listaDeProfessoresParaContratar;
	}

	public void setListaDeProfessoresParaContratar(ArrayList<Professor> listaDeProfessoresParaContratar) {
		this.listaDeProfessoresParaContratar = listaDeProfessoresParaContratar;
	}

}