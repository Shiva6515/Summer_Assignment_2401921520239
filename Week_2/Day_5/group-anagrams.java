// Problem Name : Group Anagrams
// Problem Link : https://leetcode.com/problems/group-anagrams/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] str  = s.toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}