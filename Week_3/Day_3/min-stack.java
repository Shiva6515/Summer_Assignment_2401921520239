class MinStack {
    Stack<Integer> stack,minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
            return;
        }
        stack.push(val);
        if(val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int val=stack.pop();
        if(val==minStack.peek()) minStack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }
    
    public int getMin() {
        if(stack.isEmpty()) return -1;
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */