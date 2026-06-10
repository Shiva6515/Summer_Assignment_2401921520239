// Problem Name : Find the Index of the First Occurrence in a String
// Problem Link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        int i=0,j=0,k=0;
        while(j<haystack.length()){
            if(needle.charAt(i)!=haystack.charAt(j)){
                k++;
                j=k;
                i=0;
                //continue;
            }
            else if(i==needle.length()-1 && needle.charAt(i)==haystack.charAt(j)) return k;
            else{
            i++;
            j++;
            }
        }
        return -1;
    }
}