/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить
 * информацию о выходных и праздничных днях.
 */
package javacoder2021;

import by.epam.basics_of_oop.task3.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Calendar calendar = new Calendar();

        calendar.addHoliday(MonthDay.of(Month.JANUARY, 1));
        calendar.addHoliday(MonthDay.of(Month.MARCH, 8));
        calendar.addHoliday(MonthDay.of(Month.MAY, 1));
        calendar.addHoliday(MonthDay.of(Month.MAY, 9));
        calendar.addHoliday(MonthDay.of(Month.NOVEMBER, 7));

        calendar.showWeekendAndHolidayBetween(LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));
        
    }
    
}
