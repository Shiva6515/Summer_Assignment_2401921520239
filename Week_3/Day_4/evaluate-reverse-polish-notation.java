class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int num1 = st.pop();
                int num2 = st.pop();
                if(ch.equals("+")) result = (num1+num2);
                else if(ch.equals("-")) result = num2-num1;
                else if(ch.equals("*")) result = num1*num2;
                else result = num2/num1;
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}