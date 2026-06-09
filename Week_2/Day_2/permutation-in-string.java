// Problem Name : Permutation in String
// Problem Link : https://leetcode.com/problems/permutation-in-string/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int count = s1.length();
        for(int i=0,j=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(freq[ch-'a']>0){
                count--;
                //freq[ch-'a']--;
            }
            freq[ch-'a']--;
            if(count==0) return true;
           if(i-j+1 == s1.length()){
                char c = s2.charAt(j);
                if(freq[c-'a']>=0) count++;
                freq[c-'a']++;
                j++;
            }
            
        }
        return false;
    }
}
