//https://leetcode.com/problems/make-the-string-great/

class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder();
        if(s.length()==1) return s;
        int i;
        
        for(i = 0; i < s.length()-1; i++){                
                if((int) s.charAt(i) != (int) s.charAt(i+1) - 32 && (int) s.charAt(i+1) != (int) s.charAt(i)-32) {
                    if(str.length() >0){
                    if((int)s.charAt(i) == (int) str.charAt(str.length()-1) -32 || (int)s.charAt(i)-32 == (int)                               str.charAt(str.length()-1)){
                        str.deleteCharAt(str.length()-1);
                    }
                    else  str.append(s.charAt(i));
                   
                }
                else str.append(s.charAt(i));
                }
                  else i++;
                
              }
            if(i==s.length()-1){
                
            if(str.length() >0){
                    if((int)s.charAt(i) == (int) str.charAt(str.length()-1) -32 || (int)s.charAt(i)-32 == (int)                               str.charAt(str.length()-1)){
                        str.deleteCharAt(str.length()-1);
                    }
                    else  str.append(s.charAt(i));
                }
            else str.append(s.charAt(i));} 
            
            return str.toString();
        }
          
        
        }
