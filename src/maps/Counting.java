package maps;




public class Counting {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    String[] ticketsArr = {"0","1-","2-","3-","4-"};
    StringBuilder sb = new StringBuilder();
//    System.out.println(ticketsArr.length);
    for(int x=1; x<101; x++){
      if(x<ticketsArr.length+1){
        sb.append(ticketsArr[x-1] + ",");
      }else{
        sb.append(x + ",");
      }
    }
//    System.out.println(getQuestionMarks(ticketsArr));
//    System.out.println(sb.toString());
    doublecounting(ticketsArr);
  }

  private static String getQuestionMarks(String[] ticketsArr){
    StringBuilder qq = new StringBuilder();
    for(int x=0; x<ticketsArr.length; x++){
      if(x==0){
        qq.append("?");
      }else{
        qq.append(",?");
      }
    }
    return qq.toString();
  }
  
  private static void doublecounting(String[] ticketsArr){
    int count = 0;
    for(int x=0; x<ticketsArr.length*2; x++){
       
      if(count<ticketsArr.length){
       System.out.println(x+1 + ":"+ ticketsArr[count]);
      }else{
        count=0;
        System.out.println(x+1 + ":"+ ticketsArr[count]);
      }
      count++;
    }
  }
}
