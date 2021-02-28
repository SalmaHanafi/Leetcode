//https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        for(List<String> list: items){
            if((ruleKey.equals("color") && ruleValue.equals(list.get(1))) ||
               (ruleKey.equals("type") && ruleValue.equals(list.get(0)))  ||
               (ruleKey.equals("name") && ruleValue.equals(list.get(2)))) count++;

        }
          
        return count;
        
    }
}
