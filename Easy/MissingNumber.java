//https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i <= nums.length; i++){
            map.put(i, 0);
        }
        for(int x =0; x<nums.length;x++){
            if(map.containsKey(nums[x])){
                map.put(nums[x],1);
            }
        }
        for(int key: map.keySet()) {
         if(map.get(key).equals(0)) {
             return key; 
    }
    }
    return 0;    
}
}
