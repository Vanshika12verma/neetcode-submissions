class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),visited);
        return ans;
    }
    public void backtrack(int[] nums, List<Integer> temp, boolean[] visited) {
        if (temp.size()==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            temp.add(nums[i]);
            backtrack(nums,temp,visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}
