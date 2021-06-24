//https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size =0;
        int counter =0;
        
        for(int x =0; x < nums.length; x=x+2){
            size += nums[x];
        }
        
        int[] ans = new int[size];
        for(int i = 1; i < nums.length; i=i+2){
            for(int j = 0; j < nums[i-1]; j++){
                ans[counter++] = nums[i];
            }
        }
       
        return ans; 
    }
}
