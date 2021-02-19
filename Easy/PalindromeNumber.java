//https://leetcode.com/problems/palindrome-number/

class Solution {
public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        
        int j = temp.length()-1;
        for(int i=0; i<temp.length()/2; i++){
            if(temp.charAt(i) != temp.charAt(j)) return false;
            j--;
        }
        
        return true;
    }
}
