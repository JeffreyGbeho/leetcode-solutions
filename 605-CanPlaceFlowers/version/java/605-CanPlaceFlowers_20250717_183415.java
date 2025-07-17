// Last updated: 17/07/2025 18:34:15
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean l = (i == 0) || (flowerbed[i - 1] == 0);
                boolean r = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                if (l && r) {
                    flowerbed[i] = 1;
                    c++;
                }
            }
        }

        return c >= n;
    }
}