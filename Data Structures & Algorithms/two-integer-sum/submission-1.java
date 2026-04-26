class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <2 || nums.length > 1000)
          return null;

        if(target < -10000000 || target > 10000000){
                return null;
        }  

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < -10000000 || nums[i] > 10000000){
                return null;
            }
            
            for(int j = 0; j < nums.length ; j++){
                if(i==j)
                continue;


                if(nums[i] + nums[j] == target){
                    return i < j ? new int[] {i, j} : new int[] {j, i};
                }

            }
        }
        return null;
    }
}
