package maps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "A";
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
        Matcher matcher = pattern.matcher(s);
        boolean bool = matcher.matches();
        System.out.println(bool);
    }

}
