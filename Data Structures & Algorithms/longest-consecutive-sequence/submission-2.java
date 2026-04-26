/*
I use a HashSet for O(1) lookups and only start counting when a number has no predecessor. 
This ensures each number is processed once, giving O(n) time.

Brute force (T, S) - O(n²) O(1)
Sort‑based (T, S) - O(n log n) O(1)
HashSet (T, S) - O(n) O(n)

*/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
}