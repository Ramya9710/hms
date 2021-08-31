package utility;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SampleDate {
    public static final Map<Date, Date> DATES;
    static {
        DATES = new HashMap<Date, Date>() {
            {
                final Calendar cal = Calendar.getInstance();
                cal.set(2013, 11, 31);
                final Date value = cal.getTime();

                cal.set(2014, 0, 1);
                cal.set(2014, 0, 11);
                cal.set(2014, 0, 21);
                cal.set(2014, 0, 31);
                put(cal.getTime(), value);
                put(cal.getTime(), value);
                put(cal.getTime(), value);
                put(cal.getTime(), value);
            }
        };
    }
}
