// Last updated: 30/07/2026, 22:22:01
class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> res = new ArrayList<>();

        // for (int[] querie : queries) {
        //     if (querie[0] == querie[1]) {
        //         res.add(true);
        //         continue;
        //     }

        //     Map<Character, Integer> map = new HashMap<>();

        //     for (int i = querie[0]; i <= querie[1]; i++) {
        //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        //     }

        //     int c = 0;
        //     for (int val : map.values()) {
        //         if (val % 2 > 0) c++;
        //     }

        //     if ((querie[1] - querie[0] + 1) % 2 > 0) {
        //         res.add(c - querie[2]*2 <= 1 ? true : false);
        //     } else {
        //         res.add(c - querie[2]*2 < 1 ? true : false);
        //     }
        // }

        // return res;

        int[] prefix = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            prefix[i+1] = prefix[i] ^ (1 << (s.charAt(i) - 'a'));
        }


        for (int[] querie : queries) {
            int bitmask = prefix[querie[1]+1] ^ prefix[querie[0]];

            res.add(Integer.bitCount(bitmask) / 2 <= querie[2]);
        }

        return res;
    }
}