package samplemethod;

import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SampleDate {

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
            System.out.println("Differences between two date is:" + differenceInHours + "Hr" + differenceInMinutes + "mins" + differenceInSeconds + "sec");
            System.out.println("Differences between two date is:" + differenceInDays + "day" + differenceInHours + "Hr" + differenceInMinutes + "mins" + differenceInSeconds + "sec");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void differenceOfDate() {
        //given the start date
        String startDate = "2021-09-08 04:00:00";
        //given the end dates
        String endDate = "2021-09-10 05:30:00";

        // differenceOfTwoDates function calling
        differenceOfTwoDates(startDate, endDate);
    }

    public static Date getHours(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, +1);
        return cal.getTime();
    }

    public static void getHoursAdded() {
        System.out.println("Date changing  add 1hours of the given day :" + getHours(new Date()));
    }

    public static Date getHoursDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, -1);
        return cal.getTime();
    }

    public static void getOneHourBack() {
        System.out.println("Date changing 1hr hour back of the given day:" + getHoursDay(new Date()));
    }


    public static Date getDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, +1);
        return cal.getTime();
    }

    public static void getAddDayToGivenDate() {
        System.out.println("Date changing add 1 day to given date :" + getDay(new Date()));
    }

    public static Date getDay1(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    public static void getBackDayToGivenDate() {
        System.out.println("Date changing back 1 day to given date :" + getDay1(new Date()));
    }

    public static Date getCurrentDateFormat() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        int year = cal.get(Calendar.YEAR);
        Date date1 = cal.getTime();
        String strDate = dateFormat.format(cal.getTime());
        System.out.println("Current Month :" + month);
        System.out.println("Current Date :" + date);
        System.out.println("Current year :" + year);
        System.out.println("today's date format :" + date1);
        System.out.println("Today's date to string format :" + strDate);
        return cal.getTime();
    }

    public static Date getDateToStringFormat() {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String str = dateFormat.format(date);
        System.out.println("Today's date to String format :" + str);
        return date;
    }

    public static String getStringToDateFormat() {
        String sDate1 = "09/15/2021";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date1 = simpleDateFormat1.parse(sDate1);
            System.out.println("String to date format :" + date1);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return sDate1;
    }

    public static void getStringToDateFormat1() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd yyyy");
        String str = dateFormat.format(date);
        System.out.println("Date Format with dd MMMM yyyy : " + str);
    }

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
        differenceOfDate();
        getHoursAdded();
        getOneHourBack();
        getAddDayToGivenDate();
        getBackDayToGivenDate();
        getCurrentDateFormat();
        getDateToStringFormat();
        getStringToDateFormat();
        getStringToDateFormat1();
        getFirstDateOfTheYear();
        getLastDateOfTheYear();
        getCurrentTime12HrsFormat();
        getCurrentTime24HrsFormat();
        getDisplayOfDate();
    }
}