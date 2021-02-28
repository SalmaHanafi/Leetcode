//https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(nums[0]);
            return list;
        }
        if(nums.length == 2 && nums[0] != nums[1]){
            list.add(nums[0]);
            list.add(nums[1]);
            return list;
        }
        Arrays.sort(nums);
        int count = 0;
        
        for(int i =0; i < nums.length; i++){
            count ++;
            if((count > nums.length/3) && (list.contains(nums[i])== false)){
                list.add(nums[i]);
            }
            
            if(i == nums.length-1){
                if(nums[i] != nums[nums.length-1]){
                count =0;
                    }
            }
            else if(nums[i] != nums[i+1]){
                count = 0;
            }
            
            
            }
       return list; }
    }
