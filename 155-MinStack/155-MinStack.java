// Last updated: 20/04/2026, 18:30:02
1class MinStack {
2    List<Integer> values;
3    List<Integer> min;
4    Map<Integer, Integer> map;
5
6    public MinStack() {
7        values = new ArrayList<>();
8        min = new ArrayList<>();
9        map = new HashMap<>();
10    }
11    
12    public void push(int val) {
13        values.add(val);
14        map.put(val, map.getOrDefault(val, 0) + 1);
15
16        if (min.isEmpty()) {
17            min.add(val);
18        } else if (!min.isEmpty() && val < min.get(min.size() - 1)) {
19            min.add(val);
20        }
21    }
22    
23    public void pop() {
24        int v = values.get(values.size() - 1);
25        values.remove(values.size() - 1);
26
27        map.put(v, map.get(v) - 1);
28        if (map.get(v) == 0) {
29            map.remove(v);
30        }
31
32        if (min.get(min.size() - 1) == v && map.get(v) == null) {
33            min.remove(min.size() - 1);
34        }
35    }
36    
37    public int top() {
38        return values.get(values.size() - 1);
39    }
40    
41    public int getMin() {
42        return min.get(min.size() - 1);
43    }
44}
45
46/**
47 * Your MinStack object will be instantiated and called as such:
48 * MinStack obj = new MinStack();
49 * obj.push(val);
50 * obj.pop();
51 * int param_3 = obj.top();
52 * int param_4 = obj.getMin();
53 */