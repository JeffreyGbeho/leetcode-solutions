// Last updated: 30/07/2026, 22:23:14
class MyStack {
    Deque<Integer> stack;

    public MyStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */