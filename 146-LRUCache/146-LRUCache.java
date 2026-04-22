// Last updated: 22/04/2026, 14:01:04
1class LRUCache {
2    int cap;
3    Node head;
4    Node tail;
5    Map<Integer, Node> map = new HashMap<>();
6
7    public LRUCache(int capacity) {
8        cap = capacity;
9        tail = new Node();
10        head = new Node();
11        head.next = tail;
12        tail.prev = head;
13    }
14    
15    public int get(int key) {
16        Node n = map.get(key);
17        if (n != null) {
18            removeNode(n.key);
19            Node newNode = insertFront(n.key, n.val);
20            map.put(key, newNode);
21
22            return n.val;
23        }
24
25        return -1;
26    }
27    
28    public void put(int key, int value) {
29        if (map.get(key) != null) {
30            Node del = map.get(key);
31            removeNode(del.key);
32            map.remove(del.key);
33        } else if (cap == map.size()) {
34            Node del = tail.prev;
35            removeNode(del.key);
36            map.remove(del.key);
37        }
38
39        Node newNode = insertFront(key, value);
40        map.put(key, newNode);
41    }
42
43    private void removeNode(int key) {
44        Node n = map.get(key);
45        n.prev.next = n.next;
46        n.next.prev = n.prev;
47    }
48
49    private Node insertFront(int key, int value) {
50        Node n = new Node(key, value);
51        Node after = head.next;
52        n.next = after;
53        after.prev = n;
54        head.next = n;
55        n.prev = head;
56        return n;
57    }
58
59    class Node {
60        int key;
61        int val;
62        Node next;
63        Node prev;
64
65        Node () {}
66
67        Node(int key, int val) {
68            this.key = key;
69            this.val = val;
70        }
71    }
72}
73
74/**
75 * Your LRUCache object will be instantiated and called as such:
76 * LRUCache obj = new LRUCache(capacity);
77 * int param_1 = obj.get(key);
78 * obj.put(key,value);
79 */