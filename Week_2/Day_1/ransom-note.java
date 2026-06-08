// Problem Name : Ransom Note
// Problem Link : https://leetcode.com/problems/ransom-note/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            freq[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            if(freq[magazine.charAt(i)-'a']>0) freq[magazine.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}