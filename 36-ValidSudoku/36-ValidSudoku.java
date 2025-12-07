// Last updated: 07/12/2025 10:59:39
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        HashSet<Character>[] rows = new HashSet[9];
4        HashSet<Character>[] cols = new HashSet[9];
5        HashSet<Character>[] boxes = new HashSet[9];
6
7        for (int i = 0; i < 9; i++) {
8            rows[i] = new HashSet<>();
9            cols[i] = new HashSet<>();
10            boxes[i] = new HashSet<>();
11        }
12
13        for (int i = 0; i < 9; i++) {
14            for (int j = 0; j < 9; j++) {
15                char c = board[i][j];
16                if (c == '.') continue;
17
18                int boxIdx = (i / 3) * 3 + (j / 3);
19
20                if (rows[i].contains(c) || cols[j].contains(c) || boxes[boxIdx].contains(c)) {
21                    return false;
22                }
23
24                rows[i].add(c);
25                cols[j].add(c);
26                boxes[boxIdx].add(c);
27            }
28        }
29
30        return true;
31    }
32}