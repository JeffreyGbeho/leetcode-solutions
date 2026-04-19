// Last updated: 19/04/2026, 18:46:56
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for (String str : strs) {
6            char[] c = str.toCharArray();
7            Arrays.sort(c);
8            String sorted = new String(c);
9
10            List<String> ls = map.getOrDefault(sorted, new ArrayList<>());
11            ls.add(str);
12            map.put(sorted, ls);
13        }
14
15        List<List<String>> res = new ArrayList<>();
16        for (List<String> value : map.values()) {
17            res.add(value);
18        }
19
20        return res;
21    }
22}