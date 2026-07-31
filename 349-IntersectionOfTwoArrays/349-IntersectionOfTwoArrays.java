// Last updated: 30/07/2026, 22:22:56
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s2 = new HashSet<>();
        for (int num : nums2) {
            s2.add(num);
        }

        Set<Integer> res = new HashSet<>();
        for (int num : nums1) {
            if (s2.contains(num)) res.add(num);
        }

        List<Integer> t = new ArrayList<>(res);

        int[] ans = new int[res.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = t.get(i);
        }

        return ans;
    }
}