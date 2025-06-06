// Last updated: 23/05/2025 21:25:29
class Solution {
    public int countElements(int[] arr) {
        int total = 0;
        Set<Integer> mySet = new HashSet<>();
        for (int num : arr) {
            mySet.add(num);
        }
        
        for (int i = 0; i < arr.length; i++) {
            total += mySet.contains(arr[i] + 1) ? 1 : 0;
        }
        
        return total;
    }
}