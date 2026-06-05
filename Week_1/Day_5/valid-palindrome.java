// Problem Name : Valid Palindrome
// Problem Link : https://leetcode.com/problems/valid-palindrome/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String s1 = sb.toString();
        if(s1.equals(s)){
            return true;
        }
        return false;
    }
}