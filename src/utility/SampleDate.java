package utility;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class SampleDate {
    public final void format(Date date) {
        DateFormat Date = DateFormat.getDateInstance();
        Calendar cals = Calendar.getInstance();
        String currentDate = Date.format(cals.getTime());
    }
}
