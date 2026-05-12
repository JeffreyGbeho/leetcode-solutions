// Last updated: 12/05/2026, 08:37:04
1class Solution {
2    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
3        int cust = 0;
4        for (int i = 0; i < customers.length; i++) { 
5            if (grumpy[i] == 0) {
6                cust += customers[i];
7            }
8        }
9
10        int m = cust;
11        for (int i = 0; i < minutes; i++) {
12            if (grumpy[i] == 1) {
13                m += customers[i];
14            }
15        }
16        cust = Math.max(cust, m);
17
18        for (int i = minutes; i < customers.length; i++) {
19            if (grumpy[i] == 1) m += customers[i];
20            if (grumpy[i-minutes] == 1) m -= customers[i-minutes];
21
22            cust = Math.max(cust, m);
23        }
24
25        return cust;
26    }
27}