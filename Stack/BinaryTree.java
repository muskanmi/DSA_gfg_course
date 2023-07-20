package Stack;

import javax.swing.tree.TreeNode;

public class BinaryTree {

    static class TreeNode {
     
        // Stores data value of a node
        int data;
     
        // Stores left subtree
        // of a tree node
        TreeNode left;
     
        // Stores right subtree
        // of a tree node
        TreeNode right;
     
        // Initialization of
        // a tree node
        TreeNode(int val)
        {
            // Update data
            data = val;
     
            // Update left and right
            left = right = null;
        }
    };
     
    // Function to check if a binary tree
    // is binary search tree or not
    static boolean checkTreeIsBST(TreeNode root)
    {
        // Stores root node and left
       // subtree of each node
        Stack<TreeNode > Stack = new Stack<TreeNode >();
         
        // Stores previous visited node
        TreeNode prev = null;
         
        // Traverse the binary tree
        while (!Stack.isEmpty() ||
                   root != null) {
     
            // Traverse left subtree
            while (root != null) {
     
                // Insert root into Stack
                Stack.add(root);
     
                // Update root
                root = root.left;
            }
     
            // Stores top element of Stack
            root = Stack.peek();
     
            // Remove the top element of Stack
            Stack.pop();
     
            // If data value of root node less
            // than data value of left subtree
            if(prev != null &&
                   root.data <= prev.data) {
                return false;
            }
     
            // Update prev
            prev = root;
     
            // Traverse right subtree
            // of the tree
            root = root.right;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
    root.left = new TreeNode(6);
    root.right = new TreeNode(10);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(7);
    root.right.right = new TreeNode(11);
    root.left.left.left = new TreeNode(3);
    root.left.left.right = new TreeNode(5);
    root.left.right.right = new TreeNode(8);
     
    if (checkTreeIsBST(root)) {
        System.out.print("YES");
    }
    else {
        System.out.print("NO");
    }
    }
}
