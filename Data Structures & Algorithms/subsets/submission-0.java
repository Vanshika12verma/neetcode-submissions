class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    private void solve(int[] nums, int index, List<Integer> temp) {
        if (index==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        solve(nums,index+1,temp);
        temp.remove(temp.size()-1);
        solve(nums,index+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0,new ArrayList<>());
        return ans;
    }
}
