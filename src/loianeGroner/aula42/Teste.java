package loianeGroner.aula42;

// Orientação a Objetos: Palavra chave final

public class Teste {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "blablabla";
		System.out.println(Constantes.URL_BLOG);
		
		final int total = 1;
		//total = total + 1;
		System.out.println(total);
		
		
		
	}

}