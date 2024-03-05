package basics.dateandcalender;

import java.text.DateFormatSymbols;

import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {
        int age = calculateAge(2001);
        System.out.println("Current Age: " + age);
        String day = dayOfYear(2024,03,04);
        System.out.println(day);
    }
    public static int calculateAge(int birthYear){
        Calendar today = Calendar.getInstance();
        int currentYear = today.get(Calendar.YEAR);
        int ageInYears = currentYear - birthYear;
        return ageInYears;
    }
    public static String dayOfYear(int dayYear,int dayMonth, int daydate){
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar date = Calendar.getInstance();
        return dayNames[date.get(Calendar.DAY_OF_WEEK)];
    }
}
