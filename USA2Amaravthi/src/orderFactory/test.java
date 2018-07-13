package orderFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {
	public static void main(String[] args) {
		DateTimeFormatter d=DateTimeFormatter.ofPattern("MM-dd-yyyy");
   	 LocalDate l=LocalDate.parse("02-03-2015",d);
   	 System.out.println(l);
	}
}
