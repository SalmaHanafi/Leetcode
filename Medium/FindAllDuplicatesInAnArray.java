//https://leetcode.com/problems/find-all-duplicates-in-an-array/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : nums) {
            int index = Math.abs(i);
           
            if(nums[index-1] < 0)
                list.add(index);
            nums[index-1] = -nums[index-1];
        }
        return list;
    }
}
