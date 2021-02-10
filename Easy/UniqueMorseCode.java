//https://leetcode.com/problems/unique-morse-code-words/


class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       
        String[] morseMap = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<String> list = new ArrayList<>();
        
        for(String word : words){
            StringBuilder str = new StringBuilder(); 

            for(int i=0; i<word.length();i++){
                str.append(morseMap[((int) word.charAt(i)) - 97]);
                
            }  
            if(!list.contains(str.toString())) list.add(str.toString());
                 

        }
      
        return list.size();
    }
    
}
