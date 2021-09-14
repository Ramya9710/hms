package samplemethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListProcess {
    private static List<Integer> integerList;
    private static List<Long> longList;
    private static List<String> stringList;
    private static List<Double> doubleList;
    private static List<Float> floatList;
    private static List<Date> dateList;

    static {
        integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        longList = new ArrayList<>();
        longList.add(1234567l);

        stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("ghi");
        stringList.add("jkl");

        doubleList = new ArrayList<>();
        doubleList.add(12345.12);

        floatList = new ArrayList<>();
        floatList.add(72445.12f);

        dateList = new ArrayList<>();
        dateList.add(new Date());
    }
}
