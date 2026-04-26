class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicatesMap = new HashMap<>();
        Integer countAti = -1;
        for(int i=0; i< nums.length; i++){
            countAti = duplicatesMap.get(nums[i]);
            if (countAti != null && countAti >= 0)
                duplicatesMap.put(nums[i], ++countAti);
            else {
                countAti = 1;
                duplicatesMap.put(nums[i], countAti);
            }

            if(countAti > 1)
             return true;

        }
        return false;
        
    }
}