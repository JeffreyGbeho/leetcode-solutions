// Last updated: 15/05/2026, 12:41:32
1class Solution {
2    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
3        List<Boolean> res = new ArrayList<>();
4
5        // for (int[] querie : queries) {
6        //     if (querie[0] == querie[1]) {
7        //         res.add(true);
8        //         continue;
9        //     }
10
11        //     Map<Character, Integer> map = new HashMap<>();
12
13        //     for (int i = querie[0]; i <= querie[1]; i++) {
14        //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
15        //     }
16
17        //     int c = 0;
18        //     for (int val : map.values()) {
19        //         if (val % 2 > 0) c++;
20        //     }
21
22        //     if ((querie[1] - querie[0] + 1) % 2 > 0) {
23        //         res.add(c - querie[2]*2 <= 1 ? true : false);
24        //     } else {
25        //         res.add(c - querie[2]*2 < 1 ? true : false);
26        //     }
27        // }
28
29        // return res;
30
31        int[] prefix = new int[s.length()+1];
32        for (int i = 0; i < s.length(); i++) {
33            prefix[i+1] = prefix[i] ^ (1 << (s.charAt(i) - 'a'));
34        }
35
36
37        for (int[] querie : queries) {
38            int bitmask = prefix[querie[1]+1] ^ prefix[querie[0]];
39
40            res.add(Integer.bitCount(bitmask) / 2 <= querie[2]);
41        }
42
43        return res;
44    }
45}