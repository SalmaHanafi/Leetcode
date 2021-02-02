//https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
          // List<Integer> list = new ArrayList<>();
   HashMap <Integer,Integer> map = new HashMap<>();
    for(int i =0; i< nums.length ;i++){
        // if(arr[i] == arr[i+1]) return arr[i];
        if(map.containsKey(nums[i])) return nums[i];
        else map.put(nums[i],1);
    }

    return 0;
    }
}
