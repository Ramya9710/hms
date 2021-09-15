package samplemethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SampleProcess {

    public static List<Integer> getDisplayOfInteger() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        return integerList;
    }

    public static List<Long> getDisplayOfLong() {
        List<Long> longList = new ArrayList<>();
        longList.add(1234567l);
        return longList;
    }

    public static List<String> getDisplayOfString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("ghi");
        stringList.add("jkl");
        return stringList;
    }

    public static List<Double> getDisplayOfDouble() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(12345.12);
        return doubleList;
    }

    public static List<Float> getDisplayOfFloat() {
        List<Float> floatList = new ArrayList<>();
        floatList.add(72445.12f);
        return floatList;
    }

    public static Date getDisplayOfDate(Date date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            dateFormat.format(date);
            return dateFormat.parse(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> integerList = getDisplayOfInteger();
        System.out.println("List of integer value :" + integerList);

        List<Long> longList = getDisplayOfLong();
        System.out.println("List of long value :" + longList);

        List<String> stringList = getDisplayOfString();
        System.out.println("List of string value :" + stringList);

        List<Double> doubleList = getDisplayOfDouble();
        System.out.println("list of double value :" + doubleList);

        List<Float> floatList = getDisplayOfFloat();
        System.out.println("List of float value :" + floatList);

        Date date = getDisplayOfDate(new Date());
        System.out.println("date details :" + date);

    }
}