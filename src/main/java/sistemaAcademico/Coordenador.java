package sistemaAcademico;

import java.util.Observable;
import java.util.Observer;

import Sistema.Sistema;

public class Coordenador extends Pessoa implements Observer {
	private Secretaria secretaria;
	private Sistema sistema;

	public void update(Observable o, Object arg) {
		if (secretaria.getListaDeAlunosParaMatricula().size() > 0) {
			for (int i = 0; i < secretaria.getListaDeAlunosParaMatricula().size(); i++) {
				sistema.cadastraAluno(secretaria.getListaDeAlunosParaMatricula().get(i));

			}
		}
	}
}
