// Last updated: 20/05/2025 22:55:38
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