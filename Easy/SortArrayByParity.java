//https://leetcode.com/problems/sort-array-by-parity/

class Solution {
   public int[] sortArrayByParity(int[] A) {
        
    if(A.length == 1){
        return A;
    }
        int temp;
        int backCount = A.length -1;
        for(int i =0; i < backCount; i++){
            if(A[i] % 2 != 0){
                while(A[backCount] % 2 != 0 && backCount >i){
                    backCount--;
                }
                temp = A[backCount];
                A[backCount] = A[i];
                A[i] = temp;
            }
        }
    return A;}
}
