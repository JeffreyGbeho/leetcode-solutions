// Last updated: 06/12/2025 14:17:52
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> res = new ArrayList<>();
4
5        for (int i = 0; i < strs.length; i++) {
6            if (strs[i] == null) {
7                continue;
8            }
9            HashMap<Character, Integer> an = new HashMap<>();
10            for (Character c : strs[i].toCharArray()) {
11                an.put(c, an.getOrDefault(c, 0) + 1);
12            }
13
14            List<String> r = new ArrayList<>();
15            r.add(strs[i]);
16            for (int j = i+1; j < strs.length; j++) {
17                if (strs[j] == null || strs[i].length() != strs[j].length()) {
18                    continue;
19                }
20                HashMap<Character, Integer> map = new HashMap<>();
21                map.putAll(an);
22                boolean test = true;
23                for (Character c : strs[j].toCharArray()) {
24                    if (!map.containsKey(c)) {
25                        test = false;
26                        break;
27                    } else {
28                        map.put(c, map.get(c) -1);
29                        if (map.get(c) <= 0) {
30                            map.remove(c);
31                        }
32                    }
33                }
34
35                if (test && map.size() == 0) {
36                    r.add(strs[j]);
37                    strs[j] = null;
38                }
39            }
40
41            res.add(r);
42        }
43
44        return res;
45    }
46}