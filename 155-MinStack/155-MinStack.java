// Last updated: 20/04/2026, 17:56:06
1class MinStack {
2    List<Integer> values;
3
4    public MinStack() {
5        values = new ArrayList<>();
6    }
7    
8    public void push(int val) {
9        values.add(val);
10    }
11    
12    public void pop() {
13        values.remove(values.size() - 1);
14    }
15    
16    public int top() {
17        return values.get(values.size() - 1);
18    }
19    
20    public int getMin() {
21        return Collections.min(values);
22    }
23}
24
25/**
26 * Your MinStack object will be instantiated and called as such:
27 * MinStack obj = new MinStack();
28 * obj.push(val);
29 * obj.pop();
30 * int param_3 = obj.top();
31 * int param_4 = obj.getMin();
32 */