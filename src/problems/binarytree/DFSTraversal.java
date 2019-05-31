package problems.binarytree;

import java.util.Stack;

public class DFSTraversal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TreeNode root = generateTree();

        if(root==null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);
        
        traverse(stack);
    }

    private static void traverse(Stack<TreeNode> stack) {

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            
            if(node.left!=null) {
                stack.add(node.left);
            }
            traverse(stack);
            
            if(node.right!=null) {
                stack.add(node.right);
            }
            traverse(stack);
        }
    }

    private static TreeNode generateTree() {
        
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
