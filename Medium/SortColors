//https://leetcode.com/problems/sort-colors/

class Solution{
    private int getOccurences(int[] arr, int x){
        int sum =0;
        for(int i : arr){
            if(i==x) sum++;
        }
        return sum;
    }
    public void sortColors(int[] nums) {
        int zeroes = getOccurences(nums, 0);
        int ones = getOccurences(nums, 1);
        int twos = getOccurences(nums, 2);
        int i;
        for( i =0; i< zeroes; i++){
            nums[i] = 0;
        }
        for(i=zeroes; i < zeroes+ones; i++){
            nums[i] = 1;
        }
        for(i = zeroes+ones; i<nums.length; i++){
            nums[i] = 2;
        }
    }
}
