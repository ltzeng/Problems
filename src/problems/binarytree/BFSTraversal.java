package problems.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeNode root = createTree();
        traverse(root);
        System.out.println("######");
        traverseLevelByLevel(root);
    }

    public static void traverse(TreeNode node) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(node);
        while(!queue.isEmpty()) {
            TreeNode n = queue.poll();
            System.out.println(n.val);
            if(n.left!=null) {
                queue.add(n.left);
            }
            if(n.right!=null) {
                queue.add(n.right);
            }
            
        }
    }
    
    public static void traverseLevelByLevel(TreeNode node) {
        
        if(node==null) {
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(node);
        
        
        while(true) {
            if(queue.isEmpty()) {
                return;
            }
            
            int counter = queue.size();
            String output="";
            while(counter>0) {
                TreeNode n = queue.poll();
                output=output + " " + n.val;
                counter--;
                if(n.left!=null)
                    queue.add(n.left);  
                if(n.right!=null)
                    queue.add(n.right);
                
            }
            System.out.println(output);
        }
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
    
    private static void traverse2(TreeNode node) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        
        while(!queue.isEmpty()) {
            
            TreeNode nodeInLine = queue.poll();
            if(nodeInLine.left!=null) {
                queue.add(nodeInLine.left);
            }
            if(nodeInLine.right!=null) {
                queue.add(nodeInLine.right);
            }
        }
        
    }
}
