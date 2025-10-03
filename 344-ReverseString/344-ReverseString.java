// Last updated: 03/10/2025 19:43:38
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            
            left++;
            right--;
        }
    }
}