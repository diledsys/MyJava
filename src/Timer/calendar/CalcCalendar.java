package Timer.calendar;

import java.time.LocalDate;
import java.util.Calendar;

public class CalcCalendar {

    public static void getCalendar(int year,int month, int toDay) {
        int day;
        String red = (char) 27 + "[31m";
        String blue =(char) 27 + "[36m";
        boolean s = false;
        Calendar calendar = Calendar.getInstance();
        LocalDate localDate = LocalDate.of(year, month, toDay);
        int dayOfWeek = localDate.getDayOfWeek().getValue();//значение дня недели
        int daysInMonth = localDate.lengthOfMonth();// получили количество дней в месяце
        System.out.println("пн  вт  ср  чт  пт  сб  вс");
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }
        while (toDay < daysInMonth) {
            localDate = LocalDate.of(year, month, toDay);
            dayOfWeek = localDate.getDayOfWeek().getValue();
            if (dayOfWeek==7){ System.out.print(red);}
            else { System.out.print(blue);}
            if (s && dayOfWeek == 1) {
                System.out.println();
            }
            String dstr = ((day = localDate.getDayOfMonth()) < 10) ? day + "   " : day + "  ";

            System.out.print(dstr);
            toDay++;
            s = true;
        }
    }
}
