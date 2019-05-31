package maps;

import java.util.HashMap;
import java.util.Map;

public class TwoStringsMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        int max=0;
        Map<String, Integer> letterCountMap = new HashMap<String,Integer>();
        String[] letters = s.split("");
        for(String l : letters){
            if(!l.trim().equals("")){
                Integer count=letterCountMap.get(l);
                if(count==null){
                    letterCountMap.put(l,1);
                }else{
                    int newCount = count+1;
                    letterCountMap.put(l,newCount);
                    if(max<newCount) {
                        max=newCount;
                    }
                }
            }
        }

        String answer = "YES";
        int[] counterArray = {0,0};
        for(String letter : letterCountMap.keySet()){
            int value = letterCountMap.get(letter);
            int index = max-value;
            System.out.println(letter+"::"+value+"::"+index);
            if(index>1||index<0) {
                answer="NO";
                break;
            }else {
                counterArray[index]=counterArray[index]+1;
            }
        }
        if(counterArray[0]>1) {
            answer="NO";
        }
        System.out.println(answer);
    }
    

}
