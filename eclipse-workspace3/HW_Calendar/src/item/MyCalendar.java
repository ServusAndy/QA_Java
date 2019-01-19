package item;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



public class MyCalendar {
	
	static DateTimeFormatter monthsFormatter = DateTimeFormatter.ofPattern("MMMM",new Locale("he"));
	static DateTimeFormatter weekDayFormatter = DateTimeFormatter.ofPattern("EEE",new Locale("he"));
	static LocalDate stub = LocalDate.of(0,1,1);
	static LocalDate sunday = LocalDate.of(2019,1,13);
	
	public static void toConsole(int year) {
		printHeader();
		for(int i=1;i<13;i++) {
			printMonths(year,i);
		}
	}

	private static void printMonths(int year, int months) {
		printMonthsName(months);
		printWeekDaysString();
		printMonthsBody(year,months);
		
	}

	private static void printMonthsBody(int year, int months) {
		int firstDay = LocalDate.of(year, months, 1).getDayOfWeek().getValue();
		
		int numDays = months == 12 ? 31 : LocalDate.of(year, months+1, 1).minusDays(1).getDayOfMonth();
		
		int begin = 7-firstDay;
		int end = 1;
		while(true) {
			
			for(int i = begin;i>=end;i--)System.out.print(i+"\t");
			System.out.println();
			begin = begin+7;
			end = begin-6;
			if(begin>numDays) {
		//	end = begin-6;
				for(int i = begin;i>numDays;i--)System.out.print("\t");
				for(int i = numDays ; i>=end;i--)System.out.print(i+"\t");
				System.out.println();
				break;
			}
		}
		System.out.println();
		
	/*	Calendar cal = new GregorianCalendar(year, months,1);
		do {
		    // get the day of the week for the current day
		    int day = cal.get(Calendar.DAY_OF_WEEK);
		    // check if it is a Saturday or Sunday
		    if (day == Calendar.SUNDAY) {
		        // print the day - but you could add them to a list or whatever
		        System.out.println("\t\t\t\t\t\t" + cal.get(Calendar.DAY_OF_MONTH) + "\n");
		    }
		    // advance to the next day
		    cal.add(Calendar.DAY_OF_YEAR, 1);
		}  while (cal.get(Calendar.MONTH) == months);*/
		
		
		
	}
	
	

	private static void printWeekDaysString() {
		LocalDate current = sunday;
		String res = "";
		for(int i=7;i>0;i--) {
			res =current.format(weekDayFormatter)+res;
			if(i!=1) res = "\t" + res;
			current = current.plusDays(1);
		}
		System.out.println();
		System.out.println(res);
		System.out.println();
		
	}

	private static void printMonthsName(int months) {
		System.out.println("\t\t\t\t\t\t"+stub.withMonth(months).format(monthsFormatter));		
	}

	private static void printHeader() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 IntStream.rangeClosed(1,YearMonth.of(year, months).lengthOfMonth())
     .mapToObj(day -> LocalDate.of(year, months, day))
     .filter(date -> date.getDayOfWeek() == DayOfWeek.SATURDAY ||
                     date.getDayOfWeek() == DayOfWeek.SUNDAY)
     .forEach(date -> System.out.print("\t" + date.getDayOfMonth() + " "));
     
     
     ============================
     IntStream.rangeClosed(1,YearMonth.of(year, months).lengthOfMonth())
          .mapToObj(day -> LocalDate.of(year, months, day))
          .filter(date ->date.getDayOfWeek() == DayOfWeek.SUNDAY)
          .forEach(date -> System.out.print("\t\t\t\t\t\t" + date.getDayOfMonth() + "\n\n"));
     */
	
}

