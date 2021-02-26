//https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        
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
        for( Integer key : map.keySet()){
            if(map.get(key) == 1){
                answer = key;
            }
            
        }
        return answer;
    }
    }
