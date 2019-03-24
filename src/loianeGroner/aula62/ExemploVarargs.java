package loianeGroner.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {
		
		System.out.println(soma(10, 25, 15, 48, 2, 22));
		
	}
	
	static int soma(Integer... vetor) {
		int total = 0;
		
		for (int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}

}
