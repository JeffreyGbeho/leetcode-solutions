// Last updated: 23/04/2026, 14:34:26
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
26            int size = queue.size();
27
28            for (int i = 0; i < size; i++) {
29                TreeNode node = queue.getFirst();
30                queue.removeFirst();
31                curr.add(node.val);
32                if (node.left != null) {
33                    queue.addLast(node.left);
34                }
35                if (node.right != null) {
36                    queue.addLast(node.right);
37                }
38            }
39
40            res.add(curr);
41        }
42
43        return res;
44    }
45}