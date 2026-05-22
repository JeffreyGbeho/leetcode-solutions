// Last updated: 22/05/2026, 09:52:01
1class MyStack {
2    Deque<Integer> stack;
3
4    public MyStack() {
5        stack = new ArrayDeque<>();
6    }
7    
8    public void push(int x) {
9        stack.push(x);
10    }
11    
12    public int pop() {
13        return stack.pop();
14    }
15    
16    public int top() {
17        return stack.peek();
18    }
19    
20    public boolean empty() {
21        return stack.size() == 0;
22    }
23}
24
25/**
26 * Your MyStack object will be instantiated and called as such:
27 * MyStack obj = new MyStack();
28 * obj.push(x);
29 * int param_2 = obj.pop();
30 * int param_3 = obj.top();
31 * boolean param_4 = obj.empty();
32 */