package maps;

import java.util.HashSet;
import java.util.Set;

public class SetContainers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        
        set2.add(1);
        set2.add(2);
        set2.add(3);
//        set2.add(4);
        
        if(set1.containsAll(set2)) {
            System.out.println("all are same");
        }
    }

}
