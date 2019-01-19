import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataTimeApp {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate birthDateAS = LocalDate.parse("1989-06-25");
		System.out.println(birthDateAS);
		
		LocalDate barMizvaAS = birthDateAS.plusYears(13);
		System.out.println("bar mizva: " + barMizvaAS);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate testParse = LocalDate.parse("09/09/2017",dtf);
		System.out.println(testParse);
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(current.format(dtf2));

		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("GMT+2"));	//ZB: GMT-4 
		System.out.println(zdt);
		
	//	for(String str: ZoneId.getAvailableZoneIds())System.out.println(str);
		
			ChronoUnit unit = ChronoUnit.MONTHS;
		
			System.out.println(unit.between(birthDateAS, date));
			
			YearMonth ym = YearMonth.now();
			System.out.println(ym.lengthOfMonth());
			
			Instant ins = Instant.now();
			System.out.println(ins.MAX);
			System.out.println(ins.MIN);//привязка к long ms hronytsa))
			
			
	}

}
