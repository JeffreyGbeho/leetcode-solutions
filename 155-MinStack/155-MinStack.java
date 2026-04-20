// Last updated: 20/04/2026, 18:36:42
1class MinStack {
2    List<Integer> values;
3    List<Integer> min;
4
5    public MinStack() {
6        values = new ArrayList<>();
7        min = new ArrayList<>();
8    }
9    
10    public void push(int val) {
11        values.add(val);
12
13        if (min.isEmpty()) { 
14            min.add(val);
15        } else {
16            min.add(Math.min(min.get(min.size() - 1), val));
17        }
18    }
19    
20    public void pop() {
21        values.remove(values.size() - 1);
22
23        min.remove(min.size() - 1);
24    }
25    
26    public int top() {
27        return values.get(values.size() - 1);
28    }
29    
30    public int getMin() {
31        return min.get(min.size() - 1);
32    }
33}
34
35/**
36 * Your MinStack object will be instantiated and called as such:
37 * MinStack obj = new MinStack();
38 * obj.push(val);
39 * obj.pop();
40 * int param_3 = obj.top();
41 * int param_4 = obj.getMin();
42 */