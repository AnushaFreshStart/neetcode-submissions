// class Solution {
//     public int longestConsecutive(int[] nums) {
//         // sort array, remove duplicaTreeSet
//         Set<Integer> sortedNums = Arrays.sort(nums);

//         // find consecutive sequences, in that what is longest?
//         String consequetiveStr;
//         for(Integer num : sortedNums){
            


//         }

//     }
// }

/*
Time: O(n log n) (due to sort)
Space: O(1)
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }
        return Math.max(longest, current);
    }
}
