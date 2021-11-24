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
        
        //strings_as_object
        //by.epam.strings.strings_as_object.Task1.main(args);
        //by.epam.strings.strings_as_object.Task2.main(args);
        //by.epam.strings.strings_as_object.Task2i.main(args);
        //by.epam.strings.strings_as_object.Task3.main(args);
        //by.epam.strings.strings_as_object.Task4.main(args);
        //by.epam.strings.strings_as_object.Task5.main(args);
        //by.epam.strings.strings_as_object.Task6.main(args);
        //by.epam.strings.strings_as_object.Task7.main(args);
        //by.epam.strings.strings_as_object.Task8.main(args);
        //by.epam.strings.strings_as_object.Task9.main(args);
        //by.epam.strings.strings_as_object.Task10.main(args);
        
    }
    
}
