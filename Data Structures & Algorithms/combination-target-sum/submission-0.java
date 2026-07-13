class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    private void solve(int[] nums, int target, int index, List<Integer> temp) {
        if (target==0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (index==nums.length || target<0) {
            return;
        }
        temp.add(nums[index]);
        solve(nums,target-nums[index],index,temp);
        temp.remove(temp.size()-1);
        solve(nums,target,index+1,temp);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        solve(nums,target,0, new ArrayList<>());
        return ans;
    }
}
