package control;

public class MultipleSwitchExample {
    public static void main(String[] args) {
        System.out.println("The given month is "+ month("AUGUST"));
    }
    public static String month(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "JAN FEB MAR";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "APR MAY JUN";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "JUL AUG SEP";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "OCT NOV DEC";
        }

        return month;
    }

}
