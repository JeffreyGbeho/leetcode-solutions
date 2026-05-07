// Last updated: 07/05/2026, 19:24:31
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
17    public int minDepth(TreeNode root) {
18        if (root == null) return 0;
19
20        if (root.left == null && root.right == null) {
21            return 1;
22        } else if (root.left != null && root.right != null) {
23            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
24        } else if (root.left != null) {
25            return minDepth(root.left) + 1;
26        } else if (root.right != null) {
27            return minDepth(root.right) + 1;
28        }
29
30        return 0;
31    }
32}