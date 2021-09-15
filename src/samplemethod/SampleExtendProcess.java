package samplemethod;

import java.util.Date;
import java.util.List;

public class SampleExtendProcess extends ListProcess {
    public static List<Integer> getDisplayOfInteger() {
        return ListProcess.integerList;
    }

    public static List<Long> getDisplayOfLong() {
        return ListProcess.longList;
    }

    public static List<String> getDisplayOfString() {
        return ListProcess.stringList;
    }

    public static List<Double> getDisplayOfDouble() {
        return ListProcess.doubleList;
    }

    public static List<Float> getDisplayOfFloat() {
        return ListProcess.floatList;
    }

    public static List<Date> getDisplayOfDate(Date date) {
        return dateList;
    }

    public static void main(String[] args) {
        integerList = getDisplayOfInteger();
        System.out.println("List of integer value :" + integerList);
        longList = getDisplayOfLong();
        System.out.println("List of long value :" + longList);
        doubleList = getDisplayOfDouble();
        System.out.println("List of double value :" + doubleList);
        floatList = getDisplayOfFloat();
        System.out.println("List of float values :" + floatList);
        stringList = getDisplayOfString();
        System.out.println("List of String :" + stringList);
        dateList = getDisplayOfDate(new Date());
        System.out.println("Date :" + dateList);

    }
}

