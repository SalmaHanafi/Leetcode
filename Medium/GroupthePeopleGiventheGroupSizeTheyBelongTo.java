//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i<groupSizes.length; i++){
            List<Integer> list = new ArrayList();
            if(groupSizes[i] == 1) list.add(i);
            else{
                if(groupSizes[i] > 0){
                    list.add(i);
                    int j = i+1;
                    while(list.size()<groupSizes[i] && j<groupSizes.length ){
                        if(groupSizes[i] == groupSizes[j]){
                            list.add(j);
                            groupSizes[j] = groupSizes[j]*-1;
                        }
                        j++;
                    } 
                }
            }
            if(list.size()>0) ans.add(list);
        }
        return ans;
    }
}
