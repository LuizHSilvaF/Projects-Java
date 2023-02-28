package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-01-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-01-09T12:30:29");
		Instant d06 = Instant.now();
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		
		System.out.println("Past Week = "+pastWeek);
		System.out.println("Next Week = "+nextWeek);

		LocalDateTime pastWeekTime = d05.minusDays(7);
		LocalDateTime nextWeekTIme = d05.plusDays(7);
		
		System.out.println("Past Week = "+pastWeekTime);
		System.out.println("Next Week = "+nextWeekTIme);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past Week Instant = "+fmt3.format(pastWeekInstant));
		System.out.println("Next Week Instant = "+fmt3.format(nextWeekInstant));
		
		Duration t1 = Duration.between(pastWeekTime, d05);
		Duration t2 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t4 = Duration.between(nextWeekInstant, pastWeekInstant);
		
		System.out.println("Entre = "+t1.toDays());
		System.out.println("Entre = "+t2.toDays());
		System.out.println("Entre = "+t3.toDays());
		System.out.println("Entre = "+t4.toDays());
	}

}
