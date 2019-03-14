package loianeGroner.treino;

import java.time.LocalDate;
import java.time.Period;

public class Treino {

	public static void main(String[] args) {
		
		calcularIdade();
		
	}
	
	public static void calcularIdade() {
		LocalDate data1 = LocalDate.of(1979, 12, 7);
		LocalDate data2 = LocalDate.of(2019, 3, 13);
		
		Period periodo = Period.between(data1, data2);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);
	}

}
