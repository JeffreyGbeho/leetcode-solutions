// Last updated: 30/07/2026, 22:23:22
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] res;
        while (i < j) {
            if (numbers[j] == target - numbers[i]) {
                res = new int[]{i+1, j+1};
                return res;
            } else if (numbers[j] > target - numbers[i]) {
                j--;
            } else {
                i++;
            }
        }

        return new int[2];
    }
}