// Last updated: 08/12/2025 14:24:32
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i = 0;
4        int j = numbers.length - 1;
5        int[] res;
6        while (i < j) {
7            if (numbers[j] == target - numbers[i]) {
8                res = new int[]{i+1, j+1};
9                return res;
10            } else if (numbers[j] > target - numbers[i]) {
11                j--;
12            } else {
13                i++;
14            }
15        }
16
17        return new int[2];
18    }
19}