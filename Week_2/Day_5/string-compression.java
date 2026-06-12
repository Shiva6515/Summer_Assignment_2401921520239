// Problem Name : String Compression
// Problem Link : https://leetcode.com/problems/string-compression/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public int compress(char[] chars) {
        int idx = 0, i = 0;
        while(i<chars.length){
            char ch = chars[i];
            int count = 0;
            while(i<chars.length && chars[i]==ch){
                i++;
                count++;
            }
            chars[idx] = ch;
            idx++;
            if(count>1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[idx] = c;
                    idx++;
                }
            }
        }
        return idx;
    }
}