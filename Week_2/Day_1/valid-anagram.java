// Problem Name : Valid Anagram
// Problem Link : https://leetcode.com/problems/valid-anagram/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;

        //HashMap implementation of the same problem

        /*HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count = 0;
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),++count);
            }
            else{
                count=map.get(s.charAt(i));
                map.put(s.charAt(i),++count);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            else{
                if(map.get(t.charAt(i))==1) map.remove(t.charAt(i));
                else{
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
            }
        }
        if(map.isEmpty()) return true;
        return false;*/
    }
}