//https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
	        String st;
	        
	        for(int i =0; i < strs.length; i++){
	            char charArray[] = strs[i].toCharArray();
	            Arrays.sort(charArray);
	             st = new String(charArray);
	            if(map.containsKey(st))
	            {
	                map.get(st).add(strs[i]); 
	                
	            }
	            else
	            {
	            	ArrayList<String> al = new ArrayList<String>();
	                map.put(st,al);
	                map.get(st).add(strs[i]);
	                
	            }
	        }
	        
	        List<List<String>> total = new ArrayList<List<String>>();

	       for (String key: map.keySet()) {
	        	   total.add(map.get(key));
	       
	           } 
    
    return total;}
}
