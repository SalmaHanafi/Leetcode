//https://leetcode.com/problems/climbing-stairs/

class Solution {
    HashMap<Integer, Integer> climbed = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if(n>2)
        {
         climbed.put(1,1);
         climbed.put(2,2);  
        }
        if (n==2){
            climbed.put(2,2);  
            return 2;
        }
        if (n==1){
            climbed.put(1,1);
            return 1;
        }
        if(climbed.containsKey(n-1) && climbed.containsKey(n-2))
        {
            int x = climbed.get(n-1) + climbed.get(n-2);
            climbed.put(n,x);
            return  x;
        }
        else if (climbed.containsKey(n-2))
        {
            int c = climbStairs(n-1);
            return climbed.get(n-2) + c;
        }
        
        else{
            int c = climbStairs(n-2);
            climbed.put(n-2,c);
             int x2 = climbStairs(n-1);
            return  x2 + c;
        }
       
           
        
    }

}
