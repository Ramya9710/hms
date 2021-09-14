package samplemethod;

import java.util.Date;

public class Report {
    public static void allReport() {
        MainProcess mainProcess = new MainProcess();
        mainProcess.getDisplayOfInteger();
        mainProcess.getDisplayOfLong();
        mainProcess.getDisplayOfString();
        mainProcess.getDisplayOfFloat();
        mainProcess.getDisplayOfDouble();
        mainProcess.getDisplayOfDate(new Date());
    }

    public static void main(String[] args) {
        allReport();
    }
}