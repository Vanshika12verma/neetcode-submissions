class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public int height(TreeNode root) {
        if (root==null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int dia = lh+rh+1;
        diameter = Math.max(diameter, dia);
        return Math.max(lh,rh)+1;
    }
}
