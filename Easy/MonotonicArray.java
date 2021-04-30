//https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length <= 1)
            return true;
        int sign = A[1] - A[0];
        int inSign = 0;
        for(int i =1; i<A.length-1; i++){
          
            inSign = A[i+1] - A[i]; 
            if(sign == 0){
                sign = inSign;
            }
            
            if((sign>0 && inSign < 0) || (sign<0 && inSign>0) )
                return false;
        }
        return true;
    }
}
