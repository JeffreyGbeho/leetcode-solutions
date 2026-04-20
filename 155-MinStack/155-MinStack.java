// Last updated: 20/04/2026, 18:21:16
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
15        } else if (!min.isEmpty() && val < min.get(min.size() - 1)) {
16            min.add(val);
17        }
18    }
19    
20    public void pop() {
21        int v = values.get(values.size() - 1);
22        values.remove(values.size() - 1);
23
24        if (min.get(min.size() - 1) == v && !values.contains(v)) {
25            min.remove(min.size() - 1);
26        }
27    }
28    
29    public int top() {
30        return values.get(values.size() - 1);
31    }
32    
33    public int getMin() {
34        return min.get(min.size() - 1);
35    }
36}
37
38/**
39 * Your MinStack object will be instantiated and called as such:
40 * MinStack obj = new MinStack();
41 * obj.push(val);
42 * obj.pop();
43 * int param_3 = obj.top();
44 * int param_4 = obj.getMin();
45 */