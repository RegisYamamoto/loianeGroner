package loianeGroner.aula99;

import java.util.Random;

// N�meros Aleat�rios (Rancom)

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random() * 100));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt());
		System.out.println(aleatorio.nextInt(5 + 1));

	}

}
