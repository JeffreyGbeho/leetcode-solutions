// Last updated: 23/05/2025 21:26:22
class Solution {
    public int maxArea(int[] height) {
        int l = height.length;
        int count = 0;
        int i = 0;
        int j = l-1;

        while (i < j) {
            count = Math.min(height[j], height[i]) * (j - i) > count ? Math.min(height[j], height[i]) * (j - i) : count;
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}