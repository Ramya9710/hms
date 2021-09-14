package dateprocess;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
    public static Date getDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    public static void getLastDateOfMonth() {
        System.out.println("Last date of the month is :" + getDate(new Date()));
    }


    public static Date getDateMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    public static void getFirstDateOfMonth() {
        System.out.println("First date of the month is :" + getDateMonth(new Date()));
    }


    //  the difference of two date in Day Hr Min Sec format
    public static void differenceOfTwoDates(String startDate, String endDate) {
        //  SimpleDateFormat converts the string format to date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            //parse method is used to parse the text from a string to produce the date
            Date d1 = dateFormat.parse(startDate);
            Date d2 = dateFormat.parse(endDate);
            //calculate time differences
            long differenceInTime = d2.getTime() - d1.getTime();
            long differenceInSeconds = (differenceInTime / 1000) % 60;
            long differenceInMinutes = (differenceInTime / (1000 * 60) % 60);
            long differenceInHours = (differenceInTime / (1000 * 60 * 60)) % 24;
            long differenceInYear = (differenceInTime / (1000l * 60 * 60 * 24 * 365));
            long differenceInDays = (differenceInTime / (1000 * 60 * 60 * 24)) % 365;
            // print all the time difference dates
            System.out.println("Differences between two date is:" + differenceInHours + "Hr" + differenceInMinutes + "mins");
            //   System.out.println("Differences between two date is:" + differenceInHours + "Hr" + differenceInMinutes + "mins" + differenceInSeconds + "sec");
            //System.out.println("Differences between two date is:" + differenceInDays + "day" + differenceInHours + "Hr" + differenceInMinutes + "mins" + differenceInSeconds + "sec");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void differenceOfDate() {
        //given the start date
        String startDate = "2021-09-08 04:00:00";
        //given the end dates
        String endDate = "2021-09-08 05:30:00";

       /* String startDate1 = " 2021-09-08 04:00:50";
        String endDate1 = "2021-09-08 05:30:00";

        String startDate2 = "2021-09-08 04:00:50";
        String endDate2 = "2021-09-09 05:30:00";*/

        // differenceOfTwoDates function calling
        differenceOfTwoDates(startDate, endDate);
       /* differenceOfTwoDates(startDate1, endDate1);
        differenceOfTwoDates(startDate2, endDate2);*/
    }

    public static Date getHours(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, +1);
        return cal.getTime();
    }

    public static void getHoursAdded() {
        System.out.println("Add 1hours of the given day :" + getHours(new Date()));
    }

    public static Date getHoursDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, -1);
        return cal.getTime();
    }

    public static void getOneHourBack() {
        System.out.println("Date changing one hour back :" + getHoursDay(new Date()));
    }

}