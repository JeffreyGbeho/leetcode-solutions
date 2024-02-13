        } 
        return -1;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if ((m + n) % 2 == 0) {
            return nums2[p2++];
        } else if (p2 < nums2.length) {
            return nums1[p1++];
        } else if (p1 < nums1.length) {
        if (p1 < nums1.length && p2 < nums2.length) {
            return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
    private int getMin(int[] nums1, int[] nums2) {
class Solution {
    private int p1 = 0, p2 = 0;

    
[1,3]
