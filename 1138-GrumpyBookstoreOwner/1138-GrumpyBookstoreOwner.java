// Last updated: 30/07/2026, 22:22:08
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int cust = 0;
        for (int i = 0; i < customers.length; i++) { 
            if (grumpy[i] == 0) {
                cust += customers[i];
            }
        }

        int m = cust;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                m += customers[i];
            }
        }
        cust = Math.max(cust, m);

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) m += customers[i];
            if (grumpy[i-minutes] == 1) m -= customers[i-minutes];

            cust = Math.max(cust, m);
        }

        return cust;
    }
}