// Last updated: 23/04/2026, 14:32:33
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> res = new ArrayList<>();
19        Deque<TreeNode> queue = new ArrayDeque<>();
20        if (root != null) {
21            queue.addLast(root);
22        }
23
24        while (!queue.isEmpty()) {
25            List<Integer> curr = new ArrayList<>();
26            Deque<TreeNode> child = new ArrayDeque<>();
27
28            while (!queue.isEmpty()) {
29                TreeNode node = queue.getFirst();
30                queue.removeFirst();
31                curr.add(node.val);
32                if (node.left != null) {
33                    child.addLast(node.left);
34                }
35                if (node.right != null) {
36                    child.addLast(node.right);
37                }
38            }
39
40            res.add(curr);
41            queue = child;
42        }
43
44        return res;
45    }
46}