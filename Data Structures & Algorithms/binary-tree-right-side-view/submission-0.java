class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i=0; i<levelSize; i++) {
                TreeNode curr = q.poll();
                if (i==levelSize-1) {
                    ans.add(curr.val);
                }
                if (curr.left!=null) {
                    q.add(curr.left);
                }
                if (curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}
