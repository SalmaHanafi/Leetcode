//https://leetcode.com/problems/truncate-sentence/

class Solution {
    public String truncateSentence(String s, int k) {
        int index = 0;
        int count = 0;
    
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
                index = i;
            } 
            if(count == k) break;
        } 
        if(count < k) return s;

        return s.substring(0, index);
    }
}
