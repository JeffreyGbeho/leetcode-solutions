// Last updated: 30/07/2026, 22:23:02
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapG = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                if (mapG.get(secret.charAt(i)) != null) {
                    cows++;
                    if (mapG.get(secret.charAt(i)) == 1) mapG.remove(secret.charAt(i));
                    else mapG.put(secret.charAt(i), mapG.get(secret.charAt(i)) - 1);
                } else { 
                    mapS.put(secret.charAt(i), mapS.getOrDefault(secret.charAt(i), 0) + 1);
                }

                if (mapS.get(guess.charAt(i)) != null) {
                    cows++;
                    if (mapS.get(guess.charAt(i)) == 1) mapS.remove(guess.charAt(i));
                    else mapS.put(guess.charAt(i), mapS.get(guess.charAt(i)) - 1);
                } else {
                    mapG.put(guess.charAt(i), mapG.getOrDefault(guess.charAt(i), 0) + 1);
                }
            }
        }

        return "" + bulls + "A" + cows + "B";
    }
}