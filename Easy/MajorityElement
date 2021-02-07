//https://leetcode.com/problems/majority-element/submissions/


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for(int i =0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                count = map.get(nums[i]);
                map.put(nums[i], count+1);
            }
            else map.put(nums[i], 1);
        }

        for(Integer key : map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }          
        }
            
   return -1; }
}
