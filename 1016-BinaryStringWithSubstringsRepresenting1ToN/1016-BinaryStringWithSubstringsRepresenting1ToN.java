// Last updated: 29/11/2025 10:34:52
1class Solution {
2    public boolean queryString(String s, int n) {
3        for(int i=1;i<=n;i++){
4            String bin = Integer.toBinaryString(i);
5            if(!s.contains(bin)){
6                return false;
7            }
8        }
9        return true;
10    }
11}