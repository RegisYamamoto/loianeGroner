package loianeGroner.aula82;

public class JuntandoSeparandoString {

	public static void main(String[] args) {
		
		String alfabeto = String.join(", ", "A", "B", "C", "D"); // Separa todos por ", "
		System.out.println(alfabeto);
		
		String[] letras = alfabeto.split(", "); // Divide a string por ", "
		for (String letra : letras) {
			System.out.println(letra);
		}
		
		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
		
	}

}
