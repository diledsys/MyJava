package Timer.calendar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("год  мес  чис");
        CalcCalendar.getCalendar(reader.nextInt(),reader.nextInt(),reader.nextInt());
    }
}
