//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i<= nums.length/2; i++){
            sum = nums[nums.length-(i+1)] + nums[i];
            max =  sum > max? sum:max;
        }
        return max;
        
    }
}
