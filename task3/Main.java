/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить
 * информацию о выходных и праздничных днях.
 */
package by.epam.basics_of_oop.task3;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		
        Calendar calendar = new Calendar();

        calendar.addHoliday(MonthDay.of(Month.JANUARY, 1));
        calendar.addHoliday(MonthDay.of(Month.MARCH, 8));
        calendar.addHoliday(MonthDay.of(Month.MAY, 1));
        calendar.addHoliday(MonthDay.of(Month.MAY, 9));
        calendar.addHoliday(MonthDay.of(Month.NOVEMBER, 7));

        calendar.showWeekendAndHolidayBetween(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 6, 1));
        
	}

}
