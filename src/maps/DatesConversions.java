package maps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;


public class DatesConversions {

    public static void main(String[] args){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        dateFormat.format(date);
        
        System.out.println(date);
        
        DateTime dt = new DateTime(date);
        TimeZone tz = TimeZone.getTimeZone("PST");
//        System.out.println(DateTimeZone.forTimeZone(tz));
//        dt.withZoneRetainFields(DateTimeZone.forTimeZone(tz));
        dt.withZone(DateTimeZone.forTimeZone(tz));
        System.out.println(dt.toDate());
        dt = dt.withZoneRetainFields(DateTimeZone.forTimeZone(tz));
        System.out.println(dt.toDate());
        
//        dt = dt.withZoneRetainFields(DateTimeZone.forTimeZone(tz));
//        dt = dt.withZone(DateTimeZone.forTimeZone(rfctz));
//        dt = dt.withZone(DateTimeZone.forTimeZone(defaultz));
        
        
        
        
        
//        date = dt.toDate();
//        System.out.println(date);
        
//        DateFormat formatter= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        formatter.setTimeZone(TimeZone.getTimeZone("Europe/London"));
//        System.out.println(formatter.format(date));
//        formatter.format(date);
//        System.out.println(date);
        

//        formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
//        System.out.println(formatter.format(date));
//        System.out.println(formatter.format(instance2.getTime()))
    }
}
