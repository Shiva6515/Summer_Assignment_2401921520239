// Problem Name : Decode String
// Problem Link : https://leetcode.com/problems/decode-string/
// Difficulty   : Medium
// Language     : Java

class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int digit = 0;
        for(int i=0;i<s.length();i++){
            //char ch = 
            if(Character.isDigit(s.charAt(i))){
                digit = (digit*10)+(s.charAt(i)-'0');
            }
            else if(s.charAt(i)=='['){
                num.push(digit);
                str.push(sb);
                sb = new StringBuilder();
                digit = 0;
            }
            else if(s.charAt(i)==']'){
                StringBuilder ans = str.pop();
                int k = num.pop();
                for(int j=0;j<k;j++){
                    ans.append(sb);
                }
                sb = ans;
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}