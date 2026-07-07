class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> curr = new ArrayList<>();
            for (int i=0; i<levelSize; i++) {
                TreeNode currNode = q.poll();
                curr.add(currNode.val);
                if (currNode.left!=null) {
                    q.add(currNode.left);
                }
                if (currNode.right!=null) {
                    q.add(currNode.right);
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}
