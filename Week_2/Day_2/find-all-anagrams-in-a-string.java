// Problem Name : Find All Anagrams in a String
// Problem Link : https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()>s.length()) return list;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            //int count = 0;
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }int count = map.size();
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(map.containsKey(ch)) {
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) count--;
            }
            if(j-i+1 == p.length()){
                if(count==0) list.add(i);
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    if(map.get(c)==0) count++;
                    map.put(c,map.get(c)+1);
                }
                i++;
            }    
        }
        return list;
    }
}