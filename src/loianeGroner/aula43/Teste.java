package loianeGroner.aula43;

// Orientação a Objetos: Class Object

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "sdafawf";
		String s2 = "sdafawf";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas2 = {9, 8, 6, 7};
		aluno.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno));
		
	}

}