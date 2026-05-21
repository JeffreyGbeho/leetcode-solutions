// Last updated: 21/05/2026, 11:42:28
1class Solution {
2    public String getHint(String secret, String guess) {
3        int bulls = 0;
4        int cows = 0;
5
6        Map<Character, Integer> mapS = new HashMap<>();
7        Map<Character, Integer> mapG = new HashMap<>();
8        for (int i = 0; i < secret.length(); i++) {
9            if (secret.charAt(i) == guess.charAt(i)) {
10                bulls++;
11            } else {
12                if (mapG.get(secret.charAt(i)) != null) {
13                    cows++;
14                    if (mapG.get(secret.charAt(i)) == 1) mapG.remove(secret.charAt(i));
15                    else mapG.put(secret.charAt(i), mapG.get(secret.charAt(i)) - 1);
16                } else { 
17                    mapS.put(secret.charAt(i), mapS.getOrDefault(secret.charAt(i), 0) + 1);
18                }
19
20                if (mapS.get(guess.charAt(i)) != null) {
21                    cows++;
22                    if (mapS.get(guess.charAt(i)) == 1) mapS.remove(guess.charAt(i));
23                    else mapS.put(guess.charAt(i), mapS.get(guess.charAt(i)) - 1);
24                } else {
25                    mapG.put(guess.charAt(i), mapG.getOrDefault(guess.charAt(i), 0) + 1);
26                }
27            }
28        }
29
30        return "" + bulls + "A" + cows + "B";
31    }
32}