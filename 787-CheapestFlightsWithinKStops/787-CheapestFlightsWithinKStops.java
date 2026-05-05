// Last updated: 05/05/2026, 12:59:49
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        // 1. Initialiser les distances
4        int[] prices = new int[n];
5        Arrays.fill(prices, Integer.MAX_VALUE);
6        prices[src] = 0;
7
8        // 2. k+1 itérations
9        for (int i = 0; i <= k; i++) {
10            int[] temp = Arrays.copyOf(prices, n);
11
12            for (int[] flight : flights) {
13                int from = flight[0], to = flight[1], price = flight[2];
14                if (prices[from] != Integer.MAX_VALUE) {
15                    temp[to] = Math.min(temp[to], prices[from] + price);
16                }
17            }
18
19            prices = temp;
20        }
21
22        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
23    }
24}