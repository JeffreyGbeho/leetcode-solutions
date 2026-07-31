// Last updated: 30/07/2026, 22:23:12
class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public MyQueue() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while (stack1.size() > 0) {
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while (stack2.size() > 0) {
            stack1.push(stack2.pop());
        }

        return res;
    }
    
    public int peek() {
        while (stack1.size() > 0) {
            stack2.push(stack1.pop());
        }
        int res = stack2.peek();
        while (stack2.size() > 0) {
            stack1.push(stack2.pop());
        }

        return res;
    }
    
    public boolean empty() {
        return stack1.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */