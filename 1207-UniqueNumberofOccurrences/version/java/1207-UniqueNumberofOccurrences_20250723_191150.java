// Last updated: 23/07/2025 19:11:50
/*
 * O(n)
 * 
 * map and set
*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occ = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            occ.put(arr[i], occ.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> r = new HashSet<>();

        for (Integer key : occ.keySet()) {
            r.add(occ.get(key));
        }

        return occ.size() == r.size();
    }
}