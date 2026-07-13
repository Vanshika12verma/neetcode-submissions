class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char ch : tasks) {
            freq[ch-'A']++;
        }
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(f,maxFreq);
        }
        int maxCount = 0;
        for (int f : freq) {
            if (f==maxFreq) {
                maxCount++;
            }
        }
        return Math.max(tasks.length, (maxFreq-1) * (n+1) + maxCount);
    }
}
