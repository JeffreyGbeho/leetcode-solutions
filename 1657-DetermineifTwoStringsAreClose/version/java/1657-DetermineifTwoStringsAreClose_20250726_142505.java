// Last updated: 26/07/2025 14:25:05
/*
 * O(n+m)
 * 
 * A refaire, j'ai galéré parce que je me suis concentré sur l'utilisation de map et set
*/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        if(word1.length() != word2.length())
        return false;
        for(char ch:word1.toCharArray()){
            arr1[ch-'a'] ++;
        }
        for(char ch:word2.toCharArray()){
            arr2[ch-'a'] ++;
        }
        for(int i = 0; i< 26; i++){
            if((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0))
            return false; 
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}