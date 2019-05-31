package maps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateNight {

    public static void main(String args[]){
        DateFormat sdf = new SimpleDateFormat("MM/dd/yy HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        System.out.println(sdf.format(cal.getTime()));
        cal.add(Calendar.DATE, 7);
        System.out.println(sdf.format(cal.getTime()));
    }
}
