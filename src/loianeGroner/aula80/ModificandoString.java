package loianeGroner.aula80;

public class ModificandoString {

	public static void main(String[] args) {
		
		String teste = "Isso � um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10)); // imprime a partir do 10� caractere
		System.out.println(teste.substring(10, 15)); // imprime do 10� caractere at� o 15� caractere
		
		String palavraErrada = "ispa�o";
		String palavraCorrigida = palavraErrada.replace('i', 'e');
		System.out.println(palavraCorrigida);
		
		String espacos = "e s p a � o";
		espacos = espacos.replaceAll(" ", ""); // tira os espa�os
		System.out.println(espacos);
		
		String nome = " meu nome �: ";
		System.out.println(nome.trim());
		
	}

	
	
}
