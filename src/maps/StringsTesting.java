package maps;

import java.util.Arrays;

public class StringsTesting {

    public static void main(String[] args){
     
        String delimeter = "";
        String test = "value";
        StringBuilder sb = new StringBuilder();
        
        sb.append(delimeter);
        
        
        System.out.println(sb.length());
        
        String[] test2 = test.split("");
        System.out.println(Arrays.toString(test2));
        
    }
}
