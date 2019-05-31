package maps;

import java.util.ArrayList;
import java.util.List;

public class CheckValList {

    static ArrayList<String> rfcActionsTextList = new ArrayList<String>();
    
    public static void main(String[] args){
        
        rfcActionsTextList.add("Submit for Approval");
        rfcActionsTextList.add("Approve");
        rfcActionsTextList.add("Close");
        rfcActionsTextList.add("Complete Implementation");
        String test = new String("Submit for Approval");
        if(rfcActionsTextList.contains(test)){
            System.out.println("True");
        }
    }
    
}
