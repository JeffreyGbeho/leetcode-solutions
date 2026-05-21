// Last updated: 21/05/2026, 11:13:19
1class Solution {
2    public String fractionToDecimal(int numerator, int denominator) {
3        Map<Long, Integer> rest = new HashMap<>();
4
5        long v = Math.abs((long) numerator) / Math.abs((long) denominator);
6        long r = (long) numerator % (long) denominator;
7
8        if (numerator == 0) return "0";
9
10        if (r == 0) return ((numerator < 0) ^ (denominator < 0) ? "-" : "") + v;
11
12        rest.put(r, 0);
13        StringBuilder sb = new StringBuilder();
14        int i = 1;
15
16        while (r != 0) {
17            r *= 10;
18            long tmp = Math.abs((long) r) / Math.abs((long) denominator);
19            r = r % denominator;
20
21            sb.append("" + tmp);
22
23            if (rest.get(r) != null) {
24                sb.insert((int) rest.get(r), '(');
25                sb.append(')');
26                break;
27            }
28
29            rest.put(r, i);
30            i++;
31        }
32
33        return ((numerator < 0) ^ (denominator < 0) ? "-" : "") + v + "." + sb.toString();
34    }
35}