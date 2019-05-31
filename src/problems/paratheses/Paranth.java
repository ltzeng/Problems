package problems.paratheses;

import java.util.ArrayList;
import java.util.List;

public class Paranth {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        
        int n = 3;
        
        
        gen(n, n, sb, list);
//        return list;
        for(String s : list) {
            System.out.println(s);
        }
    }

    
    static void gen(int l, int r, StringBuilder sb, List<String> list) {
        if (l == 0 && r == 0) {
            list.add(sb.toString());
            return;
        }
        
        if (l > 0) {
            sb.append('(');
            gen(l-1, r, sb, list);
            sb.setLength(sb.length()-1);
        }
        if (l < r) {
            sb.append(')');
            gen(l, r-1, sb, list);
            sb.setLength(sb.length()-1);
        }
    }
}
