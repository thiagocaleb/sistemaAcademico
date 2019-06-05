package sistemaAcademico;

import java.util.ArrayList;

public abstract class Curso {

	private String nome;
	private String numero;
	private ArrayList<Professor> professoresQueEnsina = new ArrayList<Professor>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public ArrayList<Professor> getProfessoresQueEnsina() {
		return professoresQueEnsina;
	}
	public void setProfessoresQueEnsina(ArrayList<Professor> professoresQueEnsina) {
		this.professoresQueEnsina = professoresQueEnsina;
	}
}
