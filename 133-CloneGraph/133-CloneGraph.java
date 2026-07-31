// Last updated: 30/07/2026, 22:23:36
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node clone = new Node(node.val);
        map.put(node, clone);

        ArrayList<Node> child = new ArrayList<>();
        for (Node neighbor : node.neighbors) {
            if (map.get(neighbor) == null) {
                child.add(cloneGraph(neighbor));
            } else {
                child.add(map.get(neighbor));
            }
        }

        clone.neighbors = child;

        return clone;
    }
}