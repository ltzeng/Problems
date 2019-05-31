package maps;

import java.util.Arrays;
import java.util.List;

public class Java8Stuff {


    public static void main(String []args) {
        Integer a[] = new Integer[]{1,2,3,4,5,6};
        List<Integer> numbers = Arrays.asList(a);

        numbers.forEach(value -> System.out.println(value));
        numbers.forEach(System.out::print);
        
        numbers.stream()
                .map(e -> e.toString())
                .forEach(System.out::println);
        
    }


}
