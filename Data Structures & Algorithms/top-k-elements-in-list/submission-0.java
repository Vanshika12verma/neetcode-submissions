class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int num : nums) {
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hs.get(a)-hs.get(b));
        for (int key : hs.keySet()) {
            pq.offer(key);
            if (pq.size()>k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for (int i=k-1; i>=0; i--) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
