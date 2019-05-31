package maps;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
public class TimezonesFun {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        Date date = new Date();
//        String[] ids = TimeZone.getAvailableIDs();
//        Arrays.sort(ids);;
//        for (String id : ids) {
//            System.out.println("<option value='" + TimeZone.getTimeZone(id).getOffset(date.getTime()) + "'>"+id+"</option>");
//        }
        System.out.println(TimeZone.getDefault());
//        System.out.println(TimeZone.getTimeZone(null));
    }
//    private static String displayTimeZone(TimeZone tz) {
//
//        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
//        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
//                                  - TimeUnit.HOURS.toMinutes(hours);
//        // avoid -4:-30 issue
//        minutes = Math.abs(minutes);
//
//        String result = "";
//        if (hours > 0) {
//            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
//        } else {
//            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
//        }
//
//        return result;
//
//    }

}
