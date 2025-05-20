// Last updated: 20/05/2025 23:23:19
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> l1 = new HashSet<>();
        Set<Integer> l2 = new HashSet<>();

        List<Integer> n1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> n2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < nums1.length; i++) {
            if (!n2.contains(nums1[i])) {
                l1.add(nums1[i]);
            } 
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!n1.contains(nums2[i])) {
                l2.add(nums2[i]);
            }
        }
        

        List<List<Integer>> res = new ArrayList<>();
        res.add(List.copyOf(l1));
        res.add(List.copyOf(l2));
        return res;
    }
}