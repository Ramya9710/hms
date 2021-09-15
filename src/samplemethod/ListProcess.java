package samplemethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListProcess {
    static List<Integer> integerList;
    static List<Long> longList;
    static List<String> stringList;
    static List<Double> doubleList;
    static List<Float> floatList;
    static List<Date> dateList;

    static {
        integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        longList = new ArrayList<>();
        longList.add(987654321l);

        stringList = new ArrayList<>();
        stringList.add("xyz");
        stringList.add("uvw");
        stringList.add("rst");
        stringList.add("opq");

        doubleList = new ArrayList<>();
        doubleList.add(12.12);

        floatList = new ArrayList<>();
        floatList.add(7244556.12f);

        dateList = new ArrayList<>();
        dateList.add(new Date());
    }
}
