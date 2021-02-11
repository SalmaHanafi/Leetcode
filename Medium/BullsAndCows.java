//https://leetcode.com/problems/bulls-and-cows/

class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder s = new StringBuilder();
         StringBuilder g = new StringBuilder();
        int bulls=0;
        int cows=0;
        for(int i =0; i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                s.append(secret.charAt(i));
                g.append(guess.charAt(i));
            }
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j=0; j<s.length();j++){
            if(map.containsKey(s.charAt(j)))
                map.put(s.charAt(j), map.get(s.charAt(j))+1);
            else
                map.put(s.charAt(j),1);
        }
        for(int k=0;k<g.length();k++)
        {
           if(map.containsKey(g.charAt(k))){
               if(map.get(g.charAt(k))>=1)
               {
                   cows+=1;
                   map.put(g.charAt(k),map.get(g.charAt(k))-1);
               }
           }
            
        }
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }
}
