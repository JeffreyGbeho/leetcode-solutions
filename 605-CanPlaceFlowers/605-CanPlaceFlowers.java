// Last updated: 23/05/2025 21:25:45
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;

        if (l == 1) {
            if (flowerbed[0] == 0) {
                n--;
            }

            return n <= 0;
        }

        for (int i = 0; i < l; i++) {
            if (i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            } else if (i == l-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                n--;
            } else if (i > 0 && i < l-1 && flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }
}