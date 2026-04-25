// Last updated: 25/04/2026, 11:10:30
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for (int i = 0; i < board.length; i++) {
4            for (int j = 0; j < board[i].length; j++) {
5                if (backtracking(i, j, board, word, 0)) return true;
6            }
7        }
8
9        return false;
10    }
11
12    private boolean backtracking(int m, int n, char[][] board, String word, int wordIndex) {
13        if (wordIndex == word.length()) return true;
14
15        if (m < 0 || n < 0 || m >= board.length || n >= board[0].length) {
16            return false;
17        }
18        
19        if (board[m][n] != word.charAt(wordIndex)) return false;
20
21        char c = board[m][n];
22        board[m][n] = '#';
23
24        if (backtracking(m-1, n, board, word, wordIndex + 1)) return true;
25        if (backtracking(m, n-1, board, word, wordIndex + 1)) return true;
26        if (backtracking(m+1, n, board, word, wordIndex + 1)) return true;
27        if (backtracking(m, n+1, board, word, wordIndex + 1)) return true;
28
29        board[m][n] = c;
30
31        return false;
32    }
33}