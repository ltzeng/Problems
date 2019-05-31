package maps;

import org.junit.Before;
import org.junit.Test;

public class GgggUnit {

    String val1;
    String val2;
    
    @Before
    public void setup(){
        System.out.println("Setting up");
    }
    
    @Test
    public void test2(){
        val1="not null";
        val2="also not null";
        System.out.println(val1);
        System.out.println(val2);
    }
    
    @Test
    public void test1(){
        System.out.println(val1);
        System.out.println(val2);
    }
}
