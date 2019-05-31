package problems.gamestrat;

public class CoinGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] coins=getCoins();
        
        checkFirst(coins);
        checkLast(coins);

    }

    
    private static void checkLast(int[] coins) {
        // TODO Auto-generated method stub
        
    }


    private static void checkFirst(int[] coins) {
        
        int p1Score = 0;
        int p2Score = 0;
        int index1 = 0;
        int index2 = coins.length;
        
        p1Score = p1Score + coins[0];
        
        int turnCounter=0;
        while(index1!=index2) {
            if(turnCounter%2==0) {
                if(coins[index1]>coins[index2]) {
                
                    index1++;
                }else {
                    
                }
                
                
            }else {
                
            }
        }
        
    }
//    private static void addFirstCoin(int pScore, int[] coins) {
//        
//            pScore = pScore + coins[index1];
//            
//        }else {
//            pScore = pScore + coins[index2];
//            index2--;
//        }
//    }


    private static int[] getCoins() {
        int[] coins = {5,2,6,4,7,2,6,3,6,4};
        return coins;
    }
}
