package Timer;

import javax.xml.crypto.Data;
import java.util.*;

public class Main_Data {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(1));
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.getTime());

        int day = Calendar.DECEMBER;
        System.out.println(day);
        Set calendar1 = Calendar.getAvailableCalendarTypes();
        System.out.println(calendar1);

        Calendar cal = Calendar.getInstance();
        cal.set(2000,1,10);
        System.out.println(cal.getTime());
        // Создание локали
        Locale local = Locale.getDefault();
        // Вызов метода getdisplaynames
        Map<String, Integer> cal_repres = cal.getDisplayNames(Calendar.DAY_OF_WEEK,
                Calendar.LONG, local);
        NavigableMap<String, Integer> Nav_Map = new TreeMap<>(cal_repres);
        // Отображение результатов
        System.out.printf("The complete list is: %n%s%n", Nav_Map);
            ArrayList<Integer> arrayList =new ArrayList();
        Long tamerStart=Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i <1000000 ; i++) {
            arrayList.add(10000000);
        }
        Long tamerfin=Calendar.getInstance().getTimeInMillis();
        System.out.println((tamerfin-tamerStart)+" sec");

    }
}
