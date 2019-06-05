package sistemaAcademico;

public class Aluno extends Pessoa{

	private String matricula;
	private Turma turma;
	private Curso curso;
	private int nota;
	private boolean matriculado;
	
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void pediTrancamentoDeCurso() {
		
	}

	public void peditrocaDeCurso(Curso curso) {
		
	}
}
