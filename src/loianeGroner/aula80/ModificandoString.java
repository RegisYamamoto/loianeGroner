package loianeGroner.aula80;

public class ModificandoString {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10)); // imprime a partir do 10º caractere
		System.out.println(teste.substring(10, 15)); // imprime do 10º caractere até o 15º caractere
		
		String palavraErrada = "ispaço";
		String palavraCorrigida = palavraErrada.replace('i', 'e');
		System.out.println(palavraCorrigida);
		
		String espacos = "e s p a ç o";
		espacos = espacos.replaceAll(" ", ""); // tira os espaços
		System.out.println(espacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome.trim());
		
	}

	
	
}
