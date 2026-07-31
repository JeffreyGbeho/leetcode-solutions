// Last updated: 30/07/2026, 22:23:23
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        Map<Long, Integer> rest = new HashMap<>();

        long v = Math.abs((long) numerator) / Math.abs((long) denominator);
        long r = (long) numerator % (long) denominator;


        if (r == 0) return ((numerator < 0) ^ (denominator < 0) ? "-" : "") + v;

        rest.put(r, 0);
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (r != 0) {
            r *= 10;
            long tmp = Math.abs((long) r) / Math.abs((long) denominator);
            r = r % denominator;

            sb.append("" + tmp);

            if (rest.get(r) != null) {
                sb.insert((int) rest.get(r), '(');
                sb.append(')');
                break;
            }

            rest.put(r, i);
            i++;
        }

        return ((numerator < 0) ^ (denominator < 0) ? "-" : "") + v + "." + sb.toString();
    }
}