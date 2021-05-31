//https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        char first = s.charAt(0);
        int count = 1;
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == first) count ++;
            else count--;
            
            if(count == 0) ans++;
        }
        return ans;
    }
}
