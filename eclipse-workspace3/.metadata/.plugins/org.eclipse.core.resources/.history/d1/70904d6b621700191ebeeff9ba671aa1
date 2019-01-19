import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate birthdate = LocalDate.of(1989, Month.JUNE, 25);
		System.out.println(birthdate);
		LocalDate mySisterBirdate = LocalDate.of(1979, 8, 26);

		LocalDate empty = LocalDate.of(0, 1, 1);
		System.out.println(empty);

		System.out.println(now.getDayOfMonth());
		System.out.println(mySisterBirdate.getDayOfYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getYear());

		// System.out.println(now.getLong(ChronoField.YEAR_OF_ERA));

		birthdate = birthdate.withMonth(3);
		birthdate = birthdate.withDayOfMonth(26);
		System.out.println(birthdate);

		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);

		LocalDateTime dateTimeNow = LocalDateTime.now();
		System.out.println(dateTimeNow);

		System.out.println(mySisterBirdate.isBefore(birthdate));

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

		DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		System.out.println(now.format(dataFormatter));

//		Month[] months = Month.values();
//		for(Month m:months) {
//			System.out.println(m);
//		}

		for (int i = 1; i < 13; i++) {
			System.out
					.println(LocalDate.of(0, i, 1).format(DateTimeFormatter.ofPattern(("MMMM"), new Locale("en-US"))));

		}

//		DateTimeFormatter readDTF = DateTimeFormatter.ofPattern("dd MMM YYYY", new Locale("en-US"));
//		LocalDate read = LocalDate.parse("21 Feb 1958", readDTF);
//		System.out.println(read.format(dataFormatter));

		System.out.println(now.plusYears(3).plusMonths(5).plusDays(11));
		System.out.println(now.plus(2000,ChronoUnit.MILLENNIA));
		
		LocalDateTime tomorrowTime = localDateTime.plusDays(1);
		long t = ChronoUnit.MINUTES.between(localDateTime, tomorrowTime );
		t = ChronoUnit.SECONDS.between(localDateTime, tomorrowTime );
		System.out.println(t + " seconds");
		
		Period p1 = Period.between(mySisterBirdate, birthdate);
		System.out.println(p1);
		System.out.println(p1.getYears() + " years, " + p1.getMonths() + " months, " + p1.getDays() + " days");
		
		Period p2 = Period.ofDays(1000);
		System.out.println(p2);
		System.out.println(now.plus(p2));
		
		ZoneId zoneId = ZoneId.of("Australia/Sydney");
		System.out.println(zoneId);
		ZonedDateTime zdt = ZonedDateTime.now(zoneId);
		System.out.println(zdt);
	}

}
