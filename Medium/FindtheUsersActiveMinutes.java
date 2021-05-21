//https://leetcode.com/problems/finding-the-users-active-minutes/

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        for(int[] log : logs){
            if(!map.containsKey(log[0])){
                map.put(log[0], new HashSet<Integer>());
                map.get(log[0]).add(log[1]);
            }
            else
               map.get(log[0]).add(log[1]);      
        }
        
        for (Set<Integer> set : map.values()) 
            arr[set.size()-1]++;
		
        return arr;
    }
}
