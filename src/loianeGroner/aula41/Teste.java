package loianeGroner.aula41;

import loianeGroner.aula41.Aluno;
import loianeGroner.aula41.Pessoa;
import loianeGroner.aula41.Professor;

// Orienta��o a Objetos: Heran�a: classes abstratas

public class Teste {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}