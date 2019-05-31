package maps;

import domain.Node;

public class BinaryTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        int[] coins = {5,2,6,4,7,2,6,3,6,4,1,2,4,5,3,6,1,2};
        int[] coins = {5,2,6,4,7,8};
        
        Node root = new Node(coins[0]);
        generateBinaryTree(root, coins, 1, coins.length-1);
        
        Node blank = root;
        while(blank.getLeft()!=null) {
            System.out.println(blank.getLeft().getValue());
            blank = blank.getLeft();
        }
        
        searchMaxValue(root);
    }

    
    private static void searchMaxValue(Node root) {

        
    }


    private static void generateBinaryTree(Node root, int[] coins, int index1, int index2) {

        
        if(index1!=index2) {
            
            Node left = new Node(coins[index1]);
            Node right = new Node(coins[index2]);
            root.setLeft(left);
            root.setRight(right);
            
            int leftIndex=index1+1;
            generateBinaryTree(left, coins, leftIndex, index2);
            int rightIndex=index2-1;
            generateBinaryTree(right, coins, index1, rightIndex);
        }
        
        
    }



    private static int[] getCoins() {
        int[] coins = {5,2,6,4,7,2,6,3,6,4,1,2,4,5,3,6,1,2};
        return coins;
    }
}
