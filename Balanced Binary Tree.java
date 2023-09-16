class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        int leftHeight = height(root.left); // Calculate the height of the left subtree
        int rightHeight = height(root.right); // Calculate the height of the right subtree
        
        // Check if the tree rooted at 'root' is balanced and the left and right subtrees are also balanced
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int height(TreeNode root) {
        if (root == null) {
            return 0; // Height of an empty tree is 0
        }
        
        int leftHeight = height(root.left); // Calculate the height of the left subtree
        int rightHeight = height(root.right); // Calculate the height of the right subtree
        
        // The height of the tree rooted at 'root' is the maximum of the left and right subtree heights plus 1
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
