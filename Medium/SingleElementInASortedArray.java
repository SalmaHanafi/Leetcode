//https://leetcode.com/problems/single-element-in-a-sorted-array/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0]; 
        if(nums[0] != nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        for(int i = 1; i < nums.length - 2; i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
        }
    return -1;}
}
