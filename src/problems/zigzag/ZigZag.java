package problems.zigzag;

public class ZigZag {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "ab";
        int numRows = 1;
        
        if(numRows<2) {
            System.out.println(s);
            return;
        }
        
        
        int indexX=0;
        int indexY=0;
        String[] arr = s.split("");
        String[][] lists = new String[numRows][];
        for(int x=0; x<numRows; x++){
            String[] l = new String[arr.length];
            lists[x]=l;
        }
        boolean yDown=true;
        for(int count=0; count<arr.length; count++){
            lists[indexY][indexX]=arr[count];
            if(yDown){
                if(indexY<numRows-1){
                    indexY++;    
                }else{
                    indexY--;
                    yDown=false;
                }
            }else if(!yDown){
                if(indexY>0){
                    indexY--;
                }else{
                    indexY++;
                    yDown=true;
                }
            }
            
            if(!yDown){
                indexX++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String[] list : lists){
            for(String str : list){
                if(str!=null){
                    sb.append(str);
                }
            }
        }
        System.out.println(sb.toString());
    }

}
