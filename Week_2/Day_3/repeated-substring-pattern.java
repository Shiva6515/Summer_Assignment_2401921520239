// Problem Name : Repeated Substring Pattern
// Problem Link : https://leetcode.com/problems/repeated-substring-pattern/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s1 = s+s;
        String c = s1.substring(1,s1.length()-1);
        return c.contains(s);
    }
}