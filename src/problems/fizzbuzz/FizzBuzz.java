package problems.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        for(int x=1; x<101; x++) {
        
        printFB(100);
    }
    
    public static void printFB(int x) {
        if(x>0) {
            
            int y=x-1;
            printFB(y);
            if(x%5==0 && x%3==0) {
                System.out.println("fizz buzz");
            }else if(x%5==0) {
                System.out.println("buzz");
            }else if(x%3==0) {
                System.out.println("fizz");
            }else {
                System.out.println(x);
            }
            
        }
    }

}


