//https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int difference = Integer.MAX_VALUE;
        
        HashMap<Integer,  int[]> map = new HashMap<>();
       for(int i =0; i < nums.length -1; i++){
           for(int j = i+1; j < nums.length; j++){
               map.put(nums[i]+nums[j], new int[]{i,j});
           }}
        int [] arr = new int[2];
        int temp = 0;
    for (Integer key : map.keySet()) {
        for(int k =0; k < nums.length; k++){
             arr = map.get(key);
             if(k == arr[0] || k == arr[1]){}
                 else{ 
                      if((key+nums[k]) - target == 0) return target; 
                      else if(Math.abs(target - (key+nums[k])) < difference) 
                      {
                          difference = Math.abs(target - (key+nums[k]));
                          temp = (key+nums[k]);
                      }
                } 
        }
    }
    return  temp;}}
