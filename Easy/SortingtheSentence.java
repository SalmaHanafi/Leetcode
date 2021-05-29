//https://leetcode.com/problems/sorting-the-sentence/

class Solution {
    public String sortSentence(String s) {

        List<String> result = new ArrayList<String>(Arrays.asList(s.split(" ")));
        String[] arr = new String[result.size()];
        String word = "";
        for(int i = 0; i<result.size(); i++){
           word = result.get(i);
           arr[Character.getNumericValue(word.charAt(word.length()-1))-1] = word.substring(0,word.length()-1);
        }
        
        return String.join(" ", arr);
    }
}
