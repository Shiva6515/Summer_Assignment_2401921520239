// Problem Name : Longest Substring Without Repeating Characters
// Problem Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0,j=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=j){
                j = map.get(ch)+1;
            }
            map.put(ch,i);
            count = Math.max(count,i-j+1);
        }
        return count;
    }
}