package problems.binarytree;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTraversal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public List<List<Integer>> addChildNodes(TreeNode node, List<List<Integer>> topList, int level){
        
        if(topList.size()<=level){
            List<Integer> l = new ArrayList<Integer>();
            topList.add(l);
        }
        int nextLevel = level+1;
        if(level%2==0){
            topList.get(nextLevel).add(node.left.val);
            topList.get(nextLevel).add(node.right.val);
            
        }else{          
            topList.get(nextLevel).add(node.right.val);
            topList.get(nextLevel).add(node.left.val);
        }
        

        return topList;
    }
    
//    public void traverse(List<List<Integer>> topList, int level, TreeNode node){
//        int size=topList.get(level).size();
//        if(level%2==0){
//            for(int x=0; x<size; x++){
//                addChildNodes(topList.get(level).get(x).add(node.left));
//                addChildNodes(topList.get(level).get(x).add(node.right));
//            }   
//        }else{
//            for(int x=0; x<size; x++){
//                addChildNodes(topList.get(level).get(size-x).node.left);
//                addChildNodes(topList.get(level).get(size-x).node.right);
//            } 
//        }
//        traverse(topList,level+1);
//    }
}
