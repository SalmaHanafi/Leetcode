//https://leetcode.com/problems/maximum-69-number/

class Solution {
    public int maximum69Number (int num) {
        StringBuilder number = new StringBuilder(Integer.toString(num));
        for(int i = 0; i< number.length(); i++){
            if(number.charAt(i) != '9'){
                number.setCharAt(i, '9');
                return Integer.parseInt(number.toString());
            }
        }
        return Integer.parseInt(number.toString());
    }
}
