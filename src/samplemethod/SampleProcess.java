package samplemethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SampleProcess extends ListProcess {

    public static List<Integer> getDisplayOfInteger() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        System.out.println("List of integer value :" + integerList);
        return (integerList);
    }

    public static List<Long> getDisplayOfLong() {
        List<Long> longList = new ArrayList<>();
        longList.add(1234567l);
        System.out.println("List of long value :" + longList);
        return (longList);
    }

    public static List<String> getDisplayOfString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("ghi");
        stringList.add("jkl");
        System.out.println("List of string value :" + stringList);
        return (stringList);
    }

    public static List<Double> getDisplayOfDouble() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(12345.12);
        System.out.println("list of double value :" + doubleList);
        return (doubleList);
    }

    public static List<Float> getDisplayOfFloat() {
        List<Float> floatList = new ArrayList<>();
        floatList.add(72445.12f);
        System.out.println("List of float value :" + floatList);
        return (floatList);
    }

    public static Date getDisplayOfDate(Date date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            dateFormat.format(date);
            System.out.println("date details :" + dateFormat.format(new Date()));
            return dateFormat.parse(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        getDisplayOfInteger();
        getDisplayOfLong();
        getDisplayOfString();
        getDisplayOfDouble();
        getDisplayOfFloat();
        getDisplayOfDate(new Date());
    }
}