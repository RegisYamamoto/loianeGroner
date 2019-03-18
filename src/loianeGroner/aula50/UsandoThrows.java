package loianeGroner.aula50;

import java.util.Scanner;

// Exception: stacktrace e throws

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.println("Digite um número decimal!");
		
		try {
			double num = leNumero();
			System.out.println("Você digitou: " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		
	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
