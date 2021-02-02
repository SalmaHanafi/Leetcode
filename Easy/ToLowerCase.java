//https://leetcode.com/problems/to-lower-case/

class Solution {
    public String toLowerCase(String str) {
        for(int i =0; i<str.length(); i++){
            if((int)str.charAt(i) < 92 && (int) str.charAt(i)>64) 
                str =  str.substring(0,i)+ (char)((int)str.charAt(i) +32) +str.substring(i+1, str.length());
            
        }
        return str;
    }
}
