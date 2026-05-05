class Solution {
    public int findMax(int[] nums) {
        int max = nums[0];
        
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }
        
        return max;
    }
}
