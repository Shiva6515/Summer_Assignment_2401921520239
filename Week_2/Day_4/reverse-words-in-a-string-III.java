// Problem Name : Reverse Words in a String III
// Problem Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Difficulty   : Easy
// Language     : Java

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                while(!st.isEmpty()){
                    char ch = st.pop();
                    sb.append(ch);
                }
                sb.append(' ');
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            char ch = st.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
}