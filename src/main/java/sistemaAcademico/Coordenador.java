package sistemaAcademico;

public class Coordenador extends Pessoa {
	private Secretaria secretaria;

	public boolean cadastraAluno(boolean comecoDeSemestre) {
		
		if(comecoDeSemestre) {
			for (int i = 0; i < secretaria.getListaDeAlunosParaMatricula().size(); i++) {
				if(secretaria.getListaDeAlunosParaMatricula().get(i).getNota()>=7) {
					
				}
				
			}
		}
	return comecoDeSemestre;
	}
}
