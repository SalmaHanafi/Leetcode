//https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder answer = new StringBuilder();
        st.push(num.charAt(0));
        for (int i = 1; i < num.length(); i++) {
            //if (k == 0) break;   
            while ((!st.isEmpty() && st.peek() > num.charAt(i)) && k > 0) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }
        while (!st.isEmpty()) {
            answer.append(st.pop());
        }
        answer = answer.reverse();
        int i = 0;
        while (i < answer.length() && answer.charAt(i) == '0') {
            i++;
        }
        String ans = answer.substring(i);
        return "".equals(ans) ? "0" : ans;
        
    }
}
