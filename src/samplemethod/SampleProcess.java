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
        integerList.add(3);
        integerList.add(4);
        return integerList;
    }

    public static List<Long> getDisplayOfLong() {
        List<Long> longList = new ArrayList<>();
        longList.add(1234567l);
        longList.add(9876542l);
        longList.add(3453232l);
        longList.add(568995l);
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
        doubleList.add(13459.23);
        doubleList.add(12345.24);
        doubleList.add(15642.12);
        return doubleList;
    }

    public static List<Float> getDisplayOfFloat() {
        List<Float> floatList = new ArrayList<>();
        floatList.add(72445.12f);
        floatList.add(76324.34f);
        floatList.add(76553.14f);
        floatList.add(74356.11f);
        return floatList;
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

        getDisplayOfDate();

    }
}