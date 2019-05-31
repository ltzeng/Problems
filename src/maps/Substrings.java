package maps;

public class Substrings {

    public static void main(String[] args){
        
        String value = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx1xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx2xxxxxxxxx1xxxxxxxxx2xxxxxxxxx3xxxxxxxxx4xxxxxxxxx5123456789x";
        
        value = value.substring(0, 255);
        System.out.println( value.length() + ":" + value);
    }
}
