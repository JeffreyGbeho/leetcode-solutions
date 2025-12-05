// Last updated: 05/12/2025 12:19:18
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        // Set<Integer> occ = new HashSet<>();
4        
5        // for (int num : nums) {
6        //     if (occ.contains(num)) {
7        //         return true;
8        //     }
9
10        //     occ.add(num);
11        // }
12
13        // return false;
14
15        Set<Integer> targetSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
16        return !(nums.length == targetSet.size());
17    }
18}