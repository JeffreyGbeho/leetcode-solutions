// Last updated: 23/05/2025 19:47:41
class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            count.put(text.charAt(i), count.getOrDefault(text.charAt(i), 0) + 1);
        }
        
        int t = 7;
        String balloon = "balloon";
        int res = Integer.MAX_VALUE;
        for (char letter : count.keySet()) {
            if (letter == 'l' || letter == 'o') {
                t -= 2;
                res = Math.min(res, count.get(letter) / 2);
            } else if (balloon.indexOf(letter) != -1) {
                t--;
                res = Math.min(res, count.get(letter));
            }
        }
        
        System.out.println(t);
        
        if (t > 0) {
            return 0;
        }
        
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}