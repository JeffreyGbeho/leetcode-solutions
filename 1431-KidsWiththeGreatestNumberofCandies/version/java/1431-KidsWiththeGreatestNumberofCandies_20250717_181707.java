// Last updated: 17/07/2025 18:17:07
/*
 * O(n)
 * 
 * Find the greatest number.
 * Loop on the array to compare the greatest with the compute one
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = Integer.MIN_VALUE;
        for (int candy : candies) {
            m = Math.max(candy, m);
        }

        Boolean[] res = new Boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            res[i] = candies[i] + extraCandies >= m;
        }

        return Arrays.asList(res);
    }
}