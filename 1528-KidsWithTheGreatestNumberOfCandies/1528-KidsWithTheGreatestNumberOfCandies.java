// Last updated: 23/05/2025 19:23:29
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l = candies.length; 
        Boolean[] res = new Boolean[l];
        
        for (int i = 0; i < l; i++) {
            res[i] = true;
            int temp = candies[i] + extraCandies;

            for (int candy : candies) {
                if (temp < candy) {
                    res[i] = false;
                }
            }
        }

        return Arrays.asList(res);
    }
}