// Last updated: 23/05/2025 19:56:23
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