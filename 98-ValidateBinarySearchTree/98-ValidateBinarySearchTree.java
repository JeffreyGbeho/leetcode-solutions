// Last updated: 23/04/2026, 15:14:41
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
17    public boolean isValidBST(TreeNode root) {
18        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
19    }
20
21    private boolean isValid(TreeNode root, long min, long max) {
22        if (root == null) {
23            return true;
24        }
25
26        if (min < root.val && root.val < max) {
27            return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
28        }
29
30        return false;
31    }
32}