package maps;

public class LongTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String test = "abc.def.123";
        
        String[] nodes = test.split("\\.");
        System.out.println(nodes.length);
        StringBuilder sb = new StringBuilder();
        for(int x=nodes.length-1; x>=0; x--) {
            sb.append(nodes[x]);
            if(x!=0) {
                sb.append(".");
            }
        }
        
        System.out.println("the reverse is: " + sb);
    }

}
