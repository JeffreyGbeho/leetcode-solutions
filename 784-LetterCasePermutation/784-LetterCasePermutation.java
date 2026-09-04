// Last updated: 03/09/2026, 22:07:20
1class Solution {
2     public List<String> letterCasePermutation(String S) {
3        List<String> ans = new ArrayList<>();
4        backtrack(ans, 0, S.toCharArray());
5        return ans;
6    }
7    public void backtrack(List<String> ans, int i, char[] S){
8        if(i==S.length)
9            ans.add(new String(S));
10        else{
11            if(Character.isLetter(S[i])){ //If it's letter
12                S[i] = Character.toUpperCase(S[i]);
13                backtrack(ans, i+1, S); //Upper case branch
14                S[i] = Character.toLowerCase(S[i]);
15                backtrack(ans, i+1, S); //Lower case branch
16            }
17            else
18                backtrack(ans, i+1, S); 
19        }
20    }
21}