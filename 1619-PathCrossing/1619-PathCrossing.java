// Last updated: 23/05/2025 19:55:55
class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        set.add(new Pair<Integer, Integer>(x, y));

        for (char letter : path.toCharArray()) {
            if (letter == 'N') {
                y += 1;
            } else if (letter == 'S') {
                y -= 1;
            } else if (letter == 'E') {
                x += 1;
            } else if (letter == 'W') {
                x -= 1;
            }

            Pair<Integer, Integer> current = new Pair<Integer, Integer>(x, y);

            if (set.contains(current)) {
                return true;
            }

            set.add(current);
        }

        return false;
        
    }
}