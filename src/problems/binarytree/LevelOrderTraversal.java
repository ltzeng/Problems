package problems.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TreeNode root = createTree();
        List<List<Integer>> topList = new ArrayList<List<Integer>>();
        if(root==null) {
            System.out.println(topList);
            return;
        }
        
        int level=0;
        topList = traverse(root, topList, level);
            
        
        System.out.println(topList);
    }

    public static List<List<Integer>> traverse(TreeNode node, List<List<Integer>> topList, int level){
        
        if(topList.size()<=level){
            List<Integer> l = new ArrayList<Integer>();
            l.add(node.val);
            topList.add(l);
        }else{
            topList.get(level).add(node.val);
        }
        
        int nextLevel = level+1;
        if(node.left!=null){
            topList = traverse(node.left, topList, nextLevel);
        }
        if(node.right!=null){
            topList = traverse(node.right, topList, nextLevel);
        }
        
        return topList;
    }
    
    private static TreeNode createTree() {
        
        TreeNode root = new TreeNode(3);
        TreeNode branch1 = new TreeNode(9);
        TreeNode branch2 = new TreeNode(20);
        TreeNode branch3 = new TreeNode(15);
        TreeNode branch4 = new TreeNode(7);
        
        root.left=branch1;
        root.right=branch2;
        branch2.left=branch3;
        branch2.right=branch4;
        
        
        return root;
    }
}
