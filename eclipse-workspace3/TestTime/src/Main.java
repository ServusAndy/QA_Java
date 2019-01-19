import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
			LocalDate localDate = LocalDate.now();
			LocalTime localTime = LocalTime.now();	
			LocalDateTime localDateTime = LocalDateTime.now();
			System.out.println(localDate);
			System.out.println(localTime);
			System.out.println(localDateTime);
			
			ZonedDateTime zonedDateTime = ZonedDateTime.now();
			System.out.println(zonedDateTime);
			Set<String> zones = ZoneId.getAvailableZoneIds();
//			for(String str:zones) {
//			System.out.println(str);
//			}
			
			ZonedDateTime myDate = ZonedDateTime.of(2019, 1, 31, 12, 12, 0, 0, ZoneId.of("Asia/Jerusalem"));
			
			System.out.println(myDate.getDayOfWeek());
			
			System.out.println(localDate.plusDays(365));
			
			LocalDate tomorrow = localDate.plusDays(1);
			System.out.println(localDate.isBefore(tomorrow));
			
			LocalDateTime tomorrowTime = localDateTime.plusDays(1);
			Duration duration = Duration.between(localDateTime, tomorrowTime);
			System.out.println(duration);
			
			Period period = Period.between(localDate, tomorrow);
			System.out.println(period);
			
			long t = ChronoUnit.MINUTES.between(localDateTime, tomorrowTime);
			System.out.println(t + " min");
			
			System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))); //WOW WOW!!!!
			
			List<DayOfWeek> days = new ArrayList<>();
			LocalDate now = LocalDate.now().withYear(1812);// looked hear!!!!!WOW Time Travel, is exist!
			Month[] months = Month.values();
			for(Month m:months) {
				DayOfWeek dow = now.withMonth(m.getValue()).with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
				days.add(dow);
			}
			
			for(DayOfWeek d:days) {
				System.out.println(d);
			}
			
	}
}
