// Problem Name : Is Subsequence
// Problem Link : https://leetcode.com/problems/is-subsequence/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int i=0,j=0;
        while(i<s.length()){
            if(s.charAt(i)!=t.charAt(j)){
                j++;
                
            }
            else{
                i++;
                j++;
            }
            if(j==t.length() && i!=s.length()) return false;

        }
        return true;
    }
}