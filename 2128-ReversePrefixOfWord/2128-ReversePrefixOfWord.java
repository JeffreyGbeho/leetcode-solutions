// Last updated: 23/05/2025 19:47:18
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int right = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                right = i;
                break;
            }
        }

        int left = 0;
        while (left < right) {
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}