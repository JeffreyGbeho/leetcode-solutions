// Last updated: 23/04/2026, 12:38:42
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
17    public TreeNode invertTree(TreeNode root) {
18        if (root != null) {
19            TreeNode temp = root.right;
20            root.right = root.left;
21            root.left = temp;
22            invertTree(root.left);
23            invertTree(root.right);
24        }
25
26        return root;
27    }
28}