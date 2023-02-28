package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-01-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-01-09T12:30:29");
		Instant d06 = Instant.now();
		Instant d07 = Instant.parse("2022-01-09T12:30:29-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 18:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022,7,20);
		LocalDateTime d11 = LocalDateTime.of(2022,07,20,1,30);
		
		Instant d12 = Instant.now();  
		
		LocalDate r1 = LocalDate.ofInstant(d12, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d12, ZoneId.systemDefault());
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04.format(fmt1)); 
		System.out.println(d05.format(fmt2));
		System.out.println("d06 = "+fmt3.format(d06));
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(r1);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 dia = " + d04.getMonthValue());
		System.out.println("d04 dia = " + d04.getYear());
		
		System.out.println("d05 hora = "+ d05.getHour());
		System.out.println("d05 hora = "+ d05.getMinute());

	}

}
