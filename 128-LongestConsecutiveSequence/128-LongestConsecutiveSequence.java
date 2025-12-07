// Last updated: 07/12/2025 11:30:05
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if (nums.length == 0) {
4            return 0;
5        }
6        
7        Set<Integer> numSet = new HashSet<>();
8        for (int num : nums) {
9            numSet.add(num);
10        }
11
12        int longestStreak = 0;
13
14        for (int num : numSet) {
15            // Check if 'num' is the start of a sequence
16            if (!numSet.contains(num - 1)) {
17                int currentNum = num;
18                int currentStreak = 1;
19                
20                // Count how long the streak is
21                while (numSet.contains(currentNum + 1)) {
22                    currentNum++;
23                    currentStreak++;
24                }
25                
26                longestStreak = Math.max(longestStreak, currentStreak);
27            }
28        }
29        
30        return longestStreak;
31    }
32}