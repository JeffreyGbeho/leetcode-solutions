// Last updated: 22/05/2026, 09:20:10
1class MyQueue {
2    Deque<Integer> stack1;
3    Deque<Integer> stack2;
4
5    public MyQueue() {
6        stack1 = new ArrayDeque<>();
7        stack2 = new ArrayDeque<>();
8    }
9    
10    public void push(int x) {
11        stack1.push(x);
12    }
13    
14    public int pop() {
15        while (stack1.size() > 0) {
16            stack2.push(stack1.pop());
17        }
18        int res = stack2.pop();
19        while (stack2.size() > 0) {
20            stack1.push(stack2.pop());
21        }
22
23        return res;
24    }
25    
26    public int peek() {
27        while (stack1.size() > 0) {
28            stack2.push(stack1.pop());
29        }
30        int res = stack2.peek();
31        while (stack2.size() > 0) {
32            stack1.push(stack2.pop());
33        }
34
35        return res;
36    }
37    
38    public boolean empty() {
39        return stack1.size() == 0;
40    }
41}
42
43/**
44 * Your MyQueue object will be instantiated and called as such:
45 * MyQueue obj = new MyQueue();
46 * obj.push(x);
47 * int param_2 = obj.pop();
48 * int param_3 = obj.peek();
49 * boolean param_4 = obj.empty();
50 */