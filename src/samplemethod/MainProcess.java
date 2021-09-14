package samplemethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainProcess extends ListProcess{
    public void  getDisplayOfInteger() {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,2,3);
        System.out.println("List of integer value :" + integerList.toString());
    }
    public void getDisplayOfLong() {
        List<Long> longList = new ArrayList<>();
        longList.add(1234567l);
        System.out.println("List of long value :" + longList);
    }
    public void getDisplayOfString() {
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("ghi");
        stringList.add("jkl");
        System.out.println("List of string value :" + stringList);
    }
    public void getDisplayOfDouble() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(12345.12);
        System.out.println("list of double value :" + doubleList);
    }
    public void getDisplayOfFloat() {
        List<Float> floatList = new ArrayList<>();
        floatList.add(72445.12f);
        System.out.println("List of float value :" + floatList);
    }
    public Date getDisplayOfDate(Date date) {
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

}
