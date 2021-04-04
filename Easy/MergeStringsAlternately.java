//https://leetcode.com/problems/merge-strings-alternately/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int loop = 0;
        if(word1.length() < word2.length()) loop = word1.length(); 
        else loop = word2.length();
        
        int i;
        for(i =0; i<loop ; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));  
        }
        
        if(word1.length() > i) str.append(word1.substring(i,word1.length())); 
        if(word2.length() > i) str.append(word2.substring(i,word2.length()));
        
        return str.toString();
    }
}
