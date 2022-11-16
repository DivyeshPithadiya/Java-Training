package FunctionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p = () -> { return 5; };
		System.out.println(p.getName());
		
		LocalDateTime d=LocalDateTime.now();
		System.out.println(d);
	}
}
