// Last updated: 30/07/2026, 22:23:31
class LRUCache {
    int cap;
    Node head;
    Node tail;
    Map<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        tail = new Node();
        head = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node n = map.get(key);
        if (n != null) {
            removeNode(n.key);
            Node newNode = insertFront(n.key, n.val);
            map.put(key, newNode);

            return n.val;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if (map.get(key) != null) {
            Node del = map.get(key);
            removeNode(del.key);
            map.remove(del.key);
        } else if (cap == map.size()) {
            Node del = tail.prev;
            removeNode(del.key);
            map.remove(del.key);
        }

        Node newNode = insertFront(key, value);
        map.put(key, newNode);
    }

    private void removeNode(int key) {
        Node n = map.get(key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    private Node insertFront(int key, int value) {
        Node n = new Node(key, value);
        Node after = head.next;
        n.next = after;
        after.prev = n;
        head.next = n;
        n.prev = head;
        return n;
    }

    class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node () {}

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */