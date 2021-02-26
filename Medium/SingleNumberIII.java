//https://leetcode.com/problems/single-number-iii/

class Solution {
    public int[] singleNumber(int[] nums) {
       
            
        int [] answer = new int[2];
        //Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       
        Integer count; 
        for(int i = 0; i < nums.length; i++){
            
            if(map.containsKey(nums[i])){
                count = map.get(nums[i]);
                map.put(nums[i], count+1);
            }
            else{
                
            map.put(nums[i], 1);
            }
        }
        int i = 0;
        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                answer[i] = key;
                i++;
            }
            
        }
        return answer;
    }    
}
