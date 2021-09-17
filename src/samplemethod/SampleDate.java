package samplemethod;

import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SampleDate {
    // Last Date of the Month
    public static Date getDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    public static void getLastDateOfMonth() {
        System.out.println("Last date of the month is :" + getDate(new Date()));
    }

    //First Date of the Month
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
    public static void differenceOfDate(String startDate, String endDate) {
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
            System.out.println("Differences between two date is Hr and mins format :" + differenceInHours + "Hr" + differenceInMinutes + "mins");
            System.out.println("Differences between two date is Hr mins sec format :" + differenceInHours + "Hr" + differenceInMinutes + "mins" + differenceInSeconds + "sec");
            System.out.println("Differences between two date is day Hr mins sec format :" + differenceInDays + "day" + differenceInHours + "Hr" + differenceInMinutes + "mins" + differenceInSeconds + "sec");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void differenceOfTwoDate() {
        //given the start date
        String startDate = "2021-09-08 04:00:00";
        //given the end dates
        String endDate = "2021-09-10 05:30:00";
        // differenceOfTwoDates function calling
        differenceOfDate(startDate, endDate);
    }

    // Add 1 hour of the day
    public static Date getHoursAdd(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, +1);
        return cal.getTime();
    }

    public static void get1HoursAdded() {
        System.out.println("Date changing  add 1hours of the given day :" + getHoursAdd(new Date()));
    }

    // subtract 1 hour of the day
    public static Date getHoursBack(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, -1);
        return cal.getTime();
    }

    public static void get1HourBack() {
        System.out.println("Date changing 1hr hour back of the given day:" + getHoursBack(new Date()));
    }

    // Add 1 day of the current date
    public static Date getDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, +1);
        return cal.getTime();
    }

    public static void getAdd1DayToGivenDate() {
        System.out.println("Date changing add 1 day to given date :" + getDay(new Date()));
    }

    // Back 1 day of the current date
    public static Date getDay1(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    public static void getBack1DayToGivenDate() {
        System.out.println("Date changing back 1 day to given date :" + getDay1(new Date()));
    }

    // Current month
    public static String getCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println("Current Month :" + month);
        return dateFormat.format(cal.getTime());
    }

    // Current Date
    public static Date getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        int date = cal.get(Calendar.DATE);
        dateFormat.format(cal.getTime());
        System.out.println("Current Date :" + date);
        return cal.getTime();
    }

    // Current year
    public static String getCurrentYear() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        int year = cal.get(Calendar.YEAR);
        System.out.println("Current year :" + year);
        return dateFormat.format(cal.getTime());
    }

    // Today's date
    public static String getTodayDate() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date1 = cal.getTime();
        System.out.println("today's date format :" + date1);
        return dateFormat.format(cal.getTime());
    }

    // String to date format
    public static Date getStringToDateFormat() {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String str = dateFormat.format(date);
        System.out.println("String to Date format :" + str);
        return date;
    }

    // Date to string format
    public static String getDateToStringFormat() {
        String sDate1 = "09/15/2021";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date1 = simpleDateFormat1.parse(sDate1);
            System.out.println("Date to String format :" + date1);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return sDate1;
    }

    // String Format date output
    public static Date getStringToDateFormat1() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd yyyy");
        String str = dateFormat.format(date);
        System.out.println("Date Format with dd MMMM yyyy :" + str);
        return date;
    }

    // First date of the year
    public static Date getFirstDateOfTheYear() {
        Calendar calender = Calendar.getInstance();
        int year = 2021;
        calender.set(Calendar.YEAR, year);
        calender.set(Calendar.MONTH, 0);
        calender.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String str = dateFormat.format(calender.getTime());
        System.out.println("First date of the year is :" + str);
        return calender.getTime();
    }

    // Last date of the year
    public static Date getLastDateOfTheYear() {
        Calendar calender = Calendar.getInstance();
        int year = 2021;
        calender.set(Calendar.YEAR, year);
        calender.set(Calendar.MONTH, 11);
        calender.set(Calendar.DAY_OF_MONTH, 31);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String str = dateFormat.format(calender.getTime());
        System.out.println("Last date of the year is :" + str);
        return calender.getTime();
    }

    // Current Time 12hrs format
    public static void getCurrentTime12HrsFormat() {
        //using simple Date Formatter
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Current time at 12hrs format :" + dateFormat.format(date));

     /*   //using Date time Formatter
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Current time at 12hrs format :" + localTime.format(dateTimeFormatter));*/
    }

    // Current time 24hrs format
    public static void getCurrentTime24HrsFormat() {
     /*   //using simple Date Formatter
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time at 24hrs format :" + dateFormat.format(date));*/

        //using Date time Formatter
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss");
        System.out.println("Current time at 24hrs format :" + localTime.format(dateTimeFormatter));
    }

    // Date list
    public static List<Date> getDisplayOfDate() {
        List<Date> dateList = new ArrayList<>();
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String str = dateFormat.format(date);
        System.out.println("Date :" + str);
        return dateList;
    }

    public static void main(String[] args) {
        getLastDateOfMonth();
        getFirstDateOfMonth();
        differenceOfTwoDate();
        get1HoursAdded();
        get1HourBack();
        getAdd1DayToGivenDate();
        getBack1DayToGivenDate();
        getCurrentMonth();
        getCurrentDate();
        getCurrentYear();
        getTodayDate();
        getStringToDateFormat();
        getDateToStringFormat();
        getStringToDateFormat1();
        getFirstDateOfTheYear();
        getLastDateOfTheYear();
        getCurrentTime12HrsFormat();
        getCurrentTime24HrsFormat();
        getDisplayOfDate();
    }
}