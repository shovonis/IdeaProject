package net.therapservices;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {
        TimeZone timeZone = TimeZone.getTimeZone("Europe/Copenhagen");
        Calendar calendar = new GregorianCalendar(timeZone);
        Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2014);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        System.out.println(calendar.get(Calendar.DST_OFFSET));

        Locale cLocale = new Locale.Builder().setLanguage("en")
                .setRegion("US").build();
        System.out.println(cLocale.toString());

    }
}
