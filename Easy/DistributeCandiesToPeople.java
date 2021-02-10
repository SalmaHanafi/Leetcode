//https://leetcode.com/problems/distribute-candies-to-people/

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int n =1;
        outerloop:
        while(true){ 
            for(int i =0; i<num_people; i++){
                if(candies>=n) res[i] += n;
                else {
                    res[i] += candies;
                    break outerloop;}
                
                candies -= n;
                n++;
            }   
        }
        
        return res;
    }
}
