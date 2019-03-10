package loianeGroner.aula94;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiferencaEntreDatas {

	public static void main(String[] args) {
		
		try {
			diferencaDataEmProgramasAntigos();
			System.out.println("----------");
			
			diferencaDataAteJava7();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------");
		diferencaDataJava8();

		System.out.println("----------");
		diferencaDataJava8ComTempo();
		
		System.out.println("----------");
		diferencaDataJava8ComChronoUnit();
		
	}
	
	public static void diferencaDataEmProgramasAntigos() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraData = simpleDateFormat.parse("01/01/2019");
		Date segundaData = simpleDateFormat.parse("01/02/2019");
		
		long diferencaMilisegundos = Math.abs(segundaData.getTime() - primeiraData.getTime());
		
		int dias = (int) (diferencaMilisegundos / (1000 * 60 * 60 * 24));
		
		System.out.println("Dias: " + dias);
	}
	
	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraData = simpleDateFormat.parse("01/01/2019");
		Date segundaData = simpleDateFormat.parse("01/02/2019");
		
		long diferencaMilisegundos = Math.abs(segundaData.getTime() - primeiraData.getTime());
		
		long diferenca = TimeUnit.DAYS.convert(diferencaMilisegundos, TimeUnit.MILLISECONDS);
		
		System.out.println("Dias: " + diferenca);
	}
	
	public static void diferencaDataJava8() {
		LocalDate data1 = LocalDate.of(2019, 1, 1);
		LocalDate data2 = LocalDate.of(2019, 2, 10);
		
		Period periodo = Period.between(data1,  data2);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);
	}
	
	public static void diferencaDataJava8ComTempo() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		Duration duracao = Duration.between(data1, data2);
		long diferenca = duracao.toHours();
		
		System.out.println("Horas: " + diferenca);
	}
	
	public static void diferencaDataJava8ComChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		long diferencaHoras = ChronoUnit.HOURS.between(data1, data2);
		long diferencaDias = ChronoUnit.DAYS.between(data1, data2);
		
		System.out.println("Horas: " + diferencaHoras);
		System.out.println("Dias: " + diferencaDias);
	}

}
