package maps;

import java.util.Arrays;
import java.util.List;

public class Parsing {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String tickets = "1|2|3|4|5";
    
    String testing = "testing";
    String[] test = testing.split("\\|");
    
    System.out.println(test);
    
    List<String> items = Arrays.asList(tickets.split("\\|"));
    
    System.out.println(items);
  }

}