// Last updated: 23/05/2025 19:56:02
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> winners = new HashMap<>();
        
        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            winners.put(winner, winners.getOrDefault(winner, 0));
            int loser = matches[i][1];
            winners.put(loser, winners.getOrDefault(loser, 0) - 1);
        }
        
        List<Integer> w1 = new ArrayList<>();
        List<Integer> w2 = new ArrayList<>();
        
        for (int key: winners.keySet()) {
            if (winners.get(key) == 0) {
                w1.add(key);
            } else if (winners.get(key) == -1) {
                w2.add(key);
            }
        }
        
        Collections.sort(w1);
        Collections.sort(w2);
        
        List<List<Integer>> res = new ArrayList<>();
        res.add(w1);
        res.add(w2);
        
        return res;
    }
}