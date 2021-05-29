//https://leetcode.com/problems/replace-all-digits-with-characters/submissions/

class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i<s.length(); i=i+2){
            sb.setCharAt(i, (char)(Character.getNumericValue(s.charAt(i)) + (int) s.charAt(i-1)));
        }
        return sb.toString();  
    }
}

  // for(int i = 1; i<s.length(); i=i+2){
  //           char rep = (char)(Character.getNumericValue(s.charAt(i)) + (int) s.charAt(i-1));
  //           s = s.substring(0,i) + rep + s.substring(i+1,s.length());
  //       }
  //       return s;
