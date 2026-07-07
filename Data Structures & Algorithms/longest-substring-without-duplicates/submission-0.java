class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0, left=0;
        HashSet<Character> hs = new HashSet<>();
        for (int right=0; right<s.length(); right++) {
            while (hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
