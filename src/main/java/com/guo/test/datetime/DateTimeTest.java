package com.guo.test.datetime;

import java.time.*;

/**
 * @author guo
 * @date 2021/2/21
 */
public class DateTimeTest {
	public static void main(String[] args) {
		System.out.println("====== Year ======");
		Year year = Year.now();
		System.out.println(year);
		System.out.println(year.atMonth(10));
		System.out.println(year.atDay(10));

		System.out.println("====== MonthDay ======");
		MonthDay md = MonthDay.now();
		System.out.println(md);

		System.out.println("====== LocalDate ======");
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		System.out.println("====== LocalTime ======");
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		System.out.println("====== LocalDateTime ======");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		System.out.println("====== ZonedDateTime ======");
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
	}
}
