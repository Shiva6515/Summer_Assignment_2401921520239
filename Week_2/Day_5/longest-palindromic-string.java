// Problem Name : Longest Palindromic String
// Problem Link : https://leetcode.com/problems/longest-palindromic-substring/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public String longestPalindrome(String s) {
        int max = 1;
        String maxString = s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+max ; j<=s.length();j++){
                if(j-i>max && isPalindrome(s.substring(i,j))){
                    max = j-i;
                    maxString = s.substring(i,j);
                }
            }
        }
        return maxString;
    }

    public boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}