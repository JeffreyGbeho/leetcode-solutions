// Last updated: 21/05/2026, 11:13:51
1class Solution {
2    public String fractionToDecimal(int numerator, int denominator) {
3        if (numerator == 0) return "0";
4        
5        Map<Long, Integer> rest = new HashMap<>();
6
7        long v = Math.abs((long) numerator) / Math.abs((long) denominator);
8        long r = (long) numerator % (long) denominator;
9
10
11        if (r == 0) return ((numerator < 0) ^ (denominator < 0) ? "-" : "") + v;
12
13        rest.put(r, 0);
14        StringBuilder sb = new StringBuilder();
15        int i = 1;
16
17        while (r != 0) {
18            r *= 10;
19            long tmp = Math.abs((long) r) / Math.abs((long) denominator);
20            r = r % denominator;
21
22            sb.append("" + tmp);
23
24            if (rest.get(r) != null) {
25                sb.insert((int) rest.get(r), '(');
26                sb.append(')');
27                break;
28            }
29
30            rest.put(r, i);
31            i++;
32        }
33
34        return ((numerator < 0) ^ (denominator < 0) ? "-" : "") + v + "." + sb.toString();
35    }
36}